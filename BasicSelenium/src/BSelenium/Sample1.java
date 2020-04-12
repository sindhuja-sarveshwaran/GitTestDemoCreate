package BSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.gmail.com");
		
		String expPage="Gmail";
		String actPage=d.getTitle();
		System.out.println(actPage);
		System.out.println("----------------------------------------------");
		
		String current_url=d.getCurrentUrl();
		System.out.println(current_url);
		System.out.println("----------------------------------------------");
		
		String PageSource=d.getPageSource();
		System.out.println(PageSource);
		System.out.println("----------------------------------------------");
		
		if(expPage.equals(actPage))
		{
			System.out.println("login page is displayed==pass");
		}
		else
		{
			System.out.println("login page is not displayed==fail");
		}
		d.close();
		
		}
	}


