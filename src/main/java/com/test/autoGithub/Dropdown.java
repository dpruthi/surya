package com.test.autoGithub;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown {

	@Test
	public void dropdown() {

		System.setProperty("webdriver.chrome.driver",
				"\\C:\\Users\\deepak.pruthi\\eclipse-workspace\\autoGithub\\src\\ChromeDriver\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.ghargharrozgar.punjab.gov.in/app/register");
		driver.manage().window().maximize();

		WebElement gender_dropdown = driver.findElement(By.id("registerform-gender"));
		Select gender_dd = new Select(gender_dropdown);
		gender_dd.selectByIndex(1);
	}

}
