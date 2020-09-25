package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStep {
	
	WebDriver driver = null;
	
//	@Given("browser is open")
//	public void browser_is_open() {
//		System.out.println("Browser is open");
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().deleteAllCookies();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);	
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.get("https://classic.crmpro.com/index.html");
//	}
//	
//	//This is hard coded username and password
//	@When("user enter valid username and password")
//	public void user_enter_valid_username_and_password() {
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("batchautomation");
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@12345");	   
//	}
//
//	//Regular Expression -  (.*)
//	//Parameterizing without Example Keyword
////	@When("user enter invalid {string} and valid {string}")
//	@When("^user enter invalid (.*) and valid (.*)$")
//	public void user_enter_invalid_username_and_valid_password(String username, String password) {
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
//	}
//	
//	@When("^user enter valid (.*) and invalid (.*)$")
//	public void user_enter_valid_username_and_invalid_password(String username, String password) {
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
//	}
//
//	@And("click on login button")
//	public void click_on_login_button() {
//		driver.findElement(By.xpath("//input[@value='Login']")).click();
//	   
//	}
//	
//
//	@Then("user navigate to home page")
//	public void user_navigate_to_home_page() {
//		String title = driver.getTitle();
//		if(title.equalsIgnoreCase("CRMPRO")) {
//			System.out.println("Login with valid Credentials - PASS");
//		}else {
//			System.out.println("Login with valid Credentials - FAIL");
//		}
//		driver.quit();
//	   
//	}
//	
//	@Then("user not navigate to home page")
//	public void user_not_navigate_to_home_page() throws InterruptedException {
//		Thread.sleep(2000);
//		String title = driver.getTitle();
//		if(title.contains("software")) {
//			System.out.println("Login with invalid Credentials - PASS");
//		}else {
//			System.out.println("Login with invalid Credentials - FAIL");
//		}
//		driver.quit();
//	}
}
