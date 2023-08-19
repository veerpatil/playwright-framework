package com.playwrightdemo.playwrightframework;

import com.playwrightdemo.playwrightframework.page.BasePage;
import com.playwrightdemo.playwrightframework.page.DashboardPage;
import com.playwrightdemo.playwrightframework.utility.ScreenShotUtil;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.springframework.beans.factory.annotation.Autowired;
import com.playwrightdemo.playwrightframework.page.LoginPage;
import org.springframework.context.annotation.Lazy;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



@Epic("Login Page")
@Feature("Login Page Test")
public class PlaywrightFrameworkApplicationTests extends SpringBootTestNgTest {

	@Test
	@Story("Valid user login test")
	@Description("Verify that user with valid credential is able to see the dashboard")
	public void LoginTest() throws InterruptedException {

		loginPage.setEmail("admin@yourstore.com");
		loginPage.setPassword("admin");
		loginPage.performLogin();
		Thread.sleep(4000);
		System.out.println(dashboardPage.getTitle());
		Assert.assertEquals(dashboardPage.getTitle().trim(),"Dashboard");
	}


	@Test
	@Story("In Valid user login test")
	@Description("Verify that user with in valid credential is not able to see the dashboard")
	public void LoginTest1() throws InterruptedException {

		loginPage.setEmail("admin@yourstore.com");
		loginPage.setPassword("admins");
		loginPage.performLogin();

		Thread.sleep(4000);
		System.out.println(dashboardPage.getTitle());
		Assert.assertEquals(dashboardPage.getTitle().trim(),"Dashboarda");
	}



}
