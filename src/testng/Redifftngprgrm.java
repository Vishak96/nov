package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Redifftngprgrm {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void radio()
	{
		WebElement radiobutton=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]"));
		Boolean b= radiobutton.isSelected();
		if(b)
		{
			System.out.println("radio button is selected");
		}
		else
		{
			System.out.println("not selected");
		}
	}
	@Test
	public void logo()
	{
		WebElement logo=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img"));
		Boolean b= logo.isDisplayed();
		if(b)
		{
			System.out.println("logo present");
		}
		else
		{
			System.out.println("logo absent");
		}
	}

	
		

	}


