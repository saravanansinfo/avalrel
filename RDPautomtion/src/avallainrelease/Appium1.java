package avallainrelease;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Appium1 
{
	WebDriver driver;
	DesiredCapabilities caps = new DesiredCapabilities();
  @Test (priority=1)
  public void InitConfig() 
  {
	  caps.setCapability("deviceName", "8BGX19YUS");
	  caps.setCapability("platformName", "Android");
	  caps.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
	  caps.setCapability(CapabilityType.VERSION, "10");
	  
  }
  
  @Test (priority=2)
  public void testApp() throws MalformedURLException 
  {
	  driver= new RemoteWebDriver(new URL("https://0.0.0.0:4723/wd/hub"),caps);
	  driver.get("https://www.amazon.com");
	  driver.findElement(By.id("nav-search-keywords")).sendKeys("abcd");
	  
  }
}
