package modelo;

public class Comun implements Motor {

	@Override
	public void arrancar() {
		System.out.println("Arranca normal");
	}

	@Override
	public void acelerar() {
		System.out.println("Acelera Normal");
	}

	@Override
	public void apagar() {
		System.out.println("Se apaga normal");
	}

}
