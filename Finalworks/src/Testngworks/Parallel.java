package Testngworks;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Parallel {
WebDriver driver;



	@BeforeMethod
	public void setbrowser() {
		System.setProperty("webdriver.chrome.driver","/.driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com");
	}
	
   @Test
    public void googletitle()
	{
		String title=driver.getTitle();
		System.out.println(title);
	}
   @Test
   public void register()
   {
	   driver.findElement(By.linkText("Register")).click();;
	     driver.findElement(By.xpath("//input[@id='gender-female']")).click();
	     driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("pogo");
	     driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("p");
	     driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("pogo1234@gmail.com");
	     driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("pogo1234");
	     driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("pogo1234");
	     driver.findElement(By.xpath("//input[@id='register-button']")).click();
   }
   @Test
   public void login()
   {
	   
	   driver.findElement(By.xpath("(//input[@name='pollanswers-1'])[2]")).click();
	   driver.findElement(By.xpath("//input[@id='vote-poll-1']")).click();
	   
   }
   @Test
   public void addBook()
   {
	   driver.findElement(By.xpath("//a[text()='Log in']")).click();
	   driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("pogo1234@gmail.com");
	   driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("pogo1234");
	   driver.findElement(By.xpath("(//a[contains(text(),'Books')])[3]")).click();
	    WebElement date = driver.findElement(By.xpath("//select[@id='products-orderby']"));
		Select dropdown = new Select(date);
		dropdown.selectByVisibleText("Name: Z to A");
		driver.findElement(By.xpath("(//input[@class='button-2 product-box-add-to-cart-button'])[1]")).click();
   }
   @AfterMethod
	public void tearDown()
	{
	driver.close();	
	}

		
		
}
