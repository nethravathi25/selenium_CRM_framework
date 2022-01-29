package ComCast.OrgTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CreateOrgsTest
{
	@Test(groups = "smokeTest")
	public void CreateOrgsTest()
	{
	/*	String browser= System.getProperty("BROWSER");
		String url= System.getProperty("URL");
	
		WebDriver driver=null;
		
		if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if (browser.equals("chrome")) 
		{
			driver=new ChromeDriver();
		} 
		
		driver.get(url);
		driver.close(); */
		
		System.out.println("Create Orgs Test");
	}
	
	@Test(groups = "regressionTest")
	public void orgTest()
	{
		System.out.println("orgTest");
	}

}
