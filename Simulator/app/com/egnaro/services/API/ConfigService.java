package com.egnaro.services.API;

import com.google.inject.ImplementedBy;
import com.egnaro.entities.APIConfigData;
import com.egnaro.services.Impl.ConfigServiceImpl;

/**
 * Created by egnaro on 12/12/16.
 */

@ImplementedBy(ConfigServiceImpl.class)
public interface ConfigService {

    void addAPIConfig(APIConfigData apiConfigData);

    boolean removeAPIConfig(APIConfigData apiConfigData);
}
