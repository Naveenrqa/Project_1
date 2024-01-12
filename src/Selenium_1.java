import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.apnacomplex.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.close();
		WebElement button = driver.findElement(By.className("header_login_btn"));
		button.click();
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("password"));
		email.sendKeys("naveen@anarock.com");
		password.sendKeys("1234");
		WebElement button1 = driver.findElement(By.name("login"));
		button1.click();
		driver.navigate().refresh(); 
		WebElement button2 = driver.findElement(By.className("dropdown-toggle"));
		button2.click();
		WebElement button3 = driver.findElement(By.xpath("//*[@id=\"s2id_current_complex_id\"]"));
		button3.click();
		WebElement button4 = driver.findElement(By.xpath("//*[@id=\"current_complex_id\"]/option[2]"));
		button4.click();
		WebElement button5 = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[16]/a/span"));
		button5.click();
		WebElement button6 = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[16]/ul/li[3]/a"));
		button6.click();
		WebElement button7 = driver.findElement(By.xpath("//*[@id=\"s2id_blocklist\"]"));
		button7.click();
		WebElement block = driver.findElement(By.xpath("//*[@id=\"s2id_autogen2_search\"]"));
		block.sendKeys("001AGR");
		block.sendKeys(Keys.ENTER);
		WebElement button9 = driver.findElement(By.id("flat_span"));
		button9.click();
		WebElement Flat = driver.findElement(By.xpath("//*[@id=\"s2id_autogen211_search\"]"));
		Flat.sendKeys("99");
		Flat.sendKeys(Keys.ENTER);
		WebElement button10 = driver.findElement(By.className("primaryAction"));
		button10.click();
		WebElement button11 = driver.findElement(By.id("clear_payment_invoice"));
		button11.click();
		
		
	
		
		
		

		
		

	
		



      
        
     
 

		
	
		
		
		
		
		
		

		

	}

}
