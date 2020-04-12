package BSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_AmazonLoginErrorMsg {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.navigate().to("https://amazon.com");
		d.findElement(By.xpath("//span[contains(.,'Hello, Sign in')]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//span[contains(.,'Sign in')]")).click();
		Thread.sleep(3000);
		d.findElement(By.id("ap_email")).sendKeys("xyz");
		Thread.sleep(3000);
		d.findElement(By.id("continue")).click();
		String s=d.findElement(By.xpath("//h4[contains(.,'There was a problem')]")).getText();
		Thread.sleep(3000);
		System.out.println(s);
	}

}
