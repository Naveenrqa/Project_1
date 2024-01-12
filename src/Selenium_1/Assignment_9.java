package Selenium_1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Assignment_9 {

WebDriver driver;

@BeforeClass
public void testSetup()
{

driver=new ChromeDriver();
driver.get("https://demo.guru99.com/test/login.html");
driver.manage().window().maximize();

}


@Test(description="This method validates the sign up functionality")
public void signUp()
{
driver.findElement(By.id("email")).sendKeys("naveen@gmail.com");
driver.findElement(By.id("passwd")).sendKeys("@Naveen123");
driver.findElement(By.id("SubmitLogin")).click();

}
@AfterClass
public void afterClass()
{
driver.close();
}

}

