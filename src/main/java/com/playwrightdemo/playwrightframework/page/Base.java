package com.playwrightdemo.playwrightframework.page;

import org.springframework.beans.factory.annotation.Autowired;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;

import jakarta.annotation.PostConstruct;

public abstract class Base {

    @Autowired
    private Browser browser;
    
    BrowserContext browserContext ; 
    Page page; 

    @PostConstruct
    private Page init()
    {
        browserContext = browser.newContext(); 
        page = browserContext.newPage(); 
        return page;  
    }
}
