package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount {
	ChromeDriver driver;
	
	@Before
	
		public void setup()
		{
		driver=new ChromeDriver();
		driver.get("http://https://register.rediff.com/register/register.php?FormName=user_details");
		}
	@Test
public void linkcount()
{
		List<WebElement>linklist=driver.findElements(By.tagName("a"));
		System.out.println("total number of links"+linklist.size());
}
}
