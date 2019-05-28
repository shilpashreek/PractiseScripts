import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Popup1
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://ksrtc.in/oprs-web/guest/home.do");
driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
Alert a = driver.switchTo().alert();
String text = a.getText();
System.out.print(text);
Thread.sleep(3000);
//a.accept();
a.dismiss();

	}

}
