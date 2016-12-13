package com.egnaro.services.Impl;

import com.egnaro.common.utils.StoreWrapperUtil;
import com.egnaro.entities.APIConfigData;
import com.egnaro.entities.ResponseBody;
import com.egnaro.services.API.ConfigService;
import com.egnaro.store.Store;
import com.google.inject.Inject;

/**
 * Created by egnaro on 12/12/16.
 */

public class ConfigServiceImpl implements ConfigService{

    @Inject
    private Store store;

    @Override
    public void addAPIConfig(APIConfigData apiConfigData) {
        String key = StoreWrapperUtil.prepareKey(apiConfigData);
        ResponseBody responseBody = apiConfigData.getResponseBody();
        store.getStore().put(key,responseBody);
    }

    @Override
    public boolean removeAPIConfig(APIConfigData apiConfigData) {
        String key = StoreWrapperUtil.prepareKey(apiConfigData);
        if(!store.getStore().contains(key))
            return false;
        store.getStore().remove(key);
        return true;
    }
}
