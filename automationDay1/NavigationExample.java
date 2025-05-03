package automationDay1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationExample {

		// TODO Auto-generated method stub
		
			
			public static void main(String[] args)  
			{
				// TODO Auto-generated method stub
		   
				
				WebDriver driver=new ChromeDriver();
				driver.get("https://testautomationpractice.blogspot.com/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // implicit wait
				
				driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("framework");
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				List<WebElement> links= driver.findElements(By.cssSelector("a[target='_blank'"));
				System.out.println(links.size());
				
				for(WebElement L:links) 
				{
			       driver.switchTo().activeElement().click();
			       String title=(driver.getTitle());
			       System.out.println(title);
			       
			       
			      /* if(title.equals("Automation Testing Practice"))
			       {
			    	   driver.close();
			    	   break;
			       }*/
					
				}
				
                 driver.quit();
	}

}
