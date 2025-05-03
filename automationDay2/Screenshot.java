package automationDay2;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) 
	{
		
		 WebDriver driver =new ChromeDriver(); 
		 driver.manage().window().maximize();
		 driver.get("https://testautomationpractice.blogspot.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		 //takes entire screen
		 TakesScreenshot ts=(TakesScreenshot)driver;
		 File sourcefile= ts.getScreenshotAs(OutputType.FILE);
		 File destination=new File(System.getProperty("user.dir")+"\\Results\\img.png");
		 sourcefile.renameTo(destination);
		 //takes particular area
		 WebElement pic=driver.findElement(By.xpath("//div[@class='widget-content']//table[@name='BookTable']"));
		 File sf=pic.getScreenshotAs(OutputType.FILE);
		 File df=new File(System.getProperty("user.dir")+"\\Results\\img2.png");
		 sf.renameTo(df);
		 
		 driver.quit();
		 

	}

}
