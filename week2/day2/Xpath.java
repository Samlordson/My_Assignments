package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("DemoSalesManager");
		 driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		 driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		 driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		 driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("ITS");
		 driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Samlordson");
		 driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("R B");
		 driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		 

		 
		 
		 
		 
	

}

}
