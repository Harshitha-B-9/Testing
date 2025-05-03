package automationDay1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions2 {

		// TODO Auto-generated method stub
		
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub

			 WebDriver driver =new ChromeDriver(); 
			 driver.manage().window().maximize();
			 driver.get("https://testautomationpractice.blogspot.com/");
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
			 
			 //Double click
			/*WebElement f1= driver.findElement(By.xpath("//input[@id='field1']"));
			f1.clear();
			f1.sendKeys("Hello");
			WebElement f2= driver.findElement(By.xpath("//input[@id='field2']"));				 
			WebElement co= driver.findElement(By.xpath("//button[contains(text(),'Copy Text')]"));
			Actions act=new Actions(driver);
			act.doubleClick(co).perform();
			
			if(f2.getText().equals(f1.getText()))
			{
				System.out.println("pass");
			}
			else
			{
				System.out.println("fail");
			}
				
			
			if(f2.getAttribute("value").equals(f1.getAttribute("value")))
				
			{
				System.out.println(f2.getAttribute("value"));
				System.out.println("pass");
			}
			else
			{
				System.out.println("fail");
			}
			*/
			
			
			//Mousehover
			 Actions act=new Actions(driver);
			WebElement mh=driver.findElement(By.xpath("//button[@class='dropbtn']"));
			WebElement mh1=driver.findElement(By.xpath("//a[normalize-space()='Mobiles']"));
			act.moveToElement(mh).pause(1000).click(mh1).perform();
			
			//Rightclick context click
			
			act.contextClick(mh).perform();
		}

}
