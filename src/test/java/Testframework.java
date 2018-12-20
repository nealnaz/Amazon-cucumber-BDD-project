import Baseclass.parent;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Testframework {

    parent pf = new parent();

    @Before
    public void begin(){
        pf.openBrowser();
    }

   @After

public void end(){
    pf.closeBrowser();
   }

}