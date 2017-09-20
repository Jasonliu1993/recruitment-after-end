package com.jason.recruitment.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by Jason on 18/09/2017.
 */

@Aspect
@Component
public class Log {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Pointcut("execution(public * com.jason.recruitment.serviceImpl.LoginServiceImpl.* (..))")
    public void logPointCut(){

    }

    @Before("logPointCut()")
    public void begin(){
        logger.info("This is begin!");
    }

    @After("logPointCut()")
    public void end(){
        logger.info("This is end!");
    }
}
