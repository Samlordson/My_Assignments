package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 
		//Launch URL
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 
		//Enter credentials
		 driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 
		//Login
		 driver.findElement(By.className("decorativeSubmit")).click();
		 
		 //Click CRM/SFA,Leads 
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 
		 //Create Lead
		 driver.findElement(By.linkText("Create Lead")).click();
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Samlordson");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R B");
		 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Samlordson");
		 driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("R B");
		 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automation");
		 driver.findElement(By.id("createLeadForm_description")).sendKeys("Testing");
		 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("samlordson96@gmail.com");
		 
		 WebElement ele = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		 Select dropdown=new Select(ele);
		 dropdown.selectByVisibleText("Alaska");
		 driver.findElement(By.name("submitButton")).click();
		 
		 //Edit Lead
		 driver.findElement(By.linkText("Edit")).click();
		 driver.findElement(By.id("updateLeadForm_description")).clear();
		 driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("locators");
		 driver.findElement(By.name("submitButton")).click();
		 System.out.println("The Title is: " +driver.getTitle());
		 

	}

}
