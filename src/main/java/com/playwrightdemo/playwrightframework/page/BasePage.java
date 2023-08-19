package com.playwrightdemo.playwrightframework.page;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.playwrightdemo.playwrightframework.utility.ScreenShotUtil;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.nio.file.Paths;


@Component
public class BasePage  extends PlayWrightBrowserContext{


  @Autowired
  public Page page;

//  @Autowired
//  public ScreenShotUtil screenShotUtil;

    @Value("${baseUrl}")
    private String URL;
    public void goTo()
    {
        this.page.navigate(URL);
    }


}
