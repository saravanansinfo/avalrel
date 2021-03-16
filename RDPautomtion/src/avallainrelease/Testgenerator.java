package avallainrelease;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Testgenerator 
{
public WebDriver driver;
/*private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
public String url = "http://testgeneratoramericanthink2.conectia.es/login.php";
public String usd = "asadana@cambridge.org";
public String pwd = "england";
public String g;*/

/*public Timestamp timename(String g)
{
	Timestamp g1 = new Timestamp(System.currentTimeMillis());
    System.out.println(g1);
	 System.out.println(sdf.format(g1));
	return g1;
}*/
//Launch the website
@Test(priority =1)
public void launch() throws InterruptedException 
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
//Login to the webpage
	@Test(priority =2)
	 public void login() throws InterruptedException 
	  {
		
		driver.findElement(By.name("usuario")).sendKeys("asadana@cambridge.org"); 
		driver.findElement(By.name("clave")).sendKeys("england"); 
		driver.findElement(By.xpath("//*[@class='boton']")).click();
	  }
	//Validate the home page
	@Test(priority =3)
	 public void validatehomepage() throws InterruptedException 
	  {
		
		driver.findElement(By.linkText("Unit and Extension test")).isDisplayed(); 
		
	  }
	
	 //Click on unit button
	@Test(priority =4)
	  public void unitbutton() throws InterruptedException 
	  {
		driver.findElement(By.xpath("//*[@href='unit_test.php']")).click();
		Thread.sleep(1000);
		
	  }
	@Test(priority =5)
	 public void validateunitandexte() throws InterruptedException 
	  {
		
		driver.findElement(By.linkText("Ready-made")).isDisplayed(); 
		
	  }
	//Select the units
	@Test(priority =6)
	  public void selectunit() throws InterruptedException, BiffException, IOException 
	  {
		    File f=new File("F:\\RDPAutomation\\UserOptions.xls");
		    Workbook rwb=Workbook.getWorkbook(f);
		    Sheet rsh=rwb.getSheet(0);
		    int nour=rsh.getRows();
		    int nouc=rsh.getColumns();
		    System.out.println("Total number of units:");
		    System.out.println(nour);
		    System.out.println(nouc);
		    List<WebElement> ls=driver.findElements(By.xpath("//input[contains(@type, 'checkbox')]"));
		       int w=ls.size();
		       System.out.println(w);
		       for(int i=0;i<nour;i++)
		         {
		           int y=Integer.parseInt(rsh.getCell(1, i).getContents());
		             if(y==1)
		                {
		                    //driver.findElements(By.xpath("(//input[contains(@type, 'checkbox')])["+i+"]"));
		                    ls.get(i).click();
		                }
		            
		         }  
		
	  }
	//Readymade test
	@Test(priority =7)
	  public void readymade() throws InterruptedException
	  {
		driver.findElement(By.xpath("//*[text()='Ready-made']")).click();
	    Thread.sleep(5000);
	  }
	//Select Autotest
	@Test(priority =8)
	  public void autotest() throws InterruptedException
	  {
		driver.findElement(By.xpath("//*[contains(text(), 'Select')]")).click();
        Thread.sleep(3000);
        List<WebElement> ls1=driver.findElements(By.xpath("//*[contains(@name, 'activity_')]"));
           int w1=ls1.size();
           System.out.println(w1);
           for(int f=1;f<=w1;f++)
           {
           Select s = new Select(driver.findElement(By.xpath("(//*[contains(@name, 'activity_')])["+f+"]")));
           List<WebElement> r=s.getOptions();
           s.selectByIndex((r.size()-1));
          
                         
           }
	  }
	@Test(priority =9)
	 public void validateauto() throws InterruptedException 
	  {
		
		driver.findElement(By.xpath("//*[text()='Aut']")).isDisplayed(); 
		
	  }
	//Giving name to the auto test
	@Test(priority =10)
	  public void newtest() throws InterruptedException
	  {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter Auto test name");
		String auto = sc.nextLine();*/
		
		/*Timestamp g1 = new Timestamp(System.currentTimeMillis());
       	driver.findElement(By.name("nombre")).sendKeys("Auto_"+sdf.format(g1));*/
        
		//Timestamp autotime = timename(g);
       	driver.findElement(By.name("nombre")).sendKeys("Auto");
       	Thread.sleep(5000);
       	driver.findElement(By.linkText("Generate")).click();
        Thread.sleep(5000); 
        driver.findElement(By.linkText("click here")).click();
        Thread.sleep(5000);
	  }
	//Click the select the questions
	@Test(priority =11)
	  public void selectquestion() throws InterruptedException
	  {
		driver.findElement(By.xpath("//a[text()='Select the questions']")).click();
        Thread.sleep(5000);
	  }
	@Test(priority =12)
	 public void validatemanual() throws InterruptedException 
	  {
		
		driver.findElement(By.xpath("//*[text()='Manua']")).isDisplayed(); 
		
	  }
	@Test(priority =13)
	public void manualtest() throws Exception
    {
        driver.findElement(By.linkText("Manual")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//*[@src='img/abrir.png'])[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//*[@src='img/abrir.png'])[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//*[@src='img/abrir.png'])[3]")).click();
        Thread.sleep(3000);
       
        driver.findElement(By.xpath("(//*[contains(@id, 'tick_')])[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//*[contains(@id, 'tick_')])[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//*[contains(@id, 'tick_')])[3]")).click();
        Thread.sleep(3000);
        
        
        /*List<WebElement> ls2=driver.findElements(By.xpath("//*[contains(@id, 'imagen')]"));
        int w2=ls2.size();
        System.out.println(w2);
        for(int p=0;p<w2;p++)
        {
          //driver.findElements(By.xpath("(//*[@id='imagen'])["+p+"]"));
          //Thread.sleep(5000);
          driver.findElements(By.xpath("(//*[@src='img/abrir.png'])["+p+"]"));
          ls2.get(p).click();
          //.//*[@src='img/abrir.png']
          //Thread.sleep(5000);
        }
        
       
        
        List<WebElement> ls3=driver.findElements(By.xpath("(//*[contains(@id, 'tick_')])"));
          int w3=ls3.size();
          System.out.println(w3);
          for(int k=0;k<w3;k++)
          {
              driver.findElements(By.xpath("(//*[contains(@id, 'tick_')])["+k+"]"));
              ls3.get(k).click();
              k=k+50;
              Thread.sleep(5000);
          }*/
    }
	@Test(priority =14)
	  public void newtest1() throws InterruptedException
	  {
		Thread.sleep(3000);
	  driver.findElement(By.name("nombre")).sendKeys("manual");
	  Thread.sleep(3000); 
      driver.findElement(By.linkText("Generate")).click();
      Thread.sleep(5000); 
      driver.findElement(By.linkText("click here")).click();
      Thread.sleep(5000);
	  }
	@Test(priority =15)
	public void skilltest() throws Exception
    {
		driver.findElement(By.linkText("Tests")).click();
        Thread.sleep(5000);
      driver.findElement(By.xpath("//*[@href='skill_test.php']")).click();
      Thread.sleep(3000);
       // List<WebElement> lang=driver.findElements(By.xpath("(//*[contains(@href, 'dlreadymade')])"));
        int j=1;
        while(j<=1)
        {
            WebElement e=driver.findElement(By.xpath("(//*[contains(@href, 'dlreadymade')])"+ "["+j+"]"));
            e.click();
            j++;
           

        }
    }
	
	@Test(priority =16)
	 public void validateskill() throws InterruptedException 
	  {
		
		driver.findElement(By.linkText("Download test")).isDisplayed(); 
		
	  }
	@Test(priority =17)
	 public void mytest() throws Exception
     {
        driver.findElement(By.linkText("Tests")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//*[contains(text(), 'Test without')])[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//*[contains(text(), 'Test with answers')])[1]")).click();
        Thread.sleep(5000);
        /*driver.findElement(By.xpath("(//*[contains(text(), 'Test without')])[2]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//*[contains(text(), 'Test with answers')])[2]")).click();
        Thread.sleep(5000);*/
        
     }
	@Test(priority =18)
	 public void validatechange() throws InterruptedException 
	  {
		
		driver.findElement(By.linkText("Change")).isDisplayed(); 
		
	  }
	@Test(priority =19)
	public void changemanual() throws Exception
    {
        driver.findElement(By.linkText("Change")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//*[contains(@id, 'imagen')])[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//*[contains(@id, 'tick_')])[1]")).click();
        Thread.sleep(5000);
      driver.findElement(By.xpath("(//*[contains(@id, 'tick_')])[2]")).click();
      Thread.sleep(5000);
                     
    }
	@Test(priority =20)
	 public void validatechangemanual() throws InterruptedException 
	  {
		
		driver.findElement(By.xpath("//*[text()='Manual']")).isDisplayed(); 
		
	  }
	@Test(priority =21)
	  public void newtest2() throws InterruptedException
	  {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter Manual test name");
		String auto = sc.nextLine();*/
		Thread.sleep(3000);
		driver.findElement(By.name("nombre")).sendKeys("manualchange");
		Thread.sleep(3000);
    driver.findElement(By.linkText("Generate")).click();
    Thread.sleep(5000); 
    driver.findElement(By.linkText("click here")).click();
    Thread.sleep(5000);
	  }
	@Test(priority =22)
	 public void mytest1() throws Exception
    {
       driver.findElement(By.linkText("Tests")).click();
       Thread.sleep(5000);
       /*driver.findElement(By.linkText("Test without answers")).click();
       Thread.sleep(5000);
       driver.findElement(By.linkText("Test with answers")).click();
       Thread.sleep(5000);*/
       
    }
	@Test(priority =23)
	public void delete() throws Exception
    {
   
    driver.findElement(By.linkText("Delete")).click();
    Thread.sleep(3000);
       driver.switchTo().alert().dismiss();
       Thread.sleep(3000);
       driver.findElement(By.linkText("Delete")).click();
       Thread.sleep(3000);
       driver.switchTo().alert().accept();
       Thread.sleep(3000);
    }
	@Test(priority =24)
	 public void exit() throws Exception
     {
        driver.findElement(By.xpath("//img[@alt='Close']")).click();
        Thread.sleep(3000);
        driver.close();
     }
}
