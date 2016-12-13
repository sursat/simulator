package com.egnaro.common.utils;

import com.egnaro.common.constants.Constants;
import com.egnaro.entities.APIConfigData;

/**
 * Created by prasad on 12/13/16.
 */
public class StoreWrapperUtil {

    public static String prepareKey(APIConfigData apiConfigData){
        String method = apiConfigData.getMethod();
        String uri = apiConfigData.getUri();
        boolean isContentTypeApplicable = apiConfigData.getRequestBody().isContentApplicable();
        String contentType = apiConfigData.getRequestBody().getContentType();
        boolean isRequestBodyApplicable = apiConfigData.getRequestBody().isBodyApplicable();
        String requestBody = apiConfigData.getRequestBody().getBody();

        StringBuilder sb = new StringBuilder();
        sb.append(method).append(Constants.STORE_DATA_SEPERATOR)
                .append(uri).append(Constants.STORE_DATA_SEPERATOR)
                .append(isContentTypeApplicable).append(Constants.STORE_DATA_SEPERATOR)
                .append(contentType).append(Constants.STORE_DATA_SEPERATOR)
                .append(isRequestBodyApplicable).append(Constants.STORE_DATA_SEPERATOR)
                .append(requestBody);
        return sb.toString();
    }
}
