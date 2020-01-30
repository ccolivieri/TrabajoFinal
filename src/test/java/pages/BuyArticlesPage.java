package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BuyArticlesPage {

	private WebDriver driver;
	private By buttonAddArticleToChart;
	private By shoppingCart;
	private WebDriverWait wait;
	
	public BuyArticlesPage(WebDriver driver) {
		
		this.driver = driver;
		buttonAddArticleToChart = By.xpath("//*[@id=\"center_column\"]/ul/li/div/div/div[3]/div/div[2]/a[1]/span");
		//buttonAddArticleToChart = By.ByClassName.className("button ajax_add_to_cart_button btn btn-default");
		//shoppingCart = By.xpath("");
		//wait = new WebDriverWait(driver, 10);
	}
	
	public void addAnArticleToCart() {
		
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(buttonAddArticleToChart)));
		//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(buttonAddArticleToChart)));
		driver.findElement(buttonAddArticleToChart).click();
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/h2/text()")).getText().contains("Product successfully added to your shopping cart"));
	}
}
