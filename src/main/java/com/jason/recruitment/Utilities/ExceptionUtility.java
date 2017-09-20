package com.jason.recruitment.Utilities;

import com.jason.recruitment.domain.Message;
import com.jason.recruitment.exception.ErrorException;
import com.jason.recruitment.exception.StatusCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Jason on 20/09/2017.
 */
public class ExceptionUtility {

    private final static Logger logger = LoggerFactory.getLogger(ExceptionUtility.class);

    public static Message handlerExceptionToErrorMessage(RuntimeException runtimeException) {
        Message errorMessage = new Message();

        logger.info(runtimeException.getMessage());

        if (runtimeException instanceof ErrorException) {
            errorMessage.setCode(((ErrorException) runtimeException).getCode());
            errorMessage.setMessage(runtimeException.getMessage());
        } else {
            errorMessage.setCode(StatusCode.UNKNOWN.getCode());
            errorMessage.setMessage(StatusCode.UNKNOWN.getMessage());
        }

        return errorMessage;
    }
}
