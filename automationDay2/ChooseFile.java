package automationDay2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChooseFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver(); 
		 driver.manage().window().maximize();
		 driver.get("https://testautomationpractice.blogspot.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		 
        //select upload singlefile
		 driver.findElement(By.xpath("//input[@id='singleFileInput']")).sendKeys("D:\\Learnings\\programs.docx");
		 driver.findElement(By.xpath("//button[contains(text(),'Upload Single File')]")).click();
		 System.out.println(driver.findElement(By.xpath("//p[@id='singleFileStatus']")).getText());
		 
		//select multiple files	
		String file1="D:\\Learnings\\programs.docx";
		String file2="D:\\Learnings\\Client.JPG";
		 driver.findElement(By.xpath("//input[@id='multipleFilesInput']")).sendKeys(file1+"\n"+file2);
		 driver.findElement(By.xpath("//button[normalize-space()='Upload Multiple Files']")).click();
		 System.out.println(driver.findElement(By.xpath("//p[@id='multipleFilesStatus']")).getText());
		 driver.quit();
	}

}
