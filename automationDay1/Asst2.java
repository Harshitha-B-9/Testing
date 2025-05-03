package automationDay1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asst2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 WebDriver driver =new ChromeDriver(); 
		 driver.manage().window().maximize();
		 driver.get("https://mypage.rediff.com/login");
		 
		 driver.findElement(By.xpath("//input[@value='Login']")).click();
		 driver.switchTo().alert().accept();
		 Alert a=  driver.switchTo().alert();
		 
		 a.accept();
		 //driver.navigate().refresh();
		 //driver.navigate().forward();
		 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.quit();
	}

}
