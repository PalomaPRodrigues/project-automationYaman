package hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import drive.DriverFactory;

public class Hoocks extends DriverFactory{
	@Before
	public static void inicializaBrowser(Scenario teste) {
		System.err.println("inicio do teste:" + teste.getName());
	}

	@After
	public static void finalizarTeste(Scenario teste) {
		// passar o webaction(logic)
		System.out.println("Teste finalizado. Status de Teste: " + teste.getStatus());
		encerraDriver();
	}
}
