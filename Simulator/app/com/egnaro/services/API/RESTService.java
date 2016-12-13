package com.egnaro.services.API;

import com.egnaro.services.Impl.RESTServiceImpl;
import com.google.inject.ImplementedBy;
import play.mvc.Http;
import play.mvc.Result;

import java.util.List;

/**
 * Created by egnaro on 13/12/16.
 */

@ImplementedBy(RESTServiceImpl.class)
public interface RESTService {

    Result process(Http.Request request);
}
