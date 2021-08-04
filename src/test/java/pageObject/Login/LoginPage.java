package pageObject.Login;

import org.openqa.selenium.By;

public class LoginPage {
	
	private By btnEntrar = By.xpath("(//*[contains(text(),'Entrar')])[1]");
	private By cmpEmail = By.xpath("//*[@id='email']");
	private By cmpSenha = By.id("pass");
	private By btnSubmit = By.xpath("(//*[text()='Entrar'])[2]");
	private By validamsg = By.xpath("//*[text()='Informações de Contato']");
	
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
	
	public By getValidaMsg() {
		return validamsg;
	}
}