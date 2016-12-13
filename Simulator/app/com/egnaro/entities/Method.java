package com.egnaro.entities;

/**
 * Created by egnaro on 12/12/16.
 */
public enum Method {

    GET,POST,PUT,DELETE;

    static public boolean isMember(String value){
        Method[] methods = Method.values();
        for(Method method : methods)
            if(method.toString().equalsIgnoreCase(value))
                return true;
        return false;
    }
}
