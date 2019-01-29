package com.test.autoGithub;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class mmt_calander {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"\\C:\\Users\\deepak.pruthi\\eclipse-workspace\\autoGithub\\src\\ChromeDriver\\chromedriver.exe\\");
		
		Map<String, Object> prefs = new HashMap<String, Object>();
        
        // Set the notification setting it will override the default setting
prefs.put("profile.default_content_setting_values.notifications", 2);

        // Create object of ChromeOption class
ChromeOptions options = new ChromeOptions();

        // Set the experimental option
options.setExperimentalOption("prefs", prefs);
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.id("hp-widget__depart")).click();
	}
}
