package Selenium_1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_6 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		String Parentwindowhandle = driver.getWindowHandle();
		System.out.println(Parentwindowhandle);
		WebElement button = driver.findElement(By.xpath("/html/body/p/a"));
		button.click();
		Set<String> windowHandles = driver.getWindowHandles();
		for(String windowHandle : windowHandles) {
			if(!windowHandle.equals(Parentwindowhandle)) {
				driver.switchTo().window(windowHandle);
				WebElement emailid = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input"));
				emailid.sendKeys("naveen@gmail.com");
				Thread.sleep(2000);
				WebElement submit = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input"));
				submit.click();
				
				
			}
			
			
		}
		
		
		
		    

	}


}
