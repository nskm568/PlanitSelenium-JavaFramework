import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlreadyRegistered {


	public WebDriver driver;
	
	@Before
	public void setup() {
					
	}
	@Test
	public void CreateUserAccount() {
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("email")).sendKeys("nskm568@gmail.com");
		driver.findElement(By.name("passwd")).sendKeys("automation");
		driver.findElement(By.id("SubmitLogin")).click();
	
}
}
