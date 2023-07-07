package com.qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

public class Test2 {

	@Test
	@Description("this is search test")
	@Severity(SeverityLevel.NORMAL)
	@Step("this is search step")
	@Story("this is search story")
	public void searchTest() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("java");
		driver.quit();
	}
	
}
