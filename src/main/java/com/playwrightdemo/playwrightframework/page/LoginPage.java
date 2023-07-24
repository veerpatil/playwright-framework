package com.playwrightdemo.playwrightframework.page;
import org.springframework.stereotype.Component;


@Component
public class LoginPage  extends BasePage{
 


    private String emailLocator = "#Email";
    public void goTo()
    {
        this.page.navigate("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
    }
     public void getLogin()
     {
        this.page.locator(emailLocator).clear();
        this.page.locator(emailLocator).type("admin@yourstore.com");     
    }

}
