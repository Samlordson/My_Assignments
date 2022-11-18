package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 
		 //Launch browser
		 driver.get("https://leafground.com/checkbox.xhtml");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 //Basic Check box
		 driver.findElement(By.xpath("//div[@id='j_idt87:j_idt89']")).click();
		 
		 //Notification
		 driver.findElement(By.xpath("(//div[@id='j_idt87:j_idt91']/div)[2]")).click();
         
		 //Choose your favorite language(s)
		 driver.findElement(By.xpath("(//table[@id=\"j_idt87:basic\"]//div[@class='ui-chkbox ui-widget'])[1]")).click();
		
		 //Tri State Check box
		 driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']")).click();
		 
		 //Toggle Switch
		 driver.findElement(By.xpath("//div[@id='j_idt87:j_idt100']")).click();
		 
		 //Verify if check box is disabled
		 driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']")).click();
		 System.out.println(driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']")).isEnabled());
		 
		 //Select Multiple
		 driver.findElement(By.xpath("//div[@id='j_idt87:multiple']")).click();
		 driver.findElement(By.xpath("(//label[text()='London'])[2]")).click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  
		 
		 
         
		 

		 
		 

	}
	

}
