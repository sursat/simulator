package controllers;

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
        System.out.println("URI: "+request().remoteAddress()+"/"+ level1);
        return ok();
    }

    public Result getLevel2(String level1,String level2){
        System.out.println("URI: "+request().remoteAddress()+"/"+ level1+"/"+level2);
        return ok();
    }

    public Result getLevel3(String level1,String level2,String level3){
        System.out.println("URI: "+request().remoteAddress()+"/"+ level1+"/"+level2+"/"+level3);
        return ok();
    }
}
