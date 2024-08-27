package cucumber;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {

	private WebDriver driver;

	@Given("testuser01 is registered user on TestMeApp")
	public void testuser01_is_registered_user_on_test_me_app() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shivani.ankam\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://lkmdemoaut.accenture.com/TestMeApp/login.htm");
		driver.manage().window().maximize();

	}

	@When("testuser01 enter correct credentials")
	public void testuser01_enter_correct_credentials() {
		driver.findElement(By.id("userName")).sendKeys("testuser01");
		driver.findElement(By.id("password")).sendKeys("pass123");

	}

	@When("logins")
	public void logins() {
		driver.findElement(By.name("Login")).click();
	}

	@Then("TestMeApp renders to testuser01 home page")
	public void test_me_app_renders_to_testuser01_home_page() {
		Assert.assertEquals("Home", driver.getTitle());
	}
}
