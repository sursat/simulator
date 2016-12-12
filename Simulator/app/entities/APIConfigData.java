package entities;

import com.fasterxml.jackson.databind.JsonNode;

/**
 * Created by egnaro on 12/12/16.
 */
public class APIConfigData {

    private String method;

    private String uri;

    private int statusCode;

    private boolean isJSONRequiredInRequest;

    private JsonNode jSONInRequest;

    private boolean isJSONRequiredInResponse;

    private JsonNode jSONInResponse;

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        if(Method.isMember(method))
            this.method = method;
        else
            throw new ClassCastException();
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        if(uri == null || uri.isEmpty())
            throw new ClassCastException();
        if(uri.split("/").length <= 4)
            this.uri = uri;
        else
            throw new ClassCastException();
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        if(StatusCode.isMember(statusCode))
            this.statusCode = statusCode;
        else
            throw new ClassCastException();
    }

    public boolean isJSONRequiredInRequest() {
        return isJSONRequiredInRequest;
    }

    public void setJSONRequiredInRequest(boolean JSONRequiredInRequest) {
        isJSONRequiredInRequest = JSONRequiredInRequest;
    }

    public JsonNode getjSONInRequest() {
        return jSONInRequest;
    }

    public void setjSONInRequest(JsonNode jSONInRequest) {
        this.jSONInRequest = jSONInRequest;
    }

    public boolean isJSONRequiredInResponse() {
        return isJSONRequiredInResponse;
    }

    public void setJSONRequiredInResponse(boolean JSONRequiredInResponse) {
        isJSONRequiredInResponse = JSONRequiredInResponse;
    }

    public JsonNode getjSONInResponse() {
        return jSONInResponse;
    }

    public void setjSONInResponse(JsonNode jSONInResponse) {
        this.jSONInResponse = jSONInResponse;
    }
}
