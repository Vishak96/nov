package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {
	
	ChromeDriver driver;

	
		
		@Before
		public void setup()
		
		{ 
			driver=new ChromeDriver();
		driver.get("https://google.com");

		}
		
		@Test
		public void titlevarification()
		{
			String exp="google";
					
		}
			
		
		@After
		public void teardown()
		{
			driver.quit();
		}
		
	}


