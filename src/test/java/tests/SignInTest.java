package tests;

import org.testng.annotations.Test;

import commonSteps.Steps;

public class SignInTest extends Steps{
	
	@Test(description = "Crear una cuenta con email válido", enabled = false)
	public void createAnAccountWithEmailValid() {
		
		signInPage.clickOnSignIn();
		signInPage.setEmailAddress("tenot18742@imail5.net");
		signInPage.personalInformation();
		signInPage.setInfoNewAccount();
	}
}
