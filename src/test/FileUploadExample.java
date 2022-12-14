package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement file = driver.findElement(By.id("uploadfile_0"));
		
		file.sendKeys("C:\\Users\\Sunshine\\Desktop\\uploadfile.txt");
		
		WebElement terms = driver.findElement(By.id("terms"));
		terms.click();
		
		WebElement submit = driver.findElement(By.id("submitbutton"));
		submit.click();
		
		WebElement message = driver.findElement(By.xpath("//h3[@id='res']/center"));
		System.out.println(message.getText());

	}

}
