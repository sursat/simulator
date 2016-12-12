package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import play.libs.Json;
import play.mvc.Controller;
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
    public Result index() {return ok();}

    public Result getLevel1(String level1){
        System.out.println("In Level 1 method");
        System.out.println("URI: "+request().remoteAddress()+"/"+ level1);
        return ok();
    }

    public Result getLevel2(String level1,String level2){
        System.out.println("In Level 2 method");
        System.out.println("URI: "+request().remoteAddress()+"/"+ level1+"/"+level2);
        return ok();
    }

    public Result getLevel3(String level1,String level2,String level3){
        System.out.println("In Level 3 method");
        System.out.println("URI: "+request().remoteAddress()+"/"+ level1+"/"+level2+"/"+level3);
        return ok();
    }

    public Result getLevel4(String level1,String level2,String level3,String level4){
        System.out.println("In Level 4 method");
        System.out.println("URI: "+request().remoteAddress()+"/"+ level1+"/"+level2+"/"+level3+"/"+level4);
        return ok();
    }

    public Result test(){
        ObjectNode node = Json.newObject();
        node.put("Name","Prasad");
        node.put("Occupation","Software Engineer");
        ObjectNode node2 = Json.newObject();
        node2.put("Occupation","Software Engineer");
        node2.put("Name","Prasad");
        if(node.equals(node2))
            return ok("ok");
        else
            return badRequest("bad request");
    }
}
