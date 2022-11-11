package swag;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class Test {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Toshiba\\Desktop\\my new driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// driver.get("https://www.facebook.com");
		driver.get("https://www.saucedemo.com/");
		String user = "standard_user";
		String password ="secret_sauce"; 
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(user);
		Thread.sleep(2000);
		Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        
    
    List<WebElement> myButtons = driver.findElements(By.className("btn"));
         
   for(int i =0 ;i<myButtons.size();i++) {
	   
	   myButtons.get(i).click();
	   
	   
   }
         String acctualItems =driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).getText();
         
         System.out.println(acctualItems);
         
	}

}
