package tests;

import org.testng.annotations.Test;

import commonSteps.Steps;

public class CategoryTest extends Steps{
	
	@Test(description = "Acceder a pesta�a Woman", enabled = false)
	public void womenCategory() {
		
		categoryPage.clickOnWomenCategory();
	}
	
	@Test(description = "Acceder a pesta�a Dresses", enabled = false)
	public void dressesCategory() {
		
		categoryPage.clickOnDressesCategory();
	}
	
	@Test(description = "Acceder a pesta�a T-shirts", enabled = false)
	public void t_shirtsCategory() {
		
		categoryPage.clickOnT_ShirtsCategory();
	}
}
