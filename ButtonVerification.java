package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonVerification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 
		 //Launch URL
		 driver.get("https://leafground.com/button.xhtml");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 //getTitle
		 driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
		 System.out.println("The page title is "+driver.getTitle());
		 
		 //Is disabled
		 driver.get("https://leafground.com/button.xhtml");
		 System.out.println(driver.findElement(By.xpath("//button[@name='j_idt88:j_idt92']")).isEnabled());
		
		 // position of the Submit button
		 driver.get("https://leafground.com/button.xhtml");
		 System.out.println(driver.findElement(By.xpath("//button[@name=\'j_idt88:j_idt94\']")).getLocation());
		 
		 // color of save button
		 driver.get("https://leafground.com/button.xhtml");
		 System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Save')]")).getCssValue("ui-button-text ui-c"));
		 
         // Size of submit button
		 driver.get("https://leafground.com/button.xhtml");
		 System.out.println(driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']")).getSize());
		 
		 
		 
		 
		 
		 

	}

}
