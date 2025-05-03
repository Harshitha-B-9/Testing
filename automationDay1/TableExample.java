package automationDay1;

	import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class TableExample {

		public static void main(String[] args) throws InterruptedException {
			
			 WebDriver driver =new ChromeDriver(); 
			 driver.get("https://blazedemo.com/");
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		     driver.findElement(By.xpath("//select[@name='fromPort']")).click();
		     new Select(driver.findElement(By.name("fromPort"))).selectByVisibleText("Boston");
		     driver.findElement(By.xpath("//select[@name='toPort']")).click();
			 new Select(driver.findElement(By.name("toPort"))).selectByValue("London");
			 driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
			 List<WebElement> price=driver.findElements(By.xpath("//table[@class='table']//tr/td[last()]"));
			 for(WebElement p:price)
			 {
				System.out.println(p.getText());
				
			 }
			 
			 
			 
			 List priceList = new ArrayList();

			 for (WebElement el : price) 
			 {
			     String priceText = el.getText().replace("$", "").trim();
			     priceList.add(Double.parseDouble(priceText));
			 }

			 double lowest = Collections.min(priceList);
		        int index = priceList.indexOf(lowest) + 1;   
		        
		        driver.findElement(By.xpath("(//input[@value='Choose This Flight'])[" + index + "]")).click();
		        
		       
		        driver.findElement(By.id("inputName")).sendKeys("Harsha");
		        driver.findElement(By.id("address")).sendKeys("abc-colony");
		        driver.findElement(By.id("city")).sendKeys("Vijayawada");
		        driver.findElement(By.id("state")).sendKeys("AndhraPradesh");
		        driver.findElement(By.name("cardType")).click();
		        new Select(driver.findElement(By.name("cardType"))).selectByVisibleText("Visa");
		        driver.findElement(By.cssSelector("input[value='Purchase Flight']")).click();
		        boolean status=driver.findElement(By.xpath("//*[text()='Thank you for your purchase today!']")).isDisplayed();
		        System.out.println(status);
		        driver.quit();
			 
		}
		

}
