package Base;

import Object1.LoginObj;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class driverSetup extends ObjectRepo{
    public static WebDriver driver = null;

    public  driverSetup(){
        if(driver==null){
            setup();
            driver.manage().window().maximize();
        }
    }
    public  String url=null;
    @BeforeTest
    public void setupUrl(){
        driver.get(url);
    }

    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        login= new LoginObj();

    }

}
