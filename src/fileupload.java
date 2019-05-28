import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fileupload {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/shilpashree.k/Desktop/Browse.html");
		WebElement ele = driver.findElement(By.id("uploadfile"));
		ele.sendKeys("C:\\Users\\shilpashree.k\\Desktop\\cm-filter.PNG");
		

	}

}
