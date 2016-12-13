package com.egnaro.services.Impl;

import com.egnaro.common.constants.Constants;
import com.egnaro.entities.ContentType;
import com.egnaro.entities.ResponseBody;
import com.egnaro.services.API.ResultService;
import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.Results;

/**
 * Created by egnaro on 13/12/16.
 */
public class ResultServiceImpl implements ResultService {
    @Override
    public Result returnResult(ResponseBody responseBody) {
        String contentType = responseBody.getContentType();
        if(!ContentType.isMember(contentType))
            return Results.internalServerError();
        ContentType currentResultContentType = ContentType.of(contentType);
        if(currentResultContentType.equals(ContentType.TEXT) || currentResultContentType.equals(ContentType.TEXTPLAIN))
            return Results.status(responseBody.getStatusCode(),responseBody.getBody());
        else if(currentResultContentType.equals(ContentType.JSON)) {
            JsonNode node = Json.parse(responseBody.getBody());
            return Results.status(responseBody.getStatusCode(), node);
        }
        else
            return Results.status(Http.Status.NOT_FOUND, Constants.CONTENT_TYPE_NOT_SUPPORTED);
        }
}
