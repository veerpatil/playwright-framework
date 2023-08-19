package com.playwrightdemo.playwrightframework.page;
import com.microsoft.playwright.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class LoginPage  extends BasePage{



    private static final String emailLocator = "#Email";

    private static final String passwordLocator="#Password";

    private static final String loginButton="button[type='submit']";


     public void setEmail(String email)
     {
        this.page.locator(emailLocator).clear();
        this.page.locator(emailLocator).type(email);
    }

    public void setPassword(String password) {
        this.page.locator(passwordLocator).clear();
        this.page.locator(passwordLocator).type(password);
    }

    public void performLogin() {
        this.page.locator(loginButton).click();
    }


}
