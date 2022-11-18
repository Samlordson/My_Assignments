package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 
		 //Launch URL
		 driver.get("http://leaftaps.com/opentaps/control/login");
		 driver.manage().window().maximize();
		 
		 //Enter credentials
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		 
		 ////Login
		 driver.findElement(By.xpath("//input[@value='Login']")).click();
		 
		 //Click CRM/SFA,Leads
		 driver.findElement(By.xpath("//div[@id='label']/a")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 
		 //Find Lead
		 driver.findElement(By.linkText("Find Leads")).click();
		 driver.findElement(By.linkText("Phone")).click();
		 driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9600084683");
		 driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
         Thread.sleep(3000);
         String text = driver.findElement(By.linkText("12765")).getText();
         System.out.println(text);
		 driver.findElement(By.linkText("12765")).click();
		 
		 //Delete Lead
		 driver.findElement(By.linkText("Delete")).click();
		 driver.findElement(By.linkText("Find Leads")).click();
		 driver.findElement(By.xpath("//input[@name=\"id\"]")).sendKeys("12765");
		 driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
	     System.out.println(driver.findElement(By.xpath("(//div[@class=\"x-paging-info\"])[1]")).isDisplayed());
		 driver.close();
		 
	}
	
}

		 
		 
		 