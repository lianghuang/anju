package com.anju.domain;

/**
 * Created by huangliangliang on 1/31/17.
 */
public class ReturnMsg {
    private String returnCode;
    private String message;
    private Object body;

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }
}
