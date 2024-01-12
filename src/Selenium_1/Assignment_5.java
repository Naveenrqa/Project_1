package Selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_5 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
	    driver.get("https://demo.guru99.com/test/guru99home/");
	    driver.manage().window().maximize();
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,2200)", "");
	    Thread.sleep(3000);
	    driver.switchTo().frame("a077aa5e");
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body")).click();
	    
	    
	    
	    

	}

	

}
