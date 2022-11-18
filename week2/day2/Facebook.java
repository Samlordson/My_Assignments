package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 
		 //Launch URL
		 driver.get("https://en-gb.facebook.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 //Create Account
		 driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click();
		 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sara");
		 driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("S");
		 driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("9600084683");
		 driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys("sam");
		 driver.findElement(By.xpath("//select[@name=\"birthday_day\"]/option[@value='24']")).click();
		 driver.findElement(By.xpath("//select[@name=\"birthday_year\"]/option[@value='1996']")).click();
		 driver.findElement(By.xpath("//input[@name=\"sex\"]")).click();
		 
		 
		 

	}

}
