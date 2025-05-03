package automationDay1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asst3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver(); 
		 driver.manage().window().maximize();
		 driver.get("https://testautomationpractice.blogspot.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 List<WebElement> checkbox=driver.findElements(By.xpath("//table[@id='productTable']//input[@type='checkbox']"));
		 for(WebElement check:checkbox)
		 {
			 check.click();
		 }

		 for(int i=0;i<3;i++)
		 {
			 checkbox.get(i).click();
		 }
		 
		 for(int i=3;i<4;i++)
		 {
			 if(checkbox.get(i).isSelected())
					 checkbox.get(i).click();
		 }
		 
		 driver.quit();
	}
	

}
