package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchSteps {

	WebDriver driver = null;

	@Given("The user is on google page")
	public void the_user_is_on_google_page() {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "/src/test/resources/Drivers/chromedriver");
		System.out.println("Code - the_user_is_on_google_page");

		System.out.println("path -----------" + path);
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.navigate().to("http://www.google.co.uk");
	}

	@When("The user enters search term")
	public void the_user_enters_search_term() {
		driver.findElement(By.name("q")).sendKeys("hello world");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("The user is displayed with results")
	public void the_user_is_displayed_with_results() {
		driver.findElement(By.id("search")).isDisplayed();
		driver.close();
		driver.quit();
		
	}
}
