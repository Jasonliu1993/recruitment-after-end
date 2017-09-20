package com.jason.recruitment.aop;

import com.jason.recruitment.domain.Message;
import com.jason.recruitment.exception.ErrorException;
import com.jason.recruitment.exception.StatusCode;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Jason on 20/09/2017.
 */

@Aspect
@Component
public class CheckAuth {

    @Pointcut("@annotation(com.jason.recruitment.annotation.Authentication)")
    public void pointcut(){

    }

    @Around("pointcut()")
    public Object checkAuth(ProceedingJoinPoint joinPoint) throws Throwable{

        HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();

        String token = (String)request.getParameter("token");

        if ("true".equals(token)) {
            return joinPoint.proceed();
        }
        return new ErrorException(StatusCode.AUTHENTICATION);
    }

}
