import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTables {

	public static void main(String[] args) {

		String exptText ="Roland Mendel";
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		List<WebElement>wel=driver.findElements(By.xpath("//div/table[@id='customers']/tbody/tr"));
	
	    //"//div/table[@id='customers']/tbody/tr[3]/td[2]"
	
	   String beforexpath =" //div/table[@id='customers']/tbody/tr[";
	   String afterxpath ="]/td[2]";
	
	  for(int i=2;i<=wel.size();i++) {
		  String actXpath=beforexpath+ i +afterxpath;
	  WebElement welone= driver.findElement(By.xpath(actXpath));
		String actText =welone.getText() ; 
		  
	  if(actText.equalsIgnoreCase(exptText))
	  
	       System.out.println(welone.getText());
	 
		  else {
			  System.out.println("not found");
		  }
	  
	  }
	
	
	}

}
