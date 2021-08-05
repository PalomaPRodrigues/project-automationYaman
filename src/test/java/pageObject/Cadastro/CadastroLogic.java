package pageObject.Cadastro;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import drive.DriverFactory;

public class CadastroLogic extends DriverFactory {

	protected static WebDriverWait wait;
	private CadastroPage cadastroPage;

	public CadastroLogic() {
		cadastroPage = new CadastroPage();

	}

	public void navega() {
		navega("https://www.brilhoso.com.br/");
	}
	
	public static void tempoDeEspera(int iTimeInMillis) {
		try {
		Thread.sleep(iTimeInMillis);
	} catch (InterruptedException ex) {
		ex.printStackTrace();
	}
}
		

	public void selecionarCadastrar() {
//    wait.until(ExpectedConditions.elementToBeClickable(cadastroPage.getBtnCadastre()));
		cadastroPage.getBtnCadastre().findElement(driver).click();
		tempoDeEspera(500);

	}

	public void preencherEmail(String email) {
		cadastroPage.getCmpEmail().findElement(driver).sendKeys(email);
		tempoDeEspera(500);
	}

	

	public void selecionarTipoCadastro(String tipoCadastro) {
		WebElement comboElement = driver.findElement(cadastroPage.getCboxTipocadastro());
		Select combo = new Select(comboElement);
		combo.selectByVisibleText(tipoCadastro);
		tempoDeEspera(500);

	}

	public void preencherCpf(String cpf) {
		cadastroPage.getCmpCpf().findElement(driver).sendKeys(cpf);
		tempoDeEspera(500);

	}

	public void selecionarUf(String uf) {
		WebElement comboElement = driver.findElement(cadastroPage.getCboxUf());
		Select combo = new Select(comboElement);
		combo.selectByVisibleText(uf);
		tempoDeEspera(500);

	}

	public void preencherRg(String rg) {
		cadastroPage.getCmpRg().findElement(driver).sendKeys(rg);
		tempoDeEspera(500);

	}

	public void preencherNome(String nome) {
		cadastroPage.getCmpNome().findElement(driver).sendKeys(nome);
		tempoDeEspera(500);

	}

	public void preencherSobrenome(String sobrenome) {
		cadastroPage.getCmpSobrenome().findElement(driver).sendKeys(sobrenome);
		tempoDeEspera(500);

	}

	public void preencherDataNascimento(String dataNascimento) {
		cadastroPage.getCmpDataNascimento().findElement(driver).sendKeys(dataNascimento);
		tempoDeEspera(500);

	}

	public void selecionarGenero(String genero) {
		WebElement comboElement = driver.findElement(cadastroPage.getCboxGenero());
		Select combo = new Select(comboElement);
		combo.selectByVisibleText(genero);
		tempoDeEspera(1000);

	}

	public void ClicarReceberOfertas() {
		cadastroPage.getBtnReceberOfertas().findElement(driver).click();
		tempoDeEspera(500);

	}

	public void preencherSenha(String senha) {
		cadastroPage.getCmpSenha().findElement(driver).sendKeys(senha);
		tempoDeEspera(500);

	}

	public void preencherConfirmarSenha(String confirmarSenha) {
		cadastroPage.getCmpSenha().findElement(driver).sendKeys(confirmarSenha);
		tempoDeEspera(500);

	}

	public void clicarEnviar() {
		cadastroPage.getBtnEnviar().findElement(driver).click();
		tempoDeEspera(500);
	}

//	public void validoMsg () {
//		try {
//			tempoDeEspera(cadastroPage.get);
//			assertTrue(estaVisivel(cadastroPage.getValidoCadastro()));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	}


