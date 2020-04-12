package BSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMoveFlipkart {

	public static void main(String[] args) {
		ChromeDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		d.get("https://flipkart.com");
		d.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		WebElement wb=d.findElement(By.xpath("//span[contains(.,'Sports, Books & More')]"));
		Actions act=new Actions(d);
		act.moveToElement(wb);
		act.perform();
		d.findElement(By.xpath("//a[@title='Chocolates']")).click();
		d.close();
	}

}
