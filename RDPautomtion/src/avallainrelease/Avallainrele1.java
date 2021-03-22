package avallainrelease;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Avallainrele1 
{
	public WebDriver driver;
	//afafaf
	
	
	public WebDriverWait w;
	public String booklink="";
	
	
	int chk_correct_answers;
	int sum=0;
	String val;
	int b;
	
	@Test(priority =1)
	  public void login() throws InterruptedException, IOException 
	  {
		  System.setProperty("webdriver.chrome.driver", "F:\\RDPAutomation\\chromedriver.exe");
		  driver = new ChromeDriver();
		  
		  //Object Repository
		  Properties p = new Properties();
		  FileInputStream fi = new FileInputStream ("C:\\Users\\vrishin\\git\\repository2\\RDPautomtion\\src\\objres.properties");
		  p.load(fi);
		  
		  //launching the url
		  driver.get(p.getProperty("url"));//received the value from repository
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//*[@id=\"onboarding-header-login-btn\"]")).click();
		  
		  //wait until the user name is visible
		  w = new WebDriverWait(driver,20);
		  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"gigya-loginID-56269462240752180\"]")));

		  //username and password
		  driver.findElement(By.xpath("//*[@id=\"gigya-loginID-56269462240752180\"]")).sendKeys(p.getProperty("username"));
		  driver.findElement(By.xpath("//*[@id=\"gigya-password-56383998600152700\"]")).sendKeys(p.getProperty("password"));
		  
		  //click on login button
		  driver.findElement(By.xpath("//*[@id=\"gigya-login-form\"]/div[2]/div[1]/input")).click();
		  
		//wait until the bell icon is visible
		  
		  w = new WebDriverWait(driver,20);
		  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"tippyDropdownMenuButton\"]/i")));
		
		 driver.findElement(By.xpath("/html/body/app/div[2]/teacher/dashboard/div[1]/div/main/div/div/div[2]/ul/li[2]")).click();
	  }
	  @Test(priority =2)
	  public void dashboard() throws InterruptedException, IOException 
	  {
		
		  Properties p = new Properties();
		  FileInputStream fi = new FileInputStream ("C:\\Users\\vrishin\\git\\repository2\\RDPautomtion\\src\\objres.properties");
		  p.load(fi);
		  
		  //click on My library
		  //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  //System.out.println("2nd module");
		  
		  WebDriverWait w1 = new WebDriverWait(driver,10);
		  
		  w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"bundleName1\"]")));
		  
		  
		  driver.findElement(By.xpath("//*[@id=\"bundleName1\"]")).sendKeys(p.getProperty("bookname"));
		  driver.findElement(By.xpath("//*[@id=\"bundleName1\"]")).sendKeys(Keys.DOWN);
		  driver.findElement(By.xpath("//*[@id=\"bundleName1\"]")).sendKeys(Keys.DOWN);
		  driver.findElement(By.xpath("//*[@id=\"bundleName1\"]")).sendKeys(Keys.ENTER);
		  
		  //selecting the book
		  
		  driver.findElement(By.xpath("/html/body/app/div[2]/teacher/dashboard/div[1]/div/main/div/div/div[4]/div[3]/div[2]/div/div/div/a/p")).click();
		  
		  driver.findElement(By.xpath("(//div[text()='Practice Extra'])[1]")).click();
		  
	  }
	  
	  @Test(priority =3)
	  public void Activity1() throws InterruptedException 
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //System.out.println("module 3");
		 w = new WebDriverWait(driver,20);
		 w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='brand-img']")));
		 
		 String title1=driver.findElement(By.cssSelector("a[class='open-sidebar open-sidebar-btn']")).getText();//gets text of LO
	        System.out.println(title1);
		 
		 //switch to the frame
		 
		 driver.switchTo().frame("iframe_1612792865068-1612792877156-1612792901467");
		  
		//validate progress bar 1
		 
		 boolean prog = driver.findElement(By.xpath("//*[@id=\"activity-header\"]/ul")).isDisplayed();
		 if(prog==true)
		 {
			 System.out.println("The activity progress bar is in the first screen and at the top");
		 }
		 else
		 {
			 System.out.println("The activity progress bar is not in the first screen");
		 }
		 
		//validate rubric
		 
		 boolean rubric1 = driver.findElement(By.xpath("//*[@id='rubric-0']/div")).isDisplayed();
		 String rubric2 = driver.findElement(By.xpath("//*[@id='rubric-0']/div")).getText();
		 if(rubric1==true)
		 {
			 System.out.println("Rubric is present = " + rubric2);
		 }
		 else
		 {
			 System.out.println("Rubric is not present");
		 }
		 
		 //checking whether scorable or non scorable LO
		 
		 boolean sco = driver.findElement(By.xpath("//*[@class='content-wrap at-draggable']")).isDisplayed();
		 
		 if(sco==true)
		 {
			 System.out.println("Activity is scorable");
		 }
		 else
		 {
			 System.out.println("Activity is non scroable");
		 }
		 
		 //selecting the answer
		 driver.findElement(By.xpath("//*[@id=\"content-0\"]/div/div/div/div[1]/div/p[2]/span[1]/div/div[2]/div")).click();//clicks on empty box1
	     driver.findElement(By.xpath("//*[@id=\"content-0\"]/div/div/div/div[2]/div/div[1]/div[2]/div/div")).click();//clicks first ans
	     driver.findElement(By.xpath("//*[@id=\"content-0\"]/div/div/div/div[1]/div/p[3]/span[1]/div/div[2]/div")).click();//clicks on empty box2
	     driver.findElement(By.xpath("//*[@id=\"content-0\"]/div/div/div/div[2]/div/div[2]/div[2]/div/div")).click();//Clicks second ans
	     driver.switchTo().defaultContent();//switches back to default content
	     driver.findElement(By.xpath("//a[@title='Check']")).click();//clicks check
	       
	     
	     
	     //driver.findElement(By.cssSelector("a[title='Next']")).click();//clicks next
	    
	     //scoring check
	     
	     List<WebElement> ls = driver.findElements(By.xpath("//div[@class='place_holder']"));
	     System.out.println(ls.size()); 
	     
	     driver.switchTo().frame("iframe_1612792865068-1612792877156-1612792901467");
	     List<WebElement> cnt = driver.findElements(By.xpath("//div[@class='check correct']"));
	     chk_correct_answers=cnt.size();
	     System.out.println("Total correcr answers are:"+chk_correct_answers );
	     if(cnt.size()==(ls.size()))
	     {
	     System.out.println("All answer are correct");
	     }
	     else if(cnt.size()<=ls.size() && cnt.size()>0)
	     {
	     System.out.println("Some answers are incorrect");
	     }
	     else
	     {
	     System.out.println("All Incorrect");
	     }

	     driver.switchTo().defaultContent();

	     driver.findElement(By.xpath("//a[@class='btn' and @title='Next']")).click();
	     sum=sum+cnt.size();
	     System.out.println("sum is:"+ sum);
	     
	     int c=verifyscore();
	     System.out.println(c);
	     
	    /*score validation
	     Activity_Pages ap = new Activity_Pages();
	     String result = ap.navi_units();
	     System.out.println("Returning Results"+ result);
	     SoftAssert sa = new SoftAssert();
	     sa.assertEquals(result, 0, "Scored Nothing");
	     sa.assertEquals(result, 1, "Scored 1");
	     sa.assertEquals(result, 2, "Scored 2");*/
	     driver.findElement(By.cssSelector("a[title='REVIEW']")).click();//clicks review
	     driver.findElement(By.cssSelector("a[title='Next']")).click();//clicks next
	     
	     //validating next activity button
	     
	     boolean nextact = driver.findElement(By.cssSelector("a[class='nextActivityBtn btn']")).isDisplayed();
	     
	     if(nextact==true)
	     {
	    	 System.out.println("Next activity button is present");
	     }
	     else
	     {
	    	 System.out.println("Next activity button is missing");
	     }
	     driver.findElement(By.cssSelector("a[class='nextActivityBtn btn']")).click();//clicks nextactivity
		 
	     
		  
	  }
	  
	  public int verifyscore()
		{
		driver.switchTo().frame("iframe_1612792865068-1612792877156-1612792901467");
		val = driver.findElement(By.xpath("//div[@class='canvas-score-label']/strong")).getText();
		driver.switchTo().defaultContent();
		System.out.println("++++"+val);



		b = Integer.valueOf(val);

		if(chk_correct_answers==b)
		{
		System.out.println("Both Values are equal");
		}

		return b;
		}
	  
	  @Test(priority =4)
	  public void Activity2() throws InterruptedException, SikuliException
	    {
	        String title=driver.findElement(By.cssSelector("a[class='open-sidebar open-sidebar-btn']")).getText();//gets text of LO
	        System.out.println(title);
	        boolean t=driver.findElement(By.cssSelector("a[class='open-sidebar open-sidebar-btn']")).isDisplayed();//rubric is present
	        System.out.println(t);
	       
	        if(t)//if progress bar is present
	        {
	        driver.switchTo().frame("iframe_1612792865068-1612792877156-1612792924161");// switches to frame;
	        String rubric=driver.findElement(By.cssSelector("li[class='step current']")).getText();
	        System.out.println(rubric);
	        }
	        else
	        {
	            System.out.println("title not displayed");
	        }
	        String f_rubric=driver.findElement(By.cssSelector("div[class='rubricWrap']")).getText();//frame rubric
	        boolean fr=driver.findElement(By.cssSelector("div[class='rubricWrap']")).isDisplayed();
	        if(fr)
	        {
	        driver.findElement(By.cssSelector("div[class='place_holder']")).click();
	        driver.findElement(By.xpath("//*[@id=\"content-0\"]/div/div/div/div[2]/div/div[1]/div[2]/div/div/div")).click();//plays audio
	        Thread.sleep(8000);
	        
	        WebElement we=driver.findElement(By.xpath("//*[@id=\"content-0\"]/div/div/div/div[2]/div/div[1]/div[2]/div/div"));
	        JavascriptExecutor js = (JavascriptExecutor)driver;
	        js.executeScript("arguments[0].click();", we);
	        
	       /* WebElement we=driver.findElement(By.xpath("//*[@id=\"content-0\"]/div/div/div/div[2]/div/div[1]/div[2]/div/div"));
	        Actions a=new Actions(driver);
	        a.moveToElement(we,100,30).click();
	        a.doubleClick(we).build().perform();*/
	        
	       /* WebElement e = driver.findElement(By.xpath("//*[@id=\"content-0\"]/div/div/div/div[2]/div/div[4]/div[2]/div"));      
	        Actions a = new Actions(driver);
	        a.click(e).build().perform();
	        a.pause(200).build().perform();
	        a.doubleClick(e).build().perform();
	        
	        int x = e.getLocation().getX();
	        int y = e.getLocation().getY();
	        
	        a.moveToElement(e).build().perform();
	        
	        a.doubleClick(e).build().perform();*/
	        
	        //sikuli code
	        
	       /* Screen s = new Screen();
	        if(s.exists("F:\\RDPAutomation\\audioicon.png")!=null)
	        {
	        	s.click("F:\\RDPAutomation\\audioicon.png");
	        }
	        
	        s.click("F:\\RDPAutomation\\audioedgeclick.png");
	       
	        s.mouseMove(500,500);*/
	        
	       
	        //WebElement we=driver.findElement(By.xpath("//*[@id=\"content-0\"]/div/div/div/div[2]/div/div[1]/div[2]/div/div"));
	        //Actions a=new Actions(driver);
	        //a.moveToElement(we,300,550).click().build().perform();
	       
	    //    Point location = we.getLocation();
	        //  int x = location.getX();
	          //int y = location.getY();
	          //System.out.println("Coordinates of an element is : " + x + " and " + y);
	        }
	        else
	        {
	            System.out.println("rubric not displayed");
	        }
	       
	    }
	  
	}

