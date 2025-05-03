package automationDay1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaginationEx2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver(); 
		 driver.manage().window().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.name("username")).sendKeys("Admin");
		 driver.findElement(By.name("password")).sendKeys("admin123");
		 driver.findElement(By.cssSelector("button[type='submit']")).click();
		 driver.findElement(By.xpath("//a[@class='oxd-main-menu-item']//*[text()='Admin']")).click();
			 
			 
		 List<WebElement>  price=driver.findElements(By.xpath("//div[@role='cell']"));
				 for(WebElement a:price)
				 {
					 System.out.println(a.getText());
				 }
				 
			 WebElement checkbox=driver.findElement(By.xpath("//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']"));	
			 checkbox.click();
			 Thread.sleep(3000);
			boolean status=checkbox.isSelected();
			
			 
			  
			  if (status) 
			  {
		            System.out.println(price);
		            System.out.println(status);
			 
		     }
	    


		 driver.quit();
		 

	}
	}


