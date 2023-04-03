package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazonexpath {

	WebDriver driver;
	
	@Before
	public void setup()
	{
		driver=new EdgeDriver();
		driver.get("https://www.amazon.in");
		

	}
	@Test
	public void login()
	{
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("phone");
		driver.findElement(By.xpath("//a[@id='nav-cart']")).click();
		driver.findElement(By.xpath("//div[@id='nav-xshop']")).click();
	}

}
