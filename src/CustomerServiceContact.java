import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CustomerServiceContact {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Contact us")).click();
		Select s=new Select(driver.findElement(By.id("id_contact")));
		s.selectByValue("2");
		driver.findElement(By.id("email")).sendKeys("test@test.com ");
		driver.findElement(By.id("id_order")).sendKeys("12345");
		driver.findElement(By.name("message")).sendKeys("Hello and this is Nicholas Muyobo");
		driver.findElement(By.xpath("//button[@id='submitMessage']/span")).click();
		
		
		
		
		

	}

}
