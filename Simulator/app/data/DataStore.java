package data;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Singleton;

import java.util.HashMap;
import java.util.List;

/**
 * Created by egnaro on 12/12/16.
 */

class Result{

    private int statusCode;

    private JsonNode returnJSON;

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public JsonNode getReturnJSON() {
        return returnJSON;
    }

    public void setReturnJSON(JsonNode returnJSON) {
        this.returnJSON = returnJSON;
    }
}

@Singleton
public class DataStore {

    private HashMap<String,List<String>> methodToURI = new HashMap<>();

    private HashMap<String,List<JsonNode>> uriToJsonInRequestBody = new HashMap<>();

    private HashMap<Integer,Result> hashToResult = new HashMap<>();

    public void setMethodToURI(HashMap<String, List<String>> methodToURI) {
        this.methodToURI = methodToURI;
    }

    public void setUriToJsonInRequestBody(HashMap<String, List<JsonNode>> uriToJsonInRequestBody) {
        this.uriToJsonInRequestBody = uriToJsonInRequestBody;
    }

    public void setHashToResult(HashMap<Integer, Result> hashToResult) {
        this.hashToResult = hashToResult;
    }

    public HashMap<String, List<String>> getMethodToURI() {
        return methodToURI;
    }

    public HashMap<String, List<JsonNode>> getUriToJsonInRequestBody() {
        return uriToJsonInRequestBody;
    }

    public HashMap<Integer, Result> getHashToResult() {
        return hashToResult;
    }
}
