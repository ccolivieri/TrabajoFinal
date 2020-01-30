package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
	
	private WebDriver driver;
	private By infoSearch;
	private By buttomSearch;
	private By textSearched;
	
	
	public SearchPage(WebDriver driver) {
		
		this.driver = driver;
		infoSearch = By.id("search_query_top");
		buttomSearch = By.name("submit_search");
	}
	
	public void search(String txt) {
		
		driver.findElement(infoSearch).sendKeys(txt);
		driver.findElement(buttomSearch).click();
	}
	
	public String getNoResults() {
		
		return driver.findElement(textSearched.xpath("//*[@id=\"center_column\"]/p")).getText();
	}
	
	public String getOneResult() {
		
		return driver.findElement(textSearched.xpath("//*[@id=\"center_column\"]/h1/span[2]")).getText();
	}
	
	public String getMultipleResults() {
		
		return driver.findElement(textSearched.className("heading-counter")).getText();
	}
}
