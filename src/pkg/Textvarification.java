package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textvarification {

	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://google.com");
		

	}
	
	@Test
	public void testverify()
	{
		String src=driver.getPageSource();
		if(src.contains("Gmail"))
				{
					System.out.println("Test is present");
				}
				else
				{
					System.out.println("Test is a absent");
				}
	}
		@After
		public void teardown()
		{
			driver.quit();
		}
				
	

}
