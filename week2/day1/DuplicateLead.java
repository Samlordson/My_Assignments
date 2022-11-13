package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
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
		 System.out.println("The Title is: " +driver.getTitle());
		 driver.findElement(By.linkText("Duplicate Lead")).click();
		 driver.findElement(By.id("createLeadForm_companyName")).clear();
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ITS");
		 driver.findElement(By.id("createLeadForm_firstName")).clear();
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sam");
		 
		 driver.findElement(By.name("submitButton")).click();
		 System.out.println("The Title is: " +driver.getTitle());

	}

}
