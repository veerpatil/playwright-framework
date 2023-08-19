//package com.playwrightdemo.playwrightframework.page;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.microsoft.playwright.Browser;
//import com.microsoft.playwright.BrowserContext;
//import com.microsoft.playwright.Page;
//
//import jakarta.annotation.PostConstruct;
//
//import java.nio.file.Paths;
//
//public abstract class Base {
//
//    @Autowired
//    private Browser browser;
//
//    BrowserContext browserContext ;
//    public Page page;
//
//    @PostConstruct
//    public Page init()
//    {
//        browserContext = browser.newContext();
//        page = browserContext.newPage();
//        return page;
//    }
//
//
//
//
//}
