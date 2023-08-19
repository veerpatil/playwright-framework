package com.playwrightdemo.playwrightframework.page;


import org.springframework.stereotype.Component;

@Component
public class DashboardPage extends BasePage{

    private static final String title ="div[class='content-header'] h1";

    public String getTitle()
    {
       return this.page.locator(title).textContent();
    }
}
