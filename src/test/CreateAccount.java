package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS); //this will wait for all the elements and is written only once - at class level
		
		WebElement CreateAccount = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		CreateAccount.click();
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		WebElement mobilenumber = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		WebElement password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		
		firstname.sendKeys("firstname");
		lastname.sendKeys("lastname");
		mobilenumber.sendKeys("945798474");
		password.sendKeys("Test@123");
		
		WebElement Day = driver.findElement(By.name("birthday_day"));
		Select ddDay = new Select(Day);
		ddDay.selectByVisibleText("23");
		
		WebElement Month = driver.findElement(By.name("birthday_month"));
		Select ddMonth = new Select(Month);
		//ddMonth.selectByVisibleText("Jun");
		//List <WebElement> Months  = ddMonth.getOptions();
		//List <WebElement> Months  = driver.findElements(By.name("birthday_month"));
		
//		List <WebElement> Months  = driver.findElements(By.xpath("//select[@name='birthday_month']/option"));
//		
//		for(WebElement elem : Months) {
//			System.out.println(elem.getText());
//		}
//		
		
		WebElement Year = driver.findElement(By.name("birthday_year"));
		
		Select ddYear = new Select(Year);
		System.out.println("selected option " + ddYear.getFirstSelectedOption().getText());
		
		
		ddYear.selectByVisibleText("1995");
		
//		WebElement Female = driver.findElement(By.xpath("//input[@type='radio' and @value='1']"));
//		WebElement Male = driver.findElement(By.xpath("//input[@type='radio' and @value='2']"));
//		WebElement Other = driver.findElement(By.xpath("//input[@type='radio' and @value='-1']"));
		
		String gender = "Female";
//		if(gender.equals("Male")) {
//			Male.click();
//		} else if(gender.equals("Female")) {
//			Female.click();
//		}else {
//			Other.click();
//		}
//		
//		System.out.println(Male.isSelected());
		
		//OR
//		WebElement GenderRadioBtn = driver.findElement(By.xpath("//label[text()='"+gender+"']/following-sibling::input"));
		
		//OR
//		Another way - to be checked 
		String Xpath = "//label[text()='Placeholder']/following-sibling::input";
		String newXpath = Xpath.replace("Placeholder", gender);
		
		WebElement GenderRadioBtn = driver.findElement(By.xpath(newXpath));
		GenderRadioBtn.click();
		
		System.out.println("Completed entering the details");
		//driver.close();
			

	}

}
