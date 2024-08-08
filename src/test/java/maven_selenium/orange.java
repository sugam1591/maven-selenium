package maven_selenium;


	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	public class orange {
		
		ChromeDriver driver;//global veriable
		@Test(priority=1)
		void tearUp() 
		{
			driver =new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		}
			@Test(priority=2)
		void logo() throws InterruptedException 
		{
				Thread.sleep(3000);	
			Boolean logo=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
			
			if (logo)
			{
				System.out.println("logo displayed");
			}
			else
			{
				System.out.println("logo Not displayed");
			}
		}
			@Test(priority=3)
		void Login() throws InterruptedException 
		{
			Thread.sleep(3000);	
			driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
			Thread.sleep(3000);	
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
			Thread.sleep(3000);	
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
		}
			@Test(priority=4)
			void tearDown() 
			{
					driver.close();
			}
		}


