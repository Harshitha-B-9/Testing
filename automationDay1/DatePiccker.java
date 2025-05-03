package automationDay1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePiccker {
	
	
	static void selectDOB(WebDriver driver, String ayear, String amonth, String adate) {
	   
		while (true) {
			Select yearSelect = new Select(driver.findElement(By.xpath("//select[@aria-label='Select year']")));
	        String cyear = yearSelect.getFirstSelectedOption().getText();

	        Select monthSelect = new Select(driver.findElement(By.xpath("//select[@aria-label='Select month']")));
	        String cmonth = monthSelect.getFirstSelectedOption().getText();

	        if (cyear.equals(ayear) && cmonth.equals(amonth)) 
	        {
	            break;
	        }

	        driver.findElement(By.xpath("//span[contains(text(),'Prev')]")).click();

	        // Optional: Add a short wait here if the calendar takes time to update
	        // Thread.sleep(500); // not recommended in production, better use WebDriverWait
	    }

	    List<WebElement> cdate = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td"));
	    for (WebElement date : cdate) {
	        if (date.getText().equals(adate)) {
	            date.click();
	         driver.findElement(By.xpath("//button[@data-handler='hide']")).click();
	            break;
	        }
	    }
	}

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='travname']")).sendKeys("Harsha");
		driver.findElement(By.xpath("//input[@id='travlastname']")).sendKeys("B");
		driver.findElement(By.xpath("//input[@id='dob']")).click();
		
		selectDOB(driver,"2001","Jul","11");
		
		driver.findElement(By.xpath("//label[@for='sex_2']")).click();
		driver.findElement(By.xpath("//label[@for='traveltype_1']")).click();
		
		
	    
	driver.quit();    
	}
	
}
