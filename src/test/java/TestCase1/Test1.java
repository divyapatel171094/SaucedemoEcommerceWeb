package TestCase1;

import Base.driverSetup;
import org.testng.annotations.Test;

public class Test1 extends driverSetup {
    String Username= "standard_user";
    String Password= "secret_sauce";

    public Test1(){
        url="https://www.saucedemo.com/";
    }

    @Test
    public void loginDetails(){
        login.loginDetails1(Username,Password);

    }

}
