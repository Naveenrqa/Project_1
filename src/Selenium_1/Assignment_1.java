package Selenium_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.close();
		
		WebDriver driver3 =new FirefoxDriver();
		driver3.get("https://www.naukri.com/");
		driver3.manage().window().maximize();
		Thread.sleep(5000);
		driver3.navigate().back();
		Thread.sleep(4000);
		driver3.close();
		
		
		WebDriver driver1 = new EdgeDriver();
		driver1.get("https://www.facebook.com/");
		driver1.manage().window().maximize();
		Thread.sleep(5000);
		driver1.navigate().back();
		Thread.sleep(4000);
		driver1.close();
		
		
		

	}

}
