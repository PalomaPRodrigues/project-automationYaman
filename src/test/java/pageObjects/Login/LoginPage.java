package pageObjects.Login;

import org.openqa.selenium.By;

public class LoginPage {
	private By btnEntrar = By.xpath("(//*[contains(text(),'Entrar')])[1]");
	private By cmpEmail = By.xpath("(//*[@class='input-text required-entry validate-email'])[1]");
	private By cmpSenha = By.id("pass");
	private By btnSubmit = By.xpath("(//*[text()='Entrar'])[2]");

	public By getBtnEntrar() {
		return btnEntrar;
	}

	public By getcmpEmail() {
		return cmpEmail;
	}

	public By getcmpSenha() {
		return cmpSenha;
	}

	public By getBtnSubmit() {
		return btnSubmit;
	}

}
