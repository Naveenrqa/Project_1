package Selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class java_2712 {

	public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebElement Uname = driver.findElement(By.name("username"));
        Uname.sendKeys("Admin");
        WebElement Password = driver.findElement(By.name("password"));
        Password.sendKeys("admin123");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
     }

}