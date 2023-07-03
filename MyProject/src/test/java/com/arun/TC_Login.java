package com.arun;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.protobuf.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_Login {
	@Test
	public void login_Test() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds());
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("nav-link-accountList")).click();
		driver.findElement(By.name("email")).sendKeys("9629489209");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.name("password")).sendKeys("Aaruunnak#87");
		driver.findElement(By.id("signInSubmit")).click();
		//Thread.sleep(3000);
		
	//	Assert.assertEquals(driver.getTitle(),"Amazon.in");
		driver.close();
	}

}
