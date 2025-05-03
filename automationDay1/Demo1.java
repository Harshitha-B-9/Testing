package automationDay1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo1 {
	
	public static void main(String[] args)
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		String s=driver.getTitle();
		if(s.equals("nopCommerce demo store"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("pass");
		}
	
		driver.quit();
	}

}
