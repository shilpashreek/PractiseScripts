import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchViacom
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
	  System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://viacom18.clearhub.tv/BC/Product/Modules/SignIn.aspx");
	  driver.findElement(By.id("x-username")).sendKeys("shilpashree.k");
	  Thread.sleep(3000);
	  driver.findElement(By.id("loginContinue")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.id("x-pwd")).sendKeys("Welcome@19");
	  driver.findElement(By.id("loginSubmit")).click();
	  Thread.sleep(10000);
	  driver.findElement(By.id("//input[@type='submit']']")).click();
	 

	}

}
