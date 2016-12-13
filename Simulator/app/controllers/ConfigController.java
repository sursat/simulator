
package controllers;

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

    public Result addAPI(){
        JsonNode node = request().body().asJson();
        APIConfigData apiConfigData = gson.fromJson(node.toString(), APIConfigData.class);
        return ok();
    }

    public Result removeAPI(){
        return ok();
    }
}
