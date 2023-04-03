package pkg;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	ChromeDriver driver;
	
		@Before
		public void setup()
		{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
		@Test
		public void screenshot() throws IOException
		{
			File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileHandler.copy(src,new File("c://error1.png"));

WebElement search=driver.findElement(By.name("q"));
File src2=search.getScreenshotAs(OutputType.FILE);
FileHandler.copy(src2,new File("./screenshot//error.png"));
}}