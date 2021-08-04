package pageObject.Login;

import drive.DriverFactory;

public class LoginLogic extends DriverFactory {
	
	private LoginPage loginPage;
	
	public LoginLogic() {
	loginPage = new LoginPage();

	}

	public void navega() {
		navega("https://www.brilhoso.com.br/");
	}
	

	public void clicarEntrar() {
		loginPage.getBtnEntrar().findElement(driver).click();

	}
	
	public void preencherEmail(String email) {
		loginPage.getcmpEmail().findElement(driver).sendKeys(email);
	}	
		
		public void preencherSenha(String senha)  {
			loginPage.getcmpSenha().findElement(driver).sendKeys(senha);
			
	}
	
	public void clicarBtnSubmit() {
		loginPage.getBtnSubmit().findElement(driver).click();
		
	}
	
	public void ValidarMensagem() {
		
		
	}

}
