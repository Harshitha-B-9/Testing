package automationDay1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BootStrapDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver =new ChromeDriver(); 
		 driver.manage().window().maximize();
		 driver.get("https://testautomationpractice.blogspot.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 
		 WebElement color= driver.findElement(By.id("colors"));
			Select options=new Select(color);
			List <WebElement> name=options.getOptions();
			System.out.println(name.size());
			for(WebElement c:name)
			{
				System.out.println(c.getText());
				if((c.getText().equals("Yellow"))|| (c.getText().equals("Blue")))
						{
					             c.click();
					             Thread.sleep(3000);
						}
			}
         
			driver.quit();
	}

}
