package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Titlevarification {

	public static void main(String[] args) {
		
		String exp="Google";
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		String actualtitle =driver.getTitle();
		System.out.println("actual title="+actualtitle);
		if(actualtitle.equals(exp))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		driver.quit();

	}

}
