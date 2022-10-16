import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class BaseTests {

    WebBase base = new WebBase();

@BeforeTest
    public void initiateDriver(){
        base.launchBrowser("chrome");
}

@AfterTest
    public void closeWindow(){
    base.tearDown();
    }



}
