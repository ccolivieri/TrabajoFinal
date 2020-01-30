package tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import commonSteps.Steps;

public class LoginTest extends Steps{

	private String txtResult;
	
	@Test(description="Verifica si se ingresó un usuario válido", enabled = false)
	public void loginUserExists() {
		
		loginPage.loginUser("tenot18742@imail5.net", "abcde");
		txtResult = loginPage.getText();
		
		Assert.assertTrue(txtResult.contains("Welcome to your account. Here you can manage all of your personal information and orders"));
	}
	
	@Test(description="Verifica si se ingresó un usuario inválido", enabled = false)
	public void loginUserNotExists() {
		
		loginPage.loginUser("", "");
		txtResult = loginPage.getAlert();
		
		Assert.assertTrue(txtResult.contains("Authentication failed."));
	}
}
