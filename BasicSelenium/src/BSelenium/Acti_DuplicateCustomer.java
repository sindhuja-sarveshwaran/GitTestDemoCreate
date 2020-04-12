package BSelenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Acti_DuplicateCustomer {
	public static void main(String[] args) {
		ChromeDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		d.get("http://qspiders/login.do");
		//login to actime
		d.findElement(By.name("username")).sendKeys("admin");
		d.findElement(By.name("pwd")).sendKeys("manager");
		d.findElement(By.xpath("//input[@type='submit']")).click();
		
		//click on project and customer link
		d.findElement(By.xpath("//a[contains(.,'Projects & Customers')]")).click();
		
		//click on Add New Customer
		d.findElement(By.xpath("//input[@value='Add New Customer']")).click();
		
		//Create customer
		d.findElement(By.name("name")).sendKeys("ICICI");
		d.findElement(By.name("createCustomerSubmit")).click();
		
		//Verify the success msg.
		String ExpRes="Customer \"ICICI\" already exists. Please choose another customer name.";
		String ActRes=d.findElement(By.xpath("//span[contains(.,'Customer \"ICICI\" already exists. Please choose another customer name.')]")).getText();
		Object obj;
		if (ActRes.contains(ExpRes))
		{
			System.out.println("Customer is already exists.");
		}
		else
		{
			System.out.println("Customer is not exists");
		}
		
		//Logout
		d.findElement(By.xpath("//img[@src='/img/default/top_nav/logout.gif']")).click();
		d.close();

	}

}
