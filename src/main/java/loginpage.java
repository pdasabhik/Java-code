import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class loginpage {

public static void main (String args[]) {
	
System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com/");
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
    driver.findElement(By.name("firstname")).sendKeys("Abhik");
    driver.findElement(By.name("lastname")).sendKeys("Sahoo");
    WebElement wel= driver.findElement(By.id("day"));
    Select sel = new Select(wel);
       
  boolean selType = sel.isMultiple();
  
  System.out.println(selType);
  
  if(selType ==true) {  
	  List<WebElement> welone = sel.getOptions();
	   for(int i=0;i<=welone.size();i++) {
        sel.selectByIndex(i);
		System.out.println(welone.get(i).getText());  
	   		}
	   }
  else {
	  List<WebElement> welone = sel.getOptions();
	   for(int i=0;i<=welone.size();i++) {
		System.out.println(welone.get(i).getText());
	   }
}

}

}
