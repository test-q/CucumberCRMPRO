//package stepDefination;
//
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class CreateDealSteps {
//
//	WebDriver driver = null;
//
//	@Given("brower is open")
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
//	@When("^user enter valid username and password$")
//	public void user_enter_valid_username_and_password(DataTable credentials) {
//		List<List<String>> data = credentials.asLists();
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(data.get(0).get(0)); // represent row 0 and
//																								// and first column
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(data.get(0).get(1)); // represent row 0 and
//																								// and second column
//
//	}
//
//	@And("click on login button")
//	public void click_on_login_button() throws InterruptedException {
//		driver.findElement(By.xpath("//input[@value='Login']")).click();
//	}
//
//	@When("user navigate to new deal page")
//	public void user_navigate_to_new_deal_page() {
//		driver.switchTo().frame("mainpanel");
//		Actions action = new Actions(driver);
//		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(), 'Deals')]"))).build().perform();
//		driver.findElement(By.xpath("//a[contains(text(), 'New Deal')]")).click();
//	}
//
//	@When("user enters deal details")
//	public void user_enters_deal_details(DataTable dealData) {
//		List<List<String>> dealValues = dealData.asLists();
//		driver.findElement(By.id("title")).sendKeys(dealValues.get(0).get(0));
//		driver.findElement(By.id("amount")).sendKeys(dealValues.get(0).get(1));
//		driver.findElement(By.id("probability")).sendKeys(dealValues.get(0).get(2));
//		driver.findElement(By.id("commission")).sendKeys(dealValues.get(0).get(3));
//
//		driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
//		String dealName = dealValues.get(0).get(0);
//		System.out.println("Deal Created: " + dealName);
//		try {
//			Thread.sleep(2000);
//			WebElement ele = driver.findElement(By.xpath("//td[contains(text(), '" + dealName + "')]"));
//			if (ele.isDisplayed()) {
//				System.out.println(dealName + " : Created Sucessfully - PASS");
//			} else {
//				System.out.println(dealName + " : NOT Created Sucessfully - FAIL");
//			}
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//
//	}
//
//	@Then("close browser")
//	public void close_browser() {
//		driver.quit();
//	}
//
//}
