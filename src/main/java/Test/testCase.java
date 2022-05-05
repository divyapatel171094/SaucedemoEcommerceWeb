package Test;

import Base.urlSetup;
import org.testng.annotations.Test;

public class testCase extends urlSetup {
    login lg = new login();
    String Username= "standard_user";
    
    public testCase(){
        url="https://www.saucedemo.com/";
    }


    @Test
public void login(){


    }
}