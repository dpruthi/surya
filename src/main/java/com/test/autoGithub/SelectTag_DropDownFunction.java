package com.test.autoGithub;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SelectTag_DropDownFunction {

	Select select;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"\\C:\\Users\\deepak.pruthi\\eclipse-workspace\\autoGithub\\src\\ChromeDriver\\chromedriver.exe\\");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars"); // bar is disable (chrome is controlled by automated test software)
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.zoho.com/signup.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		SelectTag_DropDownFunction country_refVar = new SelectTag_DropDownFunction();
		country_refVar.selectDropDownByVisibility(driver.findElement(By.id("country")), "Canada");
	}

	public void selectDropDownByVisibility(WebElement element, String visiblity) {

		select = new Select(element);
		select.selectByVisibleText(visiblity);

	}

}
