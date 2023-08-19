package com.playwrightdemo.playwrightframework.page;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class PlayWrightBrowserContext {

    @Autowired
    private Page page;

    @PostConstruct
    public Page init()
    {
        return  page;
    }
}



