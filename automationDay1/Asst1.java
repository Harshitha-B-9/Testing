package automationDay1;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asst1 {

	public static void main(String[] args) throws InterruptedException //throws (Interrupted Exception)
	{
		// TODO Auto-generated method stub
   
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		

		
		//Tagname locator
				List<WebElement> e=driver.findElements(By.tagName("a")); 
				//List<WebElement> e=driver.findElements(By.tagName("img")); 
				System.out.println(e.size());
				for(WebElement a:e)
				{
					System.out.println(a);
					
				}

				
				List<WebElement> f=driver.findElements(By.tagName("img")); 
				//List<WebElement> e=driver.findElements(By.tagName("img")); 
				System.out.println(f.size());
				for(WebElement b:f)
				{
					System.out.println(b);
					
				}
				
				
				driver.findElement(By.linkText("Sony vaio i5")).click();
				
				driver.quit();
	}
}
