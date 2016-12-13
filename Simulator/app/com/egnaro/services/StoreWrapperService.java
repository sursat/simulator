package com.egnaro.services;

import com.egnaro.common.constants.Constants;
import com.egnaro.common.utils.BooleanUtil;
import com.egnaro.entities.*;
import com.egnaro.store.Store;
import com.google.inject.Inject;
import play.mvc.Http;

/**
 * Created by prasad on 12/13/16.
 */
public class StoreWrapperService {

    @Inject
    private Store store;

    public String prepareKey(APIConfigData apiConfigData){
        String method = apiConfigData.getMethod().toUpperCase();
        String uri = apiConfigData.getUri();
        String contentType = null;
        if(method.equals(Method.GET.toString()))
            contentType = ContentType.TEXT.toString();
        else
            contentType = apiConfigData.getRequestBody().getContentType();
        boolean isRequestBodyApplicable = apiConfigData.getRequestBody().isBodyApplicable();
        String requestBody = null;
        if(!isRequestBodyApplicable)
            requestBody = Constants.EMPTY_REQUEST_BODY_DATA;
        else
            requestBody = apiConfigData.getRequestBody().getBody();

        StringBuilder sb = new StringBuilder();
        sb.append(method).append(Constants.STORE_DATA_SEPERATOR)
                .append(uri).append(Constants.STORE_DATA_SEPERATOR)
                .append(contentType).append(Constants.STORE_DATA_SEPERATOR)
                .append(isRequestBodyApplicable).append(Constants.STORE_DATA_SEPERATOR)
                .append(requestBody);
        return sb.toString();
    }


    public String prepareKey(Http.Request request){
        String method = request.method();
        String uri = request.uri();

        String contentType = null;
        if(method.equals(Method.GET.toString()))
            contentType = ContentType.TEXT.toString();
        else
            contentType = request.contentType().get();
        boolean isRequestBodyApplicable = BooleanUtil.isRequestBodyApplicable(method);
        String requestBody = null;
        if(!isRequestBodyApplicable)
            requestBody = Constants.EMPTY_REQUEST_BODY_DATA;
        else
            requestBody = extractRequestBody(request);

        StringBuilder sb = new StringBuilder();
        sb.append(method).append(Constants.STORE_DATA_SEPERATOR)
                .append(uri).append(Constants.STORE_DATA_SEPERATOR)
                .append(contentType).append(Constants.STORE_DATA_SEPERATOR)
                .append(isRequestBodyApplicable).append(Constants.STORE_DATA_SEPERATOR)
                .append(requestBody);
        return sb.toString();
    }


    public String extractRequestBody(Http.Request request){
        String contentType = request.contentType().get();
        ContentType currentContentType = ContentType.valueOf(contentType);
        if(currentContentType.equals(ContentType.TEXTPLAIN )|| currentContentType.equals(ContentType.TEXT))
            return request.body().asText();
        else if(currentContentType.equals(ContentType.JSON))
            return request.body().asJson().toString();
        else
            throw new UnsupportedOperationException();
    }

    public APIConfigData getApiConfigData(String storeKey){
        if(!store.isKeyExist(storeKey))
            return new APIConfigData();
        String values[] = storeKey.split(Constants.STORE_DATA_SEPERATOR);
        String method = values[0];
        String uri = values[1];
        String contentType = values[2];
        boolean isRequestBodyApplicable = Boolean.parseBoolean(values[3]);
        String requestBody = null;
        if(!isRequestBodyApplicable)
            requestBody = Constants.EMPTY_SPACE;
        else
            requestBody = values[4];

        ResponseBody responseBody = store.getStore().get(storeKey);
        RequestBody requestBodyObj = new RequestBody();
        requestBodyObj.setBodyApplicable(isRequestBodyApplicable);
        requestBodyObj.setBody(requestBody);
        requestBodyObj.setContentType(contentType);
        APIConfigData apiConfigData = new APIConfigData();
        apiConfigData.setRequestBody(requestBodyObj);
        apiConfigData.setResponseBody(responseBody);
        apiConfigData.setMethod(method);
        apiConfigData.setUri(uri);
        return apiConfigData;
    }
}
