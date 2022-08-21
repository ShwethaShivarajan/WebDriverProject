package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePickerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		WebElement date = driver.findElement(By.id("dob"));
		date.click();
		
		
		//Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@class='ui-datepicker-month']")));
        
		WebElement Month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		
		
		Select ddMon = new Select(Month);
		ddMon.selectByVisibleText("Feb");
		
		WebElement Year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select ddYear = new Select(Year);
		ddYear.selectByVisibleText("1996");
		
		
		WebElement ddDate = driver.findElement(By.xpath("//a[@data-date='1']"));
		ddDate.click();
	}

}
