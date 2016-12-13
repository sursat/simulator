package com.egnaro.store;

import com.egnaro.entities.ResponseBody;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by prasad on 12/13/16.
 */

@Singleton
public class Store {

    private ConcurrentHashMap<String,ResponseBody> store = new ConcurrentHashMap<>();

    public ConcurrentHashMap<String, ResponseBody> getStore() {
        return store;
    }

    public boolean isKeyExist(String key){
        return store.containsKey(key);}

    public void clearAll(){
        store = new ConcurrentHashMap<>();
    }
}
