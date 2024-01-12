package Selenium_1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.ScreenshotException;
import dev.failsafe.internal.util.Assert;
import org.apache.commons.io.FileUtils;

public class Assignment_7 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		WebElement hit = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[1]/a"));
		hit.click();
		
		
		Actions act = new Actions(driver);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));
				
		act.dragAndDropBy(driver.findElement(By.xpath("//*[@id=\'draggable\']")),90,90).perform();
		
		Thread.sleep(5000);
		
		File sourcefile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destfile = new File("D:\\Selenium/img99.jpeg");
		org.apache.commons.io.FileUtils.copyFile(sourcefile, destfile);
		
    }  
	
	}	

	


