package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement button1 = driver.findElement(By.id("alertButton"));
		button1.click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		WebElement button2 = driver.findElement(By.id("confirmButton"));
		button2.click();
		
		alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.dismiss();
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		WebElement button3 = driver.findElement(By.id("promtButton"));
		button3.click();
		
		alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys("This is a sample text");
		alert.accept();

		
	//	switchTo.DefaultContent - 
	}

}
