
package controllers;

import com.egnaro.services.API.ConfigService;
import com.egnaro.store.Store;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;
import com.google.inject.Inject;
import com.egnaro.entities.APIConfigData;
import play.mvc.Controller;
import play.mvc.Result;

/**
 * Created by egnaro on 12/12/16.
 */
public class ConfigController extends Controller{

    @Inject
    private Gson gson;

    @Inject
    private ConfigService configService;

    @Inject
    private Store store;

    public Result addAPI(){
        JsonNode node = request().body().asJson();
        APIConfigData apiConfigData = gson.fromJson(node.toString(), APIConfigData.class);
        configService.addAPIConfig(apiConfigData);
        return ok();
    }

    public Result removeAPI(){
        JsonNode node = request().body().asJson();
        APIConfigData apiConfigData = gson.fromJson(node.toString(), APIConfigData.class);
        if(configService.removeAPIConfig(apiConfigData))
            return ok();
        else
            return notFound();
    }

    public Result listAllAPIs(){
        return ok(gson.toJson(configService.getAllAPIs()));
    }
}
