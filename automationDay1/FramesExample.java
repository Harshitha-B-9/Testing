package automationDay1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		//WebElement framename=driver.findElement(By.xpath("/html[1]/frameset[1]/frame[2]"));
		driver.switchTo().frame(4);
		driver.findElement(By.cssSelector("a[href='https://a9t9.com']")).click();
		driver.switchTo().defaultContent();
		WebElement frame2=driver.findElement(By.xpath("//div[@id='header']//div[@class='row']"));
		driver.switchTo().frame(frame2);
		System.out.println(driver.findElement(By.xpath("//img[@alt='Ui.Vision by a9t9 software - Image-Driven Automation']")).isDisplayed());
       
		driver.quit();
	}

}
