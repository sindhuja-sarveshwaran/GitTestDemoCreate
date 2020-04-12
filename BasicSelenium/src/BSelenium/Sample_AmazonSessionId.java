package BSelenium;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_AmazonSessionId {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://amazon.com");
		
		//get the session id
		String SessionId=d.getWindowHandle();
		System.out.println(SessionId);
		
		//to maximize the window
		d.manage().window().fullscreen();
		Thread.sleep(2000);
		
		//change the size of the browser
		Dimension dim=new Dimension(300,300);
		d.manage().window().setSize(dim);
		Thread.sleep(2000);
		
		//maximize the window
		d.manage().window().maximize();
		Thread.sleep(2000);
		
		d.close();
		//d.quit();

	}

}
