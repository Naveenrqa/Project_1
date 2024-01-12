package Selenium_1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment_3 {

	public static void main(String[] args) throws InterruptedException {
	
    WebDriver driver = new ChromeDriver();
    driver.get("https://demo.guru99.com/test/web-table-element.php");
    driver.manage().window().maximize();
    
    int rows = driver.findElements(By.xpath ("//*[@id=\"leftcontainer\"]/table/tbody/tr")).size();
    System.out.println("Total Number of Rows in Dynamic Table: " +rows);
    
      
    int cols = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th")).size();
    System.out.println("Total Number of Columns in Dynamic Table: "  +cols);
    
    System.out.println("The Company names are:");
    System.out.println("----------------------------");
    for(int RowNumber=1; RowNumber<=rows; RowNumber++) {
        System.out.println(driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+RowNumber+"]/td[1]")).getText());
    	}	
    driver.close();

    WebDriver driver1 = new ChromeDriver();
    driver1.get("https://demo.guru99.com/test/login.html");
    driver1.manage().window().maximize();
    
    WebElement username=driver1.findElement(By.id("email"));
    WebElement password=driver1.findElement(By.id("passwd"));
    WebElement login=driver1.findElement(By.name("SubmitLogin"));
    username.sendKeys("abc@gmail.com");
    password.sendKeys("12345");
    Thread.sleep(5000);
    login.click();
    
       
    
         
   
    
   
}  
}
    
   

    
                        
                                              
                           
              

       
    
    
	


 


