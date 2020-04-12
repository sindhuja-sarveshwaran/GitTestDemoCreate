package BSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://gmail.com");
		WebElement wb1=d.findElement(By.id("identifierId"));
		wb1.sendKeys("sindug2014@gmail.com");
		
		WebElement wb2=d.findElement(By.xpath("//span[@class='RveJvd snByac']"));
		wb2.click();
		Thread.sleep(3000);
		
		WebElement wb3=d.findElement(By.name("password"));
		wb3.sendKeys("sindu*123");
		Thread.sleep(3000);
		
		WebElement wb4=d.findElement(By.xpath("//span[@class='RveJvd snByac']"));
		wb4.click();
		Thread.sleep(8000);
		
		d.findElement(By.xpath("//span[@class='gb_xa gbii']")).click();
		d.findElement(By.id("gb_71")).click();
		d.close();
	}

}
