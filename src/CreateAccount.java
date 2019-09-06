import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

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
		driver.findElement(By.id("email_create")).sendKeys("nickmuyobo@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		driver.findElement(By.name("id_gender")).click();
		driver.findElement(By.name("customer_firstname")).sendKeys("Nicholas");
		driver.findElement(By.id("customer_lastname")).sendKeys("Muyobo");
		driver.findElement(By.id("passwd")).sendKeys("automation");
		driver.findElement(By.id("firstname")).sendKeys("Nicholas");
		driver.findElement(By.id("lastname")).sendKeys("Muyobo");
		driver.findElement(By.id("company")).sendKeys("PlanIT");
		driver.findElement(By.id("address1")).sendKeys("P.O.Box 5083919");
		driver.findElement(By.id("address2")).sendKeys("Gravida St.");
		driver.findElement(By.name("city")).sendKeys("Tamuning");
		Select s=new Select(driver.findElement(By.name("id_state")));
		s.selectByValue("47");
		driver.findElement(By.name("postcode")).sendKeys("55797");
		driver.findElement(By.name("other")).sendKeys("NON-APPLICABLE");
		driver.findElement(By.id("phone")).sendKeys("(662)661-1446");
		driver.findElement(By.name("phone_mobile")).sendKeys("(662)661-1447");
		driver.findElement(By.id("submitAccount")).click();
	

}
}
