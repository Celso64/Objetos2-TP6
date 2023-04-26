package modelo;

public class Economico implements Motor {

	@Override
	public void arrancar() {
		System.out.println("Arranca economicamente");
	}

	@Override
	public void acelerar() {
		System.out.println("Acelera economicamente");
	}

	@Override
	public void apagar() {
		System.out.println("Se apaga economicamente");
	}

}
