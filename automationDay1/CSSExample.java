package automationDay1;

//import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSExample {

	public static void main(String[] args) throws InterruptedException //throws (Interrupted Exception)
	{
		// TODO Auto-generated method stub
   
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		Thread.sleep(500);
		//css selector by tag#id
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("samsung");
		Thread.sleep(500);
		
		//css selector by #id
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("samsung");// css selector by #id
		
		//css selector by tag.classname
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("samsung");
		//css selector by .classname
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("samsung");
		
		//css selector by tag[attribute='value']
		//driver.findElement(By.cssSelector("input[type='text']")).sendKeys("samsung");
		//css selector by [attribute='value']
		//driver.findElement(By.cssSelector("[type='text']")).sendKeys("samsung");
				
	    
		 //css selector by tag.classname[attribute='value']
		 driver.findElement(By.cssSelector("input.search-box-text[type='text']")).sendKeys("samsung");
		
		//css selector by .classname[attribute='value']
		 driver.findElement(By.cssSelector(".search-box-text[type='text']")).sendKeys("samsung");
		
		
		//driver.quit();
		
		
		
}
}