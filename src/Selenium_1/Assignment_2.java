package Selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
		radio1.click();
		WebElement Checkbox2 = driver.findElement(By.id("vfb-6-1"));
		Checkbox2.click();
		WebElement Checkbox3 = driver.findElement(By.id("vfb-6-2"));
		Checkbox3.click();
		Thread.sleep(9000);
		driver.close();
		

		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(5000);
		driver1.manage().window().maximize();
		WebElement country = driver1.findElement(By.name("country"));
		Select countryName = new Select(country);
		countryName.selectByVisibleText("KUWAIT");
		
	
		
		
	
		
		

	}

}
