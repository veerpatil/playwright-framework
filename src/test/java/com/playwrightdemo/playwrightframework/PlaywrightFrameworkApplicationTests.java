package com.playwrightdemo.playwrightframework;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import com.playwrightdemo.playwrightframework.page.LoginPage;
import org.springframework.context.annotation.Configuration;

@SpringBootTest
class PlaywrightFrameworkApplicationTests {

	@Autowired 
	private LoginPage loginPage;

	@Test
	public void LoginTest() throws InterruptedException {
		loginPage.goTo();
		loginPage.setEmail("admin@yourstore.com");
		loginPage.setPassword("admin");
		loginPage.performLogin();
	}

}
