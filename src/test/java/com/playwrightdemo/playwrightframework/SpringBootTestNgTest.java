package com.playwrightdemo.playwrightframework;


import com.playwrightdemo.playwrightframework.page.BasePage;
import com.playwrightdemo.playwrightframework.page.DashboardPage;
import com.playwrightdemo.playwrightframework.page.LoginPage;
import com.playwrightdemo.playwrightframework.utility.ScreenShotUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Lazy;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

@SpringBootTest
public class SpringBootTestNgTest extends AbstractTestNGSpringContextTests {


    @Autowired
    LoginPage loginPage;

    @Lazy
    @Autowired
    ScreenShotUtil screenShotUtil;

    @Autowired
    DashboardPage dashboardPage;

    @BeforeMethod
    public void OpenApplication()
    {
        loginPage.goTo();
    }
    @AfterMethod
    public void TakScreenShot(ITestResult result) throws IOException {
        if(result.getStatus()!=1)
        {
            screenShotUtil.TakeScreenShot();
            //screenShotUtil.SaveScreenShot();
        }

    }
}

