package com.test.autoGithub;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class zohoDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"\\C:\\Users\\deepak.pruthi\\eclipse-workspace\\autoGithub\\src\\ChromeDriver\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zoho.com/signup.html");
		driver.findElement(By.id("emailfield")).sendKeys("dpruthi66@yopmail.com");
		driver.findElement(By.id("password")).sendKeys("qwerty646@");
		
		Thread.sleep(3000);
		
		WebElement country_dropdown = driver.findElement(By.id("country"));
		Select country_dd = new Select(country_dropdown);
		//country_dd.selectByVisibleText("Canada");
		country_dd.selectByIndex(5);

	}

}
