package com.playwrightdemo.playwrightframework.config;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;

@Configuration
public class PlaywrightConfig
{

    @Bean
    @ConditionalOnProperty(name = "browser", havingValue = "chrome")
    public Browser chromeBrowser()
    {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch( new LaunchOptions().setHeadless(false));
        return browser;
    }


    @Bean
    @ConditionalOnProperty(name = "browser", havingValue = "firefox")
    public Browser firfoxBrowser()
    {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.firefox().launch( new LaunchOptions().setHeadless(false));
        return browser;
    }


    @Bean
    @ConditionalOnProperty(name = "browser", havingValue = "webkit")
    public Browser webKitBrowser()
    {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.webkit().launch( new LaunchOptions().setHeadless(false));
        return browser;
    }
}