package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.CommonMethods;

public class hooks extends CommonMethods {


    @Before
    public void start(){
        openBrowserAndLaunchApplication();
    }

//    @After
//    public void end(Scenario scenario){
//
//        closeBrowser();
//    }
}