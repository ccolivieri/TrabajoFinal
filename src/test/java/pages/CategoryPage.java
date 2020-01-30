package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CategoryPage {

	private WebDriver driver;
	private By womenCategory;
	private By dressesCategory;
	private By t_shirtsCategory;
	private String txt;
	
	public CategoryPage(WebDriver driver) {
		
		this.driver = driver;
		womenCategory = By.linkText("Women");
		dressesCategory = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a");
		t_shirtsCategory = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a");
	}
	
	public void clickOnWomenCategory() {
		
		driver.findElement(womenCategory).click();
		txt = driver.findElement(By.className("category-name")).getText();
		Assert.assertTrue(txt.contains("Women"), "No se pudo ingresar a la pestaña: " + txt);
	}
	
	public void clickOnDressesCategory() {
		
		driver.findElement(dressesCategory).click();
		txt = driver.findElement(By.className("category-name")).getText();
		Assert.assertTrue(txt.contains("Dresses"), "No se pudo ingresar a la pestaña: " + txt);
	}
	
	public void clickOnT_ShirtsCategory() {
		
		driver.findElement(t_shirtsCategory).click();
		txt = driver.findElement(By.className("category-name")).getText();
		Assert.assertTrue(txt.contains("T-shirts"), "No se pudo ingresar a la pestaña: " + txt);
	}
}
