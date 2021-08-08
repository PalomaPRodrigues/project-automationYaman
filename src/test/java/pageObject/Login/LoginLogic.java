package pageObject.Login;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import drive.DriverFactory;

public class LoginLogic extends DriverFactory {
	
	private LoginPage loginPage;
	
	public LoginLogic() {
	loginPage = new LoginPage();

	}

	public void navega() {
		navega("https://www.brilhoso.com.br/");
	}
	
	public static void tempoDeEspera(long by) {
		try {
		Thread.sleep(by);
	} catch (InterruptedException ex) {
		ex.printStackTrace();
	}
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
	
	public void validoMsg(String msgFinal) {
		String cmpValidacao = String.format(loginPage.getTxtVisivel(), msgFinal);
		tempoDeEspera(5000);
		WebElement xpathMsg = driver.findElement(By.xpath(cmpValidacao));
		assertTrue(xpathMsg.isDisplayed());
	}

}
