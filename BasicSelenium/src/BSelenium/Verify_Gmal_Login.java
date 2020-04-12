package BSelenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Gmal_Login {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://gmail.com");
		String ExpRes="Gmail";
		String ActRes=d.getTitle();
		if(ExpRes.equals(ActRes))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		d.findElement(By.id("identifierId")).sendKeys("abcd");
		d.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
String s=d.findElement(By.xpath("//span[@class='TQGan']//*[@class='stUf5b']/../..")).getText();
		
		
		Thread.sleep(2000);
		System.out.println(s);
		
		
		//Thread.sleep(2000);
		
		
		
		

	}

}
