package Selenium_1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Project_1_M {
	
	WebDriver driver;
	Project_1 lp;
	
	
	@Test(priority=1)
	void Setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
	}
	
	@Test(priority=2)
	void login_test() throws InterruptedException
	{
		lp = new Project_1(driver);
		lp.enter_username("standard_user");
		Thread.sleep(2000);
		lp.enter_password("secret_sauce");
		Thread.sleep(2000);
		lp.Clickon_login();
		Thread.sleep(3000);
		
		
	}
	@Test(priority=3)
	void basket() throws InterruptedException
	{
		lp = new Project_1(driver);
		lp.addtocart1();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		lp.addtocart2();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-500)");
	}
	@Test(priority=4)
	void view_cart()
	{
		lp = new Project_1(driver);
		lp.viewcart();
	}
	@Test(priority=5)
	void check_out()
	{
		lp = new Project_1(driver);
		lp.checkingout();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-500)");
	}
	@Test(priority=6)
	void address() throws InterruptedException
	{
		lp = new Project_1(driver);
		lp.Firstname("QA Engineer");
		Thread.sleep(3000);
		lp.Lastname("SDET Automation");
		Thread.sleep(3000);
		lp.Postal_code("900009");
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		lp.checksout();
	}
	@Test(priority=7)
	void place_order() throws InterruptedException
	{
		lp = new Project_1(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-500)");
		lp.place_order();
		Thread.sleep(5000);
	}
	@Test(priority=8)
	void backhome() throws InterruptedException
	{
		lp = new Project_1(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-500)");
		lp.backhome();
		Thread.sleep(9000);
	}
	@Test(priority=9)
	void closed()
	{
		driver.quit();
	}
	
		
}
