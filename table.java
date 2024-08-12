package testng;


	import java.time.Duration;
	import java.util.List;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		public class tab {
		
		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://testautomationpractice.blogspot.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			WebElement table = driver.findElement(By.xpath("//table[@name='BookTable']"));
			List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr"));
			int rowsCount = rows.size();
			System.out.println("Total Number of Rows- " + rowsCount);//find total number of rows in Web Table
			List<WebElement>col =driver.findElements(By.xpath("//tbody/tr/th"));
			int columnscount=col.size();
			System.out.println("Total Number of Columns are- " + columnscount);//find total number of column in Web Table
			System.out.println();

		    
		    	    
		    List<WebElement> rows1 = table.findElements(By.xpath(".//tbody/tr"));
		    
		    for (WebElement row : rows1) {
		     List<WebElement> cols = row.findElements(By.xpath(".//td"));
		     for (WebElement col1 : cols) {
		      System.out.print(col1.getText() + " ");
		     }
		     System.out.println();
		    }

		    	    String cellData = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[2]/td[3]")).getText();
		    System.out.println("Data at row 2 and column 3: " + cellData);

		 
		 		System.out.println();
		 		System.out.println("Amit author");
		 		for (WebElement row : rows) 
		 		{
		 			List<WebElement> cells = row.findElements(By.tagName("td"));
		 			if (cells.size() >= 3) 
		 			{ 
		 				String bookName = cells.get(0).getText();
		 				String author = cells.get(1).getText();
		 				if (author.equals("Amit")) 
		 				{
		 					System.out.println(bookName);

		 				}
		 			}
		 		}

		 		
		 		double totalSum = 0;
		 		for (WebElement row : rows) {
		 		    List<WebElement> cells = row.findElements(By.tagName("td"));
		 		    if (cells.size() >= 4) {
		 		        String priceText = cells.get(3).getText().replace("$", "");
		 		        try {
		 		            double price = Double.parseDouble(priceText);
		 		            totalSum += price;
		 		        } catch (NumberFormatException e) {
		 		            System.out.println("Error: " + priceText);
		 		        }
		 		    }
		 		}
		 		System.out.println("Total sum of prices for all the books: $" + totalSum);}
		 		
		
		}


