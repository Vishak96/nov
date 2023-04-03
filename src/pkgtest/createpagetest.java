package pkgtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pkgpom.Fbcreatepage;

public class createpagetest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void test()
	{
		Fbcreatepage ob=new Fbcreatepage(driver);
		ob.pageclick();
		ob.getstartedbutton();
	
	}
	

}
