package com.egnaro.services.Impl;

import com.egnaro.entities.APIConfigData;
import com.egnaro.entities.ResponseBody;
import com.egnaro.services.API.ConfigService;
import com.egnaro.services.StoreWrapperService;
import com.egnaro.store.Store;
import com.google.inject.Inject;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * Created by egnaro on 12/12/16.
 */

public class ConfigServiceImpl implements ConfigService{

    @Inject
    private Store store;

    @Inject
    private StoreWrapperService storeWrapperService;

    @Override
    public void addAPIConfig(APIConfigData apiConfigData) {
        String key = storeWrapperService.prepareKey(apiConfigData);
        ResponseBody responseBody = apiConfigData.getResponseBody();
        store.getStore().put(key,responseBody);
    }

    @Override
    public boolean removeAPIConfig(APIConfigData apiConfigData) {
        String key = storeWrapperService.prepareKey(apiConfigData);
        if(!store.getStore().contains(key))
            return false;
        store.getStore().remove(key);
        return true;
    }

    @Override
    public List<APIConfigData> getAllAPIs() {
        Enumeration<String> keys = store.getStore().keys();
        List<APIConfigData> apiConfigDataList = new ArrayList<>();
        while (keys.hasMoreElements())
            apiConfigDataList.add(storeWrapperService.getApiConfigData(keys.nextElement()));
        return apiConfigDataList;
    }
}
