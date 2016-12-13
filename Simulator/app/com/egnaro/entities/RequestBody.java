package com.egnaro.entities;

/**
 * Created by prasad on 12/13/16.
 */
public class RequestBody {

    private String contentType;
    private boolean isBodyApplicable;
    private String body;


    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public boolean isBodyApplicable() {
        return isBodyApplicable;
    }

    public void setBodyApplicable(boolean bodyApplicable) {
        isBodyApplicable = bodyApplicable;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
