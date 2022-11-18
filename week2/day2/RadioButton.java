package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://leafground.com/radio.xhtml");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//label[@for='j_idt87:console1:0']")).click();
		 driver.findElement(By.xpath("(//div[@class=\"ui-g-12 ui-md-4\"]/div)[1]")).click();
		 System.out.println(driver.findElement(By.xpath("(//label[text()='Safari'])[2]")).getText());	 

		
	}

}
