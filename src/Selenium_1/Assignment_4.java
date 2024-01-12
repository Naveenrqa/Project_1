package Selenium_1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	driver.manage().window().maximize();
	WebElement custid = driver.findElement(By.name("cusid"));
	custid.sendKeys("99999");
	WebElement Submit_button = driver.findElement(By.name("submit"));
	Submit_button.click();
	Thread.sleep(2000);
	
	Alert a=driver.switchTo().alert();
	a.accept();
	Thread.sleep(2000);
	a.accept();
	driver.close();
	
	

	}
	
	

}
