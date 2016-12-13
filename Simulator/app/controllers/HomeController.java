package controllers;

import com.egnaro.services.API.RESTService;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.inject.Inject;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */

    @Inject
    private RESTService restService;

    public Result index() {return ok();}

    public Result getLevel1(String level1){
        return restService.process(request());
    }

    public Result getLevel2(String level1,String level2){
        return restService.process(request());
    }

    public Result getLevel3(String level1,String level2,String level3){
        return restService.process(request());
    }

    public Result getLevel4(String level1,String level2,String level3,String level4){
        return restService.process(request());
    }

    public Result getLevel5(String level1,String level2,String level3,String level4,String level5){
        return restService.process(request());
    }

    public Result getLevel6(String level1,String level2,String level3,String level4,String level5,String level6){
        return restService.process(request());
    }

    public Result postLevel1(String level1){
        return restService.process(request());
    }

    public Result postLevel2(String level1,String level2){
        return restService.process(request());
    }

    public Result postLevel3(String level1,String level2,String level3){
        return restService.process(request());
    }

    public Result postLevel4(String level1,String level2,String level3,String level4){
        return restService.process(request());
    }

    public Result postLevel5(String level1,String level2,String level3,String level4,String level5){
        return restService.process(request());
    }

    public Result postLevel6(String level1,String level2,String level3,String level4,String level5,String level6){
        return restService.process(request());
    }

    public Result putLevel1(String level1){
        return restService.process(request());
    }

    public Result putLevel2(String level1,String level2){
        return restService.process(request());
    }

    public Result putLevel3(String level1,String level2,String level3){
        return restService.process(request());
    }

    public Result putLevel4(String level1,String level2,String level3,String level4){
        return restService.process(request());
    }

    public Result putLevel5(String level1,String level2,String level3,String level4,String level5){
        return restService.process(request());
    }

    public Result putLevel6(String level1,String level2,String level3,String level4,String level5,String level6){
        return restService.process(request());
    }

    public Result deleteLevel1(String level1){
        return restService.process(request());
    }

    public Result deleteLevel2(String level1,String level2){
        return restService.process(request());
    }

    public Result deleteLevel3(String level1,String level2,String level3){
        return restService.process(request());
    }

    public Result deleteLevel4(String level1,String level2,String level3,String level4){
        return restService.process(request());
    }

    public Result deleteLevel5(String level1,String level2,String level3,String level4,String level5){
        return restService.process(request());
    }

    public Result deleteLevel6(String level1,String level2,String level3,String level4,String level5,String level6){
        return restService.process(request());
    }



    public Result test(){
        ObjectNode node = Json.newObject();
        node.put("Name","Prasad");
        node.put("Occupation","Software Engineer");
        ObjectNode node2 = Json.newObject();
        node2.put("Occupation","Software Engineer");
        node2.put("Name","Prasad");
        System.out.println(node2.toString());
        System.out.println(Json.parse(node2.toString()));
        if(node.equals(node2))
            return ok("ok");
        else
            return badRequest("bad request");
    }
}
