package com.test.autoGithub;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownBySelect {

	Select select;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"\\C:\\Users\\deepak.pruthi\\eclipse-workspace\\autoGithub\\src\\ChromeDriver\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.zoho.com/signup.html");
		
		Thread.sleep(3000);

		DropDownBySelect country = new DropDownBySelect();
		country.selectDropDownByVisibility(driver.findElement(By.id("country")), "Canada");
	}

	public void selectDropDownByVisibility(WebElement element, String visiblity) {

		select = new Select(element);
		select.selectByVisibleText(visiblity);

	}

}
