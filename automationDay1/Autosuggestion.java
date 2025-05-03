package automationDay1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("q")).sendKeys("De");
		
		
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
	        List<WebElement> suggestions = wait.until(
	            ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@role='listbox']//li[@role='presentation']//div[@role='option']")));
	        for (WebElement suggestion : suggestions) {
	            String text = suggestion.getText();
	            System.out.println(text);
	            
	            if (text.equalsIgnoreCase("deloitte"))
	            {
	                suggestion.click();
	                break;
	            }
	            
	}
	        driver.quit();

}
}
