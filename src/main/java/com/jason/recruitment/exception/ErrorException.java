package com.jason.recruitment.exception;

/**
 * Created by Jason on 20/09/2017.
 */
public class ErrorException extends RuntimeException {
    private Integer code;

    public ErrorException(StatusCode statusCode) {
        super(statusCode.getMessage());
        this.code = statusCode.getCode();
    }

    public Integer getCode() {
        return code;
    }
}
