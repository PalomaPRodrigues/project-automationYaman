package pageObjects.Login;

import drive.DriverFactory;

public class LoginLogic extends DriverFactory {

	private LoginPage loginPage;

	public LoginLogic() {
		loginPage = new LoginPage();

	}

	public void clicarEntrar() {
		loginPage.getBtnEntrar().findElement(driver).click();
		tempoDeEspera(500);

	}

	public void preencherEmail(String email) {
		loginPage.getcmpEmail().findElement(driver).sendKeys(email);
		tempoDeEspera(500);
	}

	public void preencherSenha(String senha) {
		loginPage.getcmpSenha().findElement(driver).sendKeys(senha);
		tempoDeEspera(500);

	}

	public void clicarBtnSubmit() {
		loginPage.getBtnSubmit().findElement(driver).click();

	}

}
