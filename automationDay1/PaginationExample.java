package automationDay1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaginationExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver =new ChromeDriver(); 
		 driver.get("https://testautomationpractice.blogspot.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 List<WebElement> ts=driver.findElements(By.xpath("//ul[@id='pagination']//li"));
		 System.out.println(ts.size());
		 int pagination=ts.size();
		 List<WebElement> row=driver.findElements(By.xpath("//table[@id='productTable']//tr"));
		 int rowsize=row.size();
		 
		 for(int p=1;p<=pagination;p++)
		 {
			 
			 if(p>1)
			 {
				 driver.findElement(By.xpath("//ul[@id='pagination']//a[text()="+p+"]")).click();
			 }
			 
		      for(int r=1;r<rowsize;r++)
			 
		     {
			 	 
			 String id=driver.findElement(By.xpath("//table[@id='productTable']//tr["+r+"]//td[1]")).getText();
			 String name=driver.findElement(By.xpath("//table[@id='productTable']//tr["+r+"]//td[2]")).getText();
			 String price=driver.findElement(By.xpath("//table[@id='productTable']//tr["+r+"]//td[3]")).getText();
			 WebElement checkbox=driver.findElement(By.xpath("//table[@id='productTable']//tr[\" + r + \"]//td[4]//input[@type='checkbox']"));
			 checkbox.click();
			boolean status=checkbox.isSelected();
			
			 //Thread.sleep(3444);
			 // System.out.println(id+" "+name+" "+price);
			  //System.out.println(status); 
			  
			  if (status) 
			  {
		            System.out.println(id + " " + name + " " + price);
		            System.out.println(status);
			 
		     }
			  
			  
	    }
		      
		      driver.quit();

}
	}
	}
