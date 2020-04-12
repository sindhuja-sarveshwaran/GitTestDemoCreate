package BSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_Amazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		ChromeDriver d= new ChromeDriver();
		d.navigate().to("https://amazon.com");
		WebElement wb1=d.findElement(By.linkText("Your Amazon.com"));
		wb1.click();
		Thread.sleep(2000);
		d.navigate().back();
		Thread.sleep(2000);
		d.navigate().forward();
		Thread.sleep(2000);
		d.navigate().refresh();
		d.manage().deleteAllCookies();
		d.close();
	}

}
