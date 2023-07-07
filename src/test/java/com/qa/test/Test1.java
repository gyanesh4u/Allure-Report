package com.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

public class Test1 {

	@Test
	@Description("this is title test")
	@Severity(SeverityLevel.NORMAL)
	@Step("this is title step")
	@Story("this is title story")
	public void titleTest() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		String title = driver.getTitle();
		System.out.println(driver.getTitle());
		Assert.assertEquals(title, "Google");
		driver.close();

	}

}
