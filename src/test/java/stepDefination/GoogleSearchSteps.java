package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.github.bonigarcia.wdm.WebDriverManager;



public class GoogleSearchSteps {

	WebDriver driver = null;
	
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Browser is open");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("User is on google search page");
		driver.get("https://www.google.com/");
	}

	@When("enter text in search box")
	public void enter_text_in_search_box() {
		System.out.println("Enter text in search box");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("naveen automation labs");
	}

	@And("click on serch button")
	public void click_on_serch_button() {
		System.out.println("Click on serch button");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
	}

	@Then("user navaigate to secrh page")
	public void user_navaigate_to_secrh_page() {
		System.out.println("User navaigate to secrh page");
		String actualTitle = driver.getTitle();
		if(actualTitle.equalsIgnoreCase("naveen automation labs - Google Search")) {
			System.out.println("Title Match");
		}else {
			System.out.println("Title Not Match");
		}
		driver.quit();
	}

}
