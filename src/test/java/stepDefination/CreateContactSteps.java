//package stepDefination;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.SendKeysAction;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class CreateContactSteps {
//
//	WebDriver driver = null;
//
//	@Given("browser is open")
//	public void browser_is_open() {
//		System.out.println("Browser is open");
//		WebDriverManager.chromiumdriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().deleteAllCookies();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//		driver.get("https://classic.crmpro.com/index.html");
//	}
//
//	@When("^user enter valid (.*) and (.*)$")
//	public void user_enter_valid_username_and_password(String username, String password) {
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
//
//	}
//
//	@And("click on login button")
//	public void click_on_login_button() throws InterruptedException {
//		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", loginBtn);
//	}
//
//	@When("user navigate to new contact page")
//	public void user_navigate_to_new_contact_page() {
//		driver.switchTo().frame("mainpanel");
//		Actions action = new Actions(driver);
//		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(), 'Contacts')]"))).build().perform();
//		driver.findElement(By.xpath("//a[contains(text(), 'New Contact')]")).click();
//
//	}
//
//	@And("^user enters (.*) and (.*)  and (.*)$")
//	public void user_enters_and_and(String firstname, String lastname, String position) {
//		driver.findElement(By.id("first_name")).sendKeys(firstname);
//		driver.findElement(By.id("surname")).sendKeys(lastname);
//		driver.findElement(By.id("company_position")).sendKeys(position);
//		driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
//		String fullname = firstname + " " + lastname;
//		System.out.println("Contact Created: " + fullname);
//		try {
//			Thread.sleep(2000);
//			WebElement ele = driver.findElement(By.xpath("//td[contains(text(), '"+fullname+"')]"));
//			if(ele.isDisplayed()) {
//				System.out.println(fullname + " : Created Sucessfully - PASS");
//			}else {
//				System.out.println(fullname + " : NOT Created Sucessfully - FAIL");
//			}		
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
//
//	@Then("close browser")
//	public void close_browser() {
//	    driver.quit();
//	}
//
//}
