package avallainrelease;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {

	public static void main(String[] args) 
	{
		
		System.out.println("Welcome to java");
		
		int i=1;
		
		while(i<=10)
		{
			System.out.println("Hi " +i);
			i++;
		}
		
		System.setProperty("webdriver.chrome.driver", "F:\\RDPAutomation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"login-username\"]")).sendKeys("sara");
		
		boolean b = driver.findElement(By.xpath("//*[@id=\"login-signin\"]")).isEnabled();
		
		if(b==true)
		{
			System.out.println("Next button is enabled");
		}
		else
		{
			System.out.println("Next button is disabled");
		}

	}

}
