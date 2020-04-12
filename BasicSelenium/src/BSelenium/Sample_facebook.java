package BSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.navigate().to("https://facebook.com");
		d.findElement(By.id("email")).sendKeys("s.sindhuja0@gmail.com");
		d.findElement(By.id("pass")).sendKeys(("sindu*143"));
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@value='Log In']")).click();
		Thread.sleep(2000);
		//d.findElement(By.id("userNavigationLabel")).click();
	}

}
