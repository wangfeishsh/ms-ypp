package com.ypp.common;

/**
 * Created by nannan on 2017/6/9.
 */
public enum BusinessCode implements BaseCode {

    SUCCESS("200", "SUCCESS");

    private BusinessCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    private String code;
    private String message;

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
