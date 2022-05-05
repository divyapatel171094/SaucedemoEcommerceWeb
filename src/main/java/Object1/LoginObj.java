package Object1;

import Base.driverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class LoginObj extends driverSetup {

    String usernameXpath="//input[@id='user-name']";
    String PasswordXpath="//input[@id='password']";
    String LoginButtonXpath="//input[@id='login-button']";


    public void loginDetails1(String Username, String Password){
        driver.findElement(By.xpath(usernameXpath)).sendKeys(Username);
        driver.findElement(By.xpath(PasswordXpath)).sendKeys(Password);
        driver.findElement(By.xpath(LoginButtonXpath)).click();
    }
    public LoginObj() {
        PageFactory.initElements(driver, this);
    }

}
