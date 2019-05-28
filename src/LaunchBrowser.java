import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://mail.primefocus.com/zimbra/#1");
		driver.findElement(By.id("username")).sendKeys("shilpashree.k@primefocus.com");
		driver.findElement(By.id("password")).sendKeys("Shilpa@9620");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("zti__main_Mail__5_textCell")).click();
        String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("https://mail.primefocus.com/zimbra/#1"))
		{
			System.out.println("inbox is displayed");
		}
			
		else
		{
			System.out.println("inbox is not displayed");
		}
	}

}
