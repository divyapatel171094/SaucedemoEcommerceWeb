package Base;

import org.testng.annotations.BeforeTest;

public class urlSetup extends driverSetup{
    public  String url=null;
    @BeforeTest
    public void setupUrl(){
        driver.get(url);
    }
}
