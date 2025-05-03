package automationDay1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver =new ChromeDriver(); 
		 driver.manage().window().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.name("username")).sendKeys("Admin");
		 driver.findElement(By.name("password")).sendKeys("admin123");
		 driver.findElement(By.cssSelector("button[type='submit']")).click();
		 driver.findElement(By.xpath("//span[text()='PIM']")).click();
		 driver.findElement(By.xpath("//div[3]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")).click();
		 
		  //WebElement Employee=driver.findElement(By.xpath("//div[@role='option'and@class='oxd-select-option']"));
		  WebElement Employee=driver.findElement(By.xpath("//div[@role='listbox']/div[@role='option']"));
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("arguments[1]", Employee);
			Select options=new Select(Employee);
			List <WebElement> name=options.getOptions();
			System.out.println(name.size());
			for(WebElement c:name)
			{
				System.out.println(c.getText());
			}
         
			driver.quit();// TODO Auto-generated method stub

	}

}
