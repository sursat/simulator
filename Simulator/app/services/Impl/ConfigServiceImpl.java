package services.Impl;

import entities.APIConfigData;
import services.API.ConfigService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by egnaro on 12/12/16.
 */

public class ConfigServiceImpl implements ConfigService{

    @Override
    public void addAPIConfig(APIConfigData apiConfigData) {

        apiConfigData.getMethod();
    }
}
