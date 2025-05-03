package automationDay1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		 WebDriver driver =new ChromeDriver(); 
		 driver.manage().window().maximize();
		 driver.get("https://testautomationpractice.blogspot.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		 
		 //drag and drop 
		 WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		 WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
		 Actions act=new Actions(driver);
		 act.dragAndDrop(drag, drop).perform();
		 Thread.sleep(3000);
		 boolean status=drop.isDisplayed();
		 System.out.println(status);
		 
		 
		//drag and drop by, slider
		 WebElement left=driver.findElement(By.xpath("(//div[@id='slider-range']//span)[1]"));;
		 WebElement right=driver.findElement(By.xpath("(//div[@id='slider-range']//span)[2]"));
		 System.out.println(left.getLocation());
		 System.out.println(right.getLocation());
		 
		 act.dragAndDropBy(left, 1500, 2024).perform();
		 Thread.sleep(3000);
		 act.dragAndDropBy(right, -500, 2024).perform();
		 Thread.sleep(3000);
		 System.out.println(left.getLocation());
		 System.out.println(right.getLocation());
		 driver.quit();
		
		
	}

}
