package commonSteps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import pages.SearchPage;
import pages.SignInPage;
import pages.BuyArticlesPage;
import pages.CategoryPage;
import pages.LoginPage;

public class Steps {
	
	protected WebDriver driver;
	protected SearchPage searchPage;
	protected CategoryPage categoryPage;
	protected SignInPage signInPage;
	protected LoginPage loginPage;
	protected BuyArticlesPage buyArticlesPage;
	
	@BeforeMethod
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.navigate().to("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		searchPage = new SearchPage(driver);
		categoryPage = new CategoryPage(driver);
		signInPage = new SignInPage(driver);
		loginPage = new LoginPage(driver);
		buyArticlesPage = new BuyArticlesPage(driver);
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.close();
		driver.quit();
	}
}
