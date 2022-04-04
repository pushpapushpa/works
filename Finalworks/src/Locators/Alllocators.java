package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Alllocators {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	Thread.sleep(2000);
	
	driver.findElement(By.partialLinkText("Create New Account")).click();
	driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("pushpa");
	driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys("b m");
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("abc@gmail.com");
	driver.findElement(By.xpath("//input[contains(@name,'reg_passwd__')]")).sendKeys("Pushpabm@123");
	
	WebElement day=driver.findElement(By.cssSelector("select#day"));
Select option= new Select(day);
option.selectByValue("31");

	WebElement months=driver.findElement(By.cssSelector("select#month"));

	
}
}
