package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath 
{
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void login()
	{
		driver.findElement(By.id("email")).sendKeys("visakhkumarplr@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("bsgfhajgshaj");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath(//*[@id="pass"]));
	}
	
	@After
	public void Teardown()
	{
		//driver.quit();
	}
	
	
	



	}


