package com.jason.recruitment.exception;

/**
 * Created by Jason on 20/09/2017.
 */
public enum StatusCode {

    SUCCESS_CODE(100,"成功"),
    UNKNOWN(-1,"未知错误"),
    INTERNAL_ERROR(101,"内部错误"),
    AUTHENTICATION(102,"认证失败")
    ;

    private Integer code;
    private String message;

    StatusCode(Integer code,String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
