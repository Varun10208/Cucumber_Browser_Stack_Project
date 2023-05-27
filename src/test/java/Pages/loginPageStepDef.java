package Pages;

import java.time.Duration;


public class loginPageStepDef {
	WebDriver driver;
	BrowserStackHomePage objBrowserStackHomePage=null;
	BrowserStackSignUpPage objBrowserStackSignUpPage=null;
	@Given("Login Page is open")
	public void login_page_is_open() {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.browserstack.com/");
	}

	@When("click on login")
	public void click_on_login() {
	    // Write code here that turns the phrase above into concrete actions
		objBrowserStackHomePage = new BrowserStackHomePage(driver);
		objBrowserStackHomePage.veryHeader();
		objBrowserStackHomePage.clickOnGetStarted();
	}

	@Then("login page should open")
	public void login_page_should_open() {
	    // Write code here that turns the phrase above into concrete actions
		objBrowserStackSignUpPage = new BrowserStackSignUpPage(driver);
		objBrowserStackSignUpPage.veryHeader();
		objBrowserStackSignUpPage.enterFullName("TestUser");
		objBrowserStackSignUpPage.enterBusinessEmail("TestUser@gmail.com");
		objBrowserStackSignUpPage.enterPasswrod("TestUserPassword");
		driver.close();
	}
}
