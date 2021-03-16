package avallainrelease;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	public WebDriver driver;
  @Test
  public void f() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver",
				"F:\\RDPAutomation\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	    Thread.sleep(5000);
	    driver.get("https://www.google.co.in");
	    driver.navigate().to("http://testgeneratoramericanthink2.conectia.es/login.php");
		Thread.sleep(1000);
  }
}
