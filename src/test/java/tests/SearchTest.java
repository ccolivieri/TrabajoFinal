package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import commonSteps.Steps;

public class SearchTest extends Steps{
	
	private String result;

	@Test(description = "B�squeda que no arroja ningun resultado", enabled = false)
	public void findNoResults() {
		
		searchPage.search("abcd");
		result = searchPage.getNoResults();
		Assert.assertTrue(result.contains("No results were found for your search"), "Se esperaba el texto: No results were found for your search " + result);
	}
	
	@Test(description = "B�squeda que arroja un solo resultado", enabled = false)
	public void findOneResult() {
		
		searchPage.search("blouse");
		result = searchPage.getOneResult();
		Assert.assertTrue(result.contains("1 result has been found"), "Se esperaba el texto: 1 result has been found");
	}
	
	@Test(description = "B�squeda que arroja m�ltiples resultados", enabled = false)
	public void findMultipleResults() {
		
		searchPage.search("printed");
		result = searchPage.getMultipleResults();
		Assert.assertTrue(result.contains("5 results have been found"), "se esperaba el texto: 5 results have been found");
	}
}
