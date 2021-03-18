package avallainrelease;

import org.openqa.selenium.By;

public class Verifythescore extends Avallainrele1
{
	String val;
	int b;
	public int verifyscore()
	{
	
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
}
