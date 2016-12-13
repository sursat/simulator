package com.egnaro.services.Impl;

import com.egnaro.entities.ResponseBody;
import com.egnaro.services.API.RESTService;
import com.egnaro.services.API.ResultService;
import com.egnaro.services.StoreWrapperService;
import com.egnaro.store.Store;
import com.google.inject.Inject;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.Results;

/**
 * Created by egnaro on 13/12/16.
 */

public class RESTServiceImpl implements RESTService{

    @Inject
    private Store store;

    @Inject
    private ResultService resultService;

    @Inject
    private StoreWrapperService storeWrapperService;

    @Override
    public Result process(Http.Request request) {
        String key = storeWrapperService.prepareKey(request);
        if(!store.isKeyExist(key))
            return Results.internalServerError();
        ResponseBody responseBody = store.getStore().get(key);
        return resultService.returnResult(responseBody);
    }
}
