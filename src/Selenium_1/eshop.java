package Selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class eshop {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000)");
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']")).click();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(3000,0)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		js.executeScript("window.scrollBy(0,3000)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		driver.findElement(By.name("firstName")).sendKeys("QA");
		Thread.sleep(3000);
		driver.findElement(By.name("lastName")).sendKeys("SDET");
		Thread.sleep(3000);
		driver.findElement(By.name("postalCode")).sendKeys("999999");
		js.executeScript("window.scrollBy(0,3000)");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,6000)");
		driver.findElement(By.xpath("//button[@id='finish']")).click();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,3000)");
		driver.findElement(By.xpath("//button[@id='back-to-products']")).click();
		

	}

}
