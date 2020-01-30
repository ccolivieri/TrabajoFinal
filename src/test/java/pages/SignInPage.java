package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SignInPage {

	private WebDriver driver;
	private By signIn;
	private By emailAddress;
	private By buttonCreateAnAccount;
	private By txtCreateAnAccount;
	private By selectState;
	private String txt;
	
	public SignInPage(WebDriver driver) {
		
		this.driver = driver;
		signIn = By.className("login");
		emailAddress = By.id("email_create");
		buttonCreateAnAccount = By.xpath("//*[@id=\"SubmitCreate\"]/span");
		selectState = By.id("id_state");
	}
	
	public void clickOnSignIn() {
		
		driver.findElement(signIn).click();
	}
	
	public void setEmailAddress(String email) {
		
		driver.findElement(emailAddress).sendKeys(email);
		driver.findElement(buttonCreateAnAccount).click();
	}
	
	public void setInfoNewAccount() {
		
		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("Carlos");
		driver.findElement(By.id("customer_lastname")).sendKeys("Olmos");
		driver.findElement(By.id("passwd")).sendKeys("abcde");
		driver.findElement(By.id("address1")).sendKeys("Ayacucho 1029");
		driver.findElement(By.id("city")).sendKeys("La Pampa");
		Select state = new Select(driver.findElement(selectState));
		state.selectByValue("1");
		driver.findElement(By.id("postcode")).sendKeys("35004");
		Select country = new Select(driver.findElement(By.id("id_country")));
		country.selectByVisibleText("United States");
		driver.findElement(By.id("phone_mobile")).sendKeys("34645733891");
		driver.findElement(By.id("alias")).sendKeys("San Martin 28");
		driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span")).click();
		txt = driver.findElement(By.className("info-account")).getText();
		//txt = driver.findElement(By.xpath("//span[contains(string(),'Carlos Olmos')]")).getText();
		Assert.assertTrue(txt.contains("Welcome to your account"), "La cuenta no fué creada con éxito");
	}
	
	public void personalInformation() {
		
		//txt = driver.findElement(txtCreateAnAccount.className("page-heading")).getText();
		txt = driver.findElement(txtCreateAnAccount.xpath("//*[@id=\"account-creation_form\"]/div[1]/h3")).getText();
		//Assert.assertTrue(txt.contains("Create an account"));
		Assert.assertEquals(txt, "YOUR PERSONAL INFORMATION");
	}
}
