package tests;

import org.testng.annotations.Test;

import commonSteps.Steps;

public class BuyArticlesTest extends Steps{

	
	
	@Test(description = "Agregar un artículo al carro de compras", enabled = true)
	public void addAnArticleToCart() {
		
		loginPage.loginUser("tenot18742@imail5.net", "abcde");
		categoryPage.clickOnT_ShirtsCategory();
		buyArticlesPage.addAnArticleToCart();
	}
	
	@Test(description = "Comprar artículo agregado al carro", enabled = false)
	public void buyArticles() {
		
		loginPage.loginUser("tenot18742@imail5.net", "abcde");
	}
}
