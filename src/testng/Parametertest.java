package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametertest {
	@Parameters("a")
	@Test
	public void test1(String a)
	{
		System.out.println("value="+a);
	}

}
