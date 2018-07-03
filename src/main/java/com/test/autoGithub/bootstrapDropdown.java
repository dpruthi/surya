package com.test.autoGithub;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class bootstrapDropdown {

	@Test
	public void bootdropdown() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"\\C:\\Users\\deepak.pruthi\\eclipse-workspace\\autoGithub\\src\\ChromeDriver\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();

		driver.get("https://github.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='text-bold text-white no-underline'][contains(text(),'Sign in')]"))
				.click();
		driver.findElement(By.xpath("//input[@id='login_field']")).sendKeys("dpruthi");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("qwerty646@");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//summary[@class='HeaderNavlink name mt-1']")).click();
		List<WebElement> dd_menu = driver.findElements(By.xpath(
				"//details[@class='details-overlay details-reset js-dropdown-details d-flex pl-2 flex-items-center']//ul[@class='dropdown-menu dropdown-menu-sw']//li/a"));

		for (int i = 0; i < dd_menu.size(); i++) {

			WebElement element = dd_menu.get(i);
			String inner = element.getAttribute("innerHTML");
			if (inner.contentEquals("Your gists")) {

				element.click();
				break;
			}
			
			System.out.println(inner);

		}
	}
}
