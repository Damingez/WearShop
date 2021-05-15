package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.exm.Base;

import java.io.IOException;

public class Hooks extends Base {

    @Before
    public void BeforeEach() throws IOException {
        Base.init();
    }

    @After
    public void AfterEach(){
        getDriver().close();
    }


}
