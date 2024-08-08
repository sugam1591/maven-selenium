package maven_selenium;


	import org.testng.annotations.Test;

	public class group {
		@Test(priority=1,groups= {"sanity","regression","functional"})
		void loginbyemail ()
		{
			System.out.println("this is login by email");
		}
		
	@Test(priority=2,groups= {"sanity"})
		void Loginbyfacebook()
		{
			System.out.println("this is facebook ");
		}
	@Test(priority=3,groups= {"sanity"})
		void logininbytwitter()
		{
			System.out.println("this is twitter");
			}	
		

	@Test(priority=4,groups= {"sanity","regression"})

	void signupbyemail()
	{
		System.out.println("this is email");
		}	

	@Test(priority=5,groups= {"regression"})
	void signupbyfacebook()
	{
		System.out.println("this is facebook");
		}
	@Test(priority=6,groups= {"regression"})
	void signupbytwitter()
	{
		System.out.println("this is twitter");
		}	


	@Test(priority=4,groups= {"sanity","regression"})

	void paymentinrupees()
	{
		System.out.println("this is rupees");
		}	



	@Test(priority=2,groups= {"sanity"})
	void paymentindollar()
	{
		System.out.println("this is dollar");
		}	

	@Test(priority=7,groups= {"regression"})
	void paymentreturnbybank()
	{
		System.out.println("return");
		}	

	}




