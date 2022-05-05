package Object;

import Base.driverSetup;
import org.openqa.selenium.By;

public class login extends driverSetup {
    String usernameXpath="//input[@id='user-name']";
    String PasswordXpath="//input[@id='password']";


public void login(String Username){
    driver.findElement(By.xpath(usernameXpath)).sendKeys(Username);
}
}
