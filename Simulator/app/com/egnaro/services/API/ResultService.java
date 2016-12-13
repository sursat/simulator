package com.egnaro.services.API;

import com.egnaro.entities.ResponseBody;
import com.egnaro.services.Impl.ResultServiceImpl;
import com.google.inject.ImplementedBy;
import play.mvc.Result;

/**
 * Created by egnaro on 13/12/16.
 */

@ImplementedBy(ResultServiceImpl.class)
public interface ResultService {
    Result returnResult(ResponseBody responseBody);

}
