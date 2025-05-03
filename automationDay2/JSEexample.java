package automationDay2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSEexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriver driver =new ChromeDriver(); 
		 driver.manage().window().maximize();
		 driver.get("https://testautomationpractice.blogspot.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		 WebElement name=driver.findElement(By.id("name"));
		 WebElement phone=driver.findElement(By.id("phone"));
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 //sendkeys
		// JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("arguments[0].setAttribute('value', 'your text here')", element);

		 //js.executeScript("arguments[0].value='Harsha';",name );
		 js.executeScript("arguments[0].value='1234';",phone );
		 js.executeScript("arguments[0].setAttribute('value','welcome')",name);
		 
		 
		 //scrolling page
		 js.executeScript("window.scrollBy(0,3000);");
		 System.out.println(js.executeScript("return window.pageYOffset;"));
		 
		//scrolling page till element found
		 WebElement c=driver.findElement(By.id("male"));
		 js.executeScript("arguments[0].scrollIntoView();",c);
		 System.out.println(js.executeScript("return window.pageYOffset;"));
		 
		 
		 //click
		// WebElement c=driver.findElement(By.id("male"));
		 js.executeScript("arguments[0].click();",c);
		 
		 //page top
		 js.executeScript("window.scrollTo(0, 0);");
		// js.executeScript("window().scrollBy(0,-document.body.scrollHeight);");
		 
		 //Zoom page
		 js.executeScript("document.body.style.zoom='50%';");
		 
		 
	}

}
