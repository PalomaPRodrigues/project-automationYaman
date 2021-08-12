package pageObjects.Cadastro;

import org.openqa.selenium.By;

public class CadastroPage {

	private By btnCadastre = By.xpath("//a[@class='register']");
	private By cmpEmail = By.id("email_address");
	private By cboxTipoCadastro = By.xpath("//*[@id='customer_type']");
	private By cmpCpf = By.id("taxvat");
	private By cboxUf = By.xpath("//*[@id='document_two_region']");
	private By cmpRg = By.id("document_two");
	private By cmpNome = By.id("firstname");
	private By cmpSobrenome = By.id("lastname");
	private By cmpDataNascimento = By.id("dob");
	private By cboxGenero = By.xpath("//*[@id='gender']");
	private By btnReceberOfertas = By.id("is_subscribed");
	private By cmpSenha = By.id("password");
	private By cmpConfirmarSenha = By.id("confirmation");
	private By btnEnviar = By.xpath("//span[text()='Enviar']");

	public By getBtnCadastre() {
		return btnCadastre;
	}

	public By getCmpEmail() {
		return cmpEmail;
	}

	public By getCboxTipocadastro() {
		return cboxTipoCadastro;
	}

	public By getCmpCpf() {
		return cmpCpf;
	}

	public By getCboxUf() {
		return cboxUf;
	}

	public By getCmpRg() {
		return cmpRg;
	}

	public By getCmpNome() {
		return cmpNome;
	}

	public By getCmpSobrenome() {
		return cmpSobrenome;
	}

	public By getCmpDataNascimento() {
		return cmpDataNascimento;
	}

	public By getCboxGenero() {
		return cboxGenero;
	}

	public By getBtnReceberOfertas() {
		return btnReceberOfertas;
	}

	public By getCmpSenha() {
		return cmpSenha;
	}

	public By getCmpConfirmarSenha() {
		return cmpConfirmarSenha;
	}

	public By getBtnEnviar() {
		return btnEnviar;
	}

}
