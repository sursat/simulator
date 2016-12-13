package com.egnaro.entities;

/**
 * Created by prasad on 12/13/16.
 */
public class ResponseBody{
    private int statusCode;
    private boolean isBodyApplicable;
    private String contentType;
    private String body;

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public boolean isBodyApplicable() {
        return isBodyApplicable;
    }

    public void setBodyApplicable(boolean bodyApplicable) {
        isBodyApplicable = bodyApplicable;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
