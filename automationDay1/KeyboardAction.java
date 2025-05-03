package automationDay1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {

	public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub

			 WebDriver driver =new ChromeDriver(); 
			 driver.manage().window().maximize();
			 driver.get("https://testautomationpractice.blogspot.com/");
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
			 WebElement s=driver.findElement(By.id("name"));
			 s.sendKeys("1234");
			 WebElement t=driver.findElement(By.id("email"));			 
			 Actions act=new Actions(driver);
			 s.click();
			 //act.keyDown(Keys.CONTROL).(sendKeys."c")).sendKeys("a").keyUp(Keys.CONTROL).perform();
			 //act.click(t).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
			 s.click();
		        s.sendKeys(Keys.chord(Keys.CONTROL, "a")); // Select all
		        s.sendKeys(Keys.chord(Keys.CONTROL, "c")); // Copy

		        // Step 2: Paste into email field
		        t.click();
		        t.sendKeys(Keys.chord(Keys.CONTROL, "v")); // Paste
		        
		        
             //open in new tab
		        WebElement b=driver.findElement(By.linkText("Blog"));
		        
				 act.keyDown(Keys.CONTROL).click(b).keyUp(Keys.CONTROL).perform();
			 
			 


	}

}
