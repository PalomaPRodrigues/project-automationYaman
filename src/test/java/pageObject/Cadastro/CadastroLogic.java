package pageObject.Cadastro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import drive.DriverFactory;

public class CadastroLogic extends DriverFactory {

	private CadastroPage cadastroPage;

	public CadastroLogic() {
		cadastroPage = new CadastroPage();

	}

	public void navega() {
		navega("https://www.brilhoso.com.br/");
	}

	public void selecionarCadastrar() {
		cadastroPage.getBtnCadastre().findElement(driver).click();

	}

	public void preencherEmail(String email) throws InterruptedException {
		cadastroPage.getCmpEmail().findElement(driver).sendKeys(email);
	}

	public void selecionarTipoCadastro(String tipoCadastro) {
		By comboBoxElement = cadastroPage.getCboxTipocadastro();
		Select comboBox = new Select((WebElement) comboBoxElement);
		comboBox.deselectByVisibleText(tipoCadastro);

	}

	public void preencherCpf(String cpf) {
		cadastroPage.getCmpCpf().findElement(driver).sendKeys(cpf);

	}

	public void selecionarUf() {

	}

	public void preencherRg(String rg) {
		cadastroPage.getCmpRg().findElement(driver).sendKeys(rg);

	}

	public void preencherNome(String nome) {
		cadastroPage.getCmpNome().findElement(driver).sendKeys(nome);

	}

	public void preencherSobrenome(String sobrenome) {
		cadastroPage.getCmpSobrenome().findElement(driver).sendKeys(sobrenome);

	}

	public void preencherDataNascimento(String dataNascimento) {
		cadastroPage.getCmpDataNascimento().findElement(driver).sendKeys(dataNascimento);

	}
	
	public void selecionarGenero() {

	}
	
	public void ClicarReceberOfertas() {
		cadastroPage.getBtnReceberOfertas().findElement(driver).click();
		
	}

	public void preencherSenha(String senha) {
		cadastroPage.getCmpSenha().findElement(driver).sendKeys(senha);

	}
	
	public void preencherConfirmarSenha(String confirmarSenha) {
		cadastroPage.getCmpSenha().findElement(driver).sendKeys(confirmarSenha);
		
	}
	
	public void ClicarEnviar() {
		cadastroPage.getBtnEnviar().findElement(driver).click();
	}
	
	
	
	

}
