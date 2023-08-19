package com.playwrightdemo.playwrightframework.config;
import com.microsoft.playwright.Page;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;

import java.io.File;
import java.nio.file.Paths;

@Configuration
public class PlaywrightConfig
{

    @Value("${headless}")
    private boolean headless;
    @Bean
    @ConditionalOnProperty(name = "browser", havingValue = "chrome" )
    public Browser chromeBrowser()
    {
        Playwright playwright = Playwright.create();
        return playwright.chromium().launch( new LaunchOptions().setHeadless(headless));
    }


    @Bean
    @ConditionalOnProperty(name = "browser", havingValue = "firefox")
    public Browser firefoxBrowser()
    {
        Playwright playwright = Playwright.create();
        return playwright.firefox().launch( new LaunchOptions().setHeadless(headless));
    }


    @Bean
    @ConditionalOnProperty(name = "browser", havingValue = "webkit")
    public Browser webKitBrowser()
    {
        Playwright playwright = Playwright.create();
        return playwright.webkit().launch( new LaunchOptions().setHeadless(headless));
    }

    @Bean
    public Page BasePage(Browser browser)
    {
        return browser.newContext().newPage();
    }

}