package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class3 {

	 @Test
	  public void methodoneA() {
		  
		  System.out.print("inside method one A inside of class 3");	  
		  
		  System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver();
		  
		  driver.get("hhtps://www.amazon.com");
		  
		  driver.close();
	  }

	
}
 