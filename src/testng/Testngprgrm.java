package testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngprgrm {
	ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.facebook.com");
		System.out.println("urlloading");
	}
@Test(invocationCount = 3)     //(enabled=false )   (for not test )
public void test1()
{
	System.out.println("test 1");
}
@Test(priority = 2)
public void test2()
{
	System.out.println("test 2");
}
@Test(priority = 1)
public void test3()
{
	System.out.println("test 3");
}
@AfterMethod
public void after()
{
	System.out.println("after method");
}
@AfterTest
public void end()
{
	driver.quit();
}

}
