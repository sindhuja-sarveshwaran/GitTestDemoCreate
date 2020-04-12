package BSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyGmailSearchBox {

	public static void main(String[] args) throws Throwable {
		ChromeDriver d=new ChromeDriver();
		d.get("https://gmail.com");
		String ExpRes="Gmail";
		String ActRes=d.getTitle();
		if (ExpRes.equals(ActRes))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		d.findElement(By.id("identifierId")).sendKeys("sindug2019@gmail.com");
		d.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(2000);
		d.findElement(By.name("password")).sendKeys("sindu*123");
		d.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(2000);
		
		//Verify Inbox page
		String ExpRes1="Inbox";
		String ActRes1=d.getTitle();
		if (ActRes1.contains(ExpRes1))
		{
			System.out.println("Inbox page is displayed");
		}
		else
		{
			System.out.println("Inbox page is not displayed");
		}
		
		//Identify search page
		
		 WebElement wb=d.findElement(By.name("q"));
		
		//Verify default value
		String actDefaultValue=wb.getAttribute("placeholder");
		System.out.println(actDefaultValue);
		
		//Verify the color
		String actColor=wb.getCssValue("color");
		System.out.println(actColor);
		
		//capture size of editbox
		Dimension dem=wb.getSize();
		System.out.println(dem.height);
		System.out.println(dem.width);
		
		//capture the location of the editbox
		Point p=wb.getLocation();
		System.out.println(p.getX());
		System.out.println(p.getY());
		
		//capture the data
		wb.sendKeys("Google");
		
		//close the browser
		//d.close();
	}

}
