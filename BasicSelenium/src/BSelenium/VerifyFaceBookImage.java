package BSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class VerifyFaceBookImage {

	public static void main(String[] args) {
		ChromeDriver d=new ChromeDriver();
		d.get("https://facebook.com");
		String s="//img[@src='https://static.xx.fbcdn.net/rsrc.php/v3/yi/r/OBaVg52wtTZ.png']";
		WebElement wb=d.findElement(By.xpath(s));
		Boolean res=wb.isDisplayed();
		if (res)
		{
			System.out.println("image is displayed");
		}
		else
		{
			System.out.println("image is not displayed");
		}
		boolean radio1=d.findElement(By.id("u_0_6")).isSelected();
		boolean radio2=d.findElement(By.id("u_0_7")).isSelected();
		boolean radio3=d.findElement(By.id("u_0_8")).isSelected();
		if (radio1==false & radio2==false & radio3==false)
		{
			System.out.println("Radiobutton is not Selected");
		}
		else
		{
			System.out.println("Radiobutton is selected");
		}
	}

}
