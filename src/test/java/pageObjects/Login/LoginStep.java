package pageObjects.Login;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;

public class LoginStep {

	private LoginLogic loginLogic;

	public LoginStep() {
		loginLogic = new LoginLogic();

	}

	@Dado("^clico entrar$")
	public void clicoEntrar() {
		loginLogic.clicarEntrar();

	}

	@Dado("^preencho campo e-mail \"([^\"]*)\"$")
	public void preenchoCampoEMail(String email) {
		loginLogic.preencherEmail(email);

	}

	@Dado("^preencho campo senha \"([^\"]*)\"$")
	public void preenchoCampoSenha(String senha) {
		loginLogic.preencherSenha(senha);
	}

	@Quando("^seleciono entrar$")
	public void clicoSubmit() {
		loginLogic.clicarBtnSubmit();
	}

}
