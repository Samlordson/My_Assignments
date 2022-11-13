package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leafground {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://leafground.com/select.xhtml;jsessionid=node01726s9tfcenpf1bsn9pis5zxhx417425.node0");
		 driver.manage().window().maximize();
		 
		 //Select Drop down 
		 //Favorite Tool;
		 WebElement ele = driver.findElement(By.className("ui-selectonemenu"));
		 Select dropdown1=new Select(ele);
		 dropdown1.selectByVisibleText("Selenium");
		
		 //Country Drop down
		 driver.findElement(By.id("j_idt87:country_label")).click();
		 driver.findElement(By.id("j_idt87:country_1")).click();
		 Thread.sleep(3000);
		 
		 
		 //City Drop down
		 driver.findElement(By.id("j_idt87:city_label")).click();
		 driver.findElement(By.id("j_idt87:city_1")).click();
		 Thread.sleep(3000);
		 //Language Drop down
		driver.findElement(By.id("j_idt87:lang_label")).click();
		driver.findElement(By.id("j_idt87:lang_2")).click();
		Thread.sleep(3000);
		//Select 'Two' irrespective of the language chosen
		driver.findElement(By.id("j_idt87:value_label")).click();
		driver.findElement(By.id("j_idt87:value_1")).click();
		Thread.sleep(3000); 
		 
		//Get the title
		 System.out.println("The titLE is: "+driver.getTitle());
		 //verify title
		 if(driver.getTitle().contains("Select Components")) {
			 System.out.println("Yes");
		 }
			 else {
				 System.out.println("no");
			 }
		 //get current URL
		 System.out.println("The URL is:"+ driver.getCurrentUrl());
		 
		
		 
		 
		 
		 
		 
		 
	
				 
				 
			
		 }
		 
		 
	}


