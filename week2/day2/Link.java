package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://leafground.com/link.xhtml");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("(//a[text()='Go to Dashboard'])[1]")).click();
		 driver.get("https://leafground.com/link.xhtml");
	     System.out.println(driver.findElement(By.linkText("Find the URL without clicking me.")).getAttribute("href"));
	     
	     
	   
		 
		 

	}

}
