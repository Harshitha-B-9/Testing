package automationDay1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorExample {

	public static void main(String[] args) throws InterruptedException //throws (Interrupted Exception)
	{
		// TODO Auto-generated method stub
   
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//xpath
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mac"); 
		
		//Tagname locator
		List<WebElement> e=driver.findElements(By.tagName("a")); 
		//List<WebElement> e=driver.findElements(By.tagName("img")); 
		System.out.println(e.size());
		for(WebElement a:e)
		{
			System.out.println(a);
			System.out.println(a.getSize());
		}

		//class locator
		List<WebElement> elements=driver.findElements(By.className("list-inline-item")); 
		System.out.println(elements.size());
		for(WebElement a:elements)
		{
			System.out.println(a);
			System.out.println(a.getSize());
		}
		
		//name locator
		driver.findElement(By.name("search")).sendKeys("mac");
		
		//Link Text locator
		driver.findElement(By.linkText("Tablets")).click();
		
		//id locator
		boolean dis=driver.findElement(By.id("logo")).isDisplayed();
		if(dis==true)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		driver.quit();
	}

}

