import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class popup3 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://192.168.150.205:1000/CE/product/modules/signin.aspx?viacom18digital");
		driver.findElement(By.xpath("//input[@id='x-user']")).sendKeys("vc_user");
		driver.findElement(By.xpath("//input[@id='Continue']")).click();
		driver.findElement(By.xpath("//input[@id='x-password']")).sendKeys("Plan@9620");
		driver.findElement(By.xpath("//input[@type='image']")).click();
		

	}

}
