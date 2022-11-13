package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginpage {

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
		 WebElement ele = driver.findElement(By.id("createLeadForm_dataSourceId"));
		 Select dropdown=new Select(ele);
		 dropdown.selectByValue("LEAD_DIRECTMAIL");
		 driver.findElement(By.name("submitButton")).click();
		 
		 
		 
		 
	

}
}
