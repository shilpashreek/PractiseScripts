import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://myfocus.primefocus.com/attendance/my-attendance");
		driver.findElement(By.id("username")).sendKeys("shilpashree.k");;
		driver.findElement(By.id("password")).sendKeys("April@0703");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[.='Login']")).click();
		
		

	}

}
