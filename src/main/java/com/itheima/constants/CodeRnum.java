package com.itheima.constants;


public enum  CodeRnum {

    OK(0,"OK"),
    FAIL(500, "sever error");

    private Integer code;
    private String message;

    CodeRnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }


}
