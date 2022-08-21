package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

		List<WebElement> Rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		System.out.println("Total number of rows are " + Rows.size());
		
		List<WebElement> Columns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th"));
		System.out.println("Total number of rows are " + Columns.size());
		
		
		WebElement data1 = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[4]/td[1]"));
		System.out.println("The third rows and 1st column data" + data1.getText());
		
//		for(WebElement row: Rows) {
//			
//			List<WebElement> AllCell = row.findElements(By.tagName("td"));  //use row instead of driver.findelem
//			for(WebElement cell:AllCell) {
//				System.out.print(cell.getText() + "\t");
//				
//			}
//			System.out.println();
//		}
		
		// OR
//		for(int r=1; r<=Rows.size(); r++) {
//			
//			for(int c=1; c<=Columns.size(); c++) {
//				
//				WebElement cell = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+r+"]/*["+c+"]"));
//				System.out.print(cell.getText() + "\t");
//			}
//			
//			System.out.println();
//		}
		
		// To find the country for the company value
		String Company = "Laughing Bacchus Winecellars";
		
		String Xpath = "//td[text()='"+ Company+"']/following-sibling::td[2]";
		
		WebElement Country = driver.findElement(By.xpath(Xpath));
		System.out.println("The country is " + Country.getText());
		
		
		
		driver.close();
	}

}
