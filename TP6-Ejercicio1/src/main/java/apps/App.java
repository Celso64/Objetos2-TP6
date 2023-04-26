package apps;

import modelo.Comun;
import modelo.Economico;
import modelo.Electrico;
import modelo.ElectricoAdapter;
import modelo.Motor;

public class App {

	private static final Integer CANTIDAD_DE_ASTERISCOS = 12;
	private static final String DIVISOR = "*".repeat(CANTIDAD_DE_ASTERISCOS);

	public static void main(String[] args) {

		Motor motorComun = new Comun();
		Motor motorEconomico = new Economico();
		Motor motorElectrico = new ElectricoAdapter(new Electrico());

		dividirConsola();
		System.out.println("Motor Comun");
		dividirConsola();
		motorComun.arrancar();
		motorComun.acelerar();
		motorComun.apagar();

		System.out.println();
		dividirConsola();
		System.out.println("Motor Economico");
		dividirConsola();
		motorEconomico.arrancar();
		motorEconomico.acelerar();
		motorEconomico.apagar();

		System.out.println();
		dividirConsola();
		System.out.println("Motor Electrico");
		dividirConsola();
		motorElectrico.arrancar();
		motorElectrico.acelerar();
		motorElectrico.apagar();

	}

	public static void dividirConsola() {
		System.out.println(DIVISOR);
	}

}
