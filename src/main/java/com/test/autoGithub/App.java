package com.test.autoGithub;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    public static void main( String[] args )
    {	System.setProperty("webdriver.chrome.driver","\\C:\\Users\\deepak.pruthi\\eclipse-workspace\\autoGithub\\src\\ChromeDriver\\chromedriver.exe\\");
    	WebDriver driver = new ChromeDriver();
	
		
		driver.get("https://github.com/");
		driver.findElement(By.id("user[login]")).sendKeys("dpruthixyz");
		driver.findElement(By.id("user[email]")).sendKeys("dpruthi66@yopmail.com");
		driver.findElement(By.id("user[password]")).sendKeys("");
		driver.findElement(By.xpath("//button[text()='Sign up for GitHub']")).click();
		driver.manage().window().maximize();
		
    }
}
