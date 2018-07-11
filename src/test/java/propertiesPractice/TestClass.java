package propertiesPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {
	WebDriver driver;

	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();

	}

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void loginTest() {
		String website = Loader.getMyValue("url");
		driver.get(website);
		driver.findElement(By.xpath("//a[@class='login']")).click();
		String user=Loader.getMyValue("username");
		driver.findElement(By.id("email")).sendKeys(user);
		String pswd=Loader.getMyValue("password");
		driver.findElement(By.id("passwd")).sendKeys(pswd);
		driver.findElement(By.id("SubmitLogin")).click();
	}
}
