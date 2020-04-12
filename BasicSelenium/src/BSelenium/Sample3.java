package BSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://google.com");
		
		WebElement wb1=d.findElement(By.name("q"));
		wb1.sendKeys("Testing");
		
		WebElement wb2=d.findElement(By.id("gsr"));
		wb2.click();
		
		d.close();
	}

}
