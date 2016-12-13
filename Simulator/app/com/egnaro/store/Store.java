package com.egnaro.store;

import com.egnaro.entities.ResponseBody;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by prasad on 12/13/16.
 */

public class Store {

    private ConcurrentHashMap<String,ResponseBody> store = new ConcurrentHashMap<>();

    public ConcurrentHashMap<String, ResponseBody> getStore() {
        return store;
    }

    public void clearAll(){
        store = new ConcurrentHashMap<>();
    }
}
