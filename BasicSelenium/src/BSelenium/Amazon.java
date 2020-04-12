package BSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon {
	@Test
	//public static void main(String[] args)
	void testing {
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("http://amazon.com");
		

	}

}
