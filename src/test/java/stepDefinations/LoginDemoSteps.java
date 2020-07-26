package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDemoSteps {

	WebDriver driver = null;
	
	@Given("browser is open")
	public void browser_is_open() {
		
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "/src/test/resources/Drivers/chromedriver");
		System.out.println("Code - the_user_is_on_google_page");

		System.out.println("path -----------" + path);
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.navigate().to("http://www.google.co.uk");
	}

	@And("and user is on login page")
	public void and_user_is_on_login_page() {
		
		driver.navigate().to("https://example.testproject.io/web/");
	}

	@When("user enters user name and password")
	public void user_enters_username_and_password() throws InterruptedException {
		
		driver.findElement(By.id("name")).sendKeys("abc");
		driver.findElement(By.id("password")).sendKeys("12345");
		Thread.sleep(3000);
	}
	
	@And("user clicks login button")
	public void user_clicks_login_button() {
		
		driver.findElement(By.id("login")).click();
	}

	@Then("the user is navigated to the home page")
	public void the_user_is_navigated_to_the_home_page() throws InterruptedException {
		
		driver.findElement(By.id("logout")).isDisplayed();
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
}
