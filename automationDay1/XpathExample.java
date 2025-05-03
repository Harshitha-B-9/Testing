package automationDay1;
import java.time.Duration;

//import java.util.List;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExample {
	
		public static void main(String[] args) throws InterruptedException //throws (Interrupted Exception)
		{
			// TODO Auto-generated method stub
	   
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://testautomationpractice.blogspot.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // implicit wait
			
		boolean status=	driver.findElement(By.xpath("//input[@id='name']")).isEnabled();
		System.out.println(status);
		
		//System.out.println(driver.findElement(By.linkText("//h2[normalize-space()='Tabs']")).isDisplayed());
		
		System.out.println(driver.findElement(By.xpath("//input[@id='male']")).isSelected());
		WebElement rd= driver.findElement(By.xpath("//input[@id='female']"));
		rd.click();
		System.out.println(rd.isSelected());
		
		driver.quit();
			
			

}
}