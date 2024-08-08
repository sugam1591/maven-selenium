package maven_selenium;

import org.testng.annotations.Test;

public class day1 {
	@Test(priority=1)
	void openUrl()
	{
		System.out.println("Open URl");
	}
	
@Test(priority=2)
	void Login()
	{
		System.out.println("this is login ");
	}
@Test(priority=3)
	void logout()
	{
		System.out.println("this is logout");
		}	
	
}