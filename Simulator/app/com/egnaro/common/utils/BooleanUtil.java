package com.egnaro.common.utils;

import com.egnaro.entities.Method;

/**
 * Created by egnaro on 13/12/16.
 */
public class BooleanUtil {

    public static boolean isRequestBodyApplicable(String rESTMethod){
        if(rESTMethod == null || rESTMethod.isEmpty())
            return false;
        else if(rESTMethod.equals(Method.GET.toString()))
            return false;
        return true;
    }
}
