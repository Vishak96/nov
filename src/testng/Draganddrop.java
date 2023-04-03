package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddrop {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://demoqa.com/droppable/");
	}
	@Test
	public void drgdrop()
	{
		WebElement dragme=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement drophere=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions a=new Actions(driver);
		a.dragAndDrop(dragme, drophere);
		a.perform();
		String exp=("Dropped!");
		String text=drophere.getText();
		if(exp.equals(text))
		{
			System.out.println("varified");
		}
		else
		{
			System.out.println("not varified");
		}
		
		
		
	}

}
