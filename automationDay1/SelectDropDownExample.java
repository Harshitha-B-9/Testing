package automationDay1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver =new ChromeDriver(); 
		 driver.manage().window().maximize();
		 driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 //Selecting signle element
		//new Select(driver.findElement(By.xpath("//select[@name='country']"))).selectByVisibleText("India");
		//Thread.sleep(3000);
		//Select country=new Select(driver.findElement(By.xpath("//select[@name='country']")));
		//country.selectByVisibleText("France");
		 
	    WebElement country=driver.findElement(By.xpath("//select[@name='country']"));
		Select options=new Select(country);
		List <WebElement> name=options.getOptions();
		System.out.println(name.size());
	    for(int i=0;i<name.size();i++)
		{
			System.out.println(name.get(i).getText());
			//String s=name.get(i).getText();	
		}
	   // Thread.sleep(1500);
		options.selectByVisibleText("France");
		
		for(WebElement a:name)
		{
			System.out.println(a.getText());
		}
		
		driver.quit();

	}

}
