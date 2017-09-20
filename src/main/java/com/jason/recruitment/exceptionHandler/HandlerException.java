package com.jason.recruitment.exceptionHandler;

import com.jason.recruitment.Utilities.ExceptionUtility;
import com.jason.recruitment.domain.Message;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Jason on 20/09/2017.
 */

@ControllerAdvice
public class HandlerException {

    @ExceptionHandler(value = RuntimeException.class)
    @ResponseBody
    public Message handlerExcept(RuntimeException runtimeException) {
        return ExceptionUtility.handlerExceptionToErrorMessage(runtimeException);
    }
}
