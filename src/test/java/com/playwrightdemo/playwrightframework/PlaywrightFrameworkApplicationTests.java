package com.playwrightdemo.playwrightframework;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.playwrightdemo.playwrightframework.page.LoginPage;

@SpringBootTest
class PlaywrightFrameworkApplicationTests {

	@Autowired 
	private LoginPage loginPage; 
	
	@Test
	public void LoginTest()
	{
		loginPage.goTo();
		loginPage.getLogin();
		
	}

}
