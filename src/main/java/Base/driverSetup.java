package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverSetup {
    public static WebDriver driver = null;
    public  driverSetup(){
        if(driver==null){
            setup();
            driver.manage().window().maximize();
        }
    }
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

}
