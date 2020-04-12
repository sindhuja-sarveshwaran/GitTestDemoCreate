package BSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMoveTest {

	public static void main(String[] args) {
		ChromeDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://flipkart.com");
		
		//close login window
		d.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		//Identify the Home & furniture dropdown menu
		WebElement wb=d.findElement(By.xpath("//span[text()='Home & Furniture']"));
		
		//create an object to Action class
		Actions act=new Actions(d);
		
		//Take move curzer on Home&Furniture element
		act.moveToElement(wb);
		
		//execute Actions class controls
		act.perform();
		
		d.findElement(By.linkText("Coffee Mugs")).click();
		
		d.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
