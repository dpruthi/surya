package com.test.autoGithub;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class bootstrapDropdown {

	String optionOnWhichClick;

	@Test
	public void bootdropdown() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"\\C:\\Users\\deepak.pruthi\\eclipse-workspace\\autoGithub\\src\\ChromeDriver\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();

		driver.get("https://github.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		driver.findElement(By.xpath("//input[@id='login_field']")).sendKeys("dpruthi");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//img[@alt ='@dpruthi']")).click();

		bootstrapDropdown ref = new bootstrapDropdown();
		ref.selectValueFromBootStrapDropDown(driver.findElements(By.xpath("//a[text()='Your gists']")), "Your gists");
	}

	public void selectValueFromBootStrapDropDown(List<WebElement> dd_menu, String optionOnWhichClick) {

		for (int i = 0; i < dd_menu.size(); i++) {

			WebElement element = dd_menu.get(i);
			String inner = element.getAttribute("innerHTML");
			if (inner.contentEquals(optionOnWhichClick)) {

				element.click();
				break;
			}

			System.out.println(inner);

		}
	}
}
