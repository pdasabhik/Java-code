import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Actionclass {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.etsy.com/in-en/market/esty_com");

	WebElement wel=driver.findElement(By.xpath("//span[@id='catnav-primary-link-10855']"));
	
	Actions act = new Actions(driver);
	      act.moveToElement(wel).perform();
	
	}

}
