package modelo;

public class ElectricoAdapter implements Motor {

	private Electrico motorElectrico;

	public ElectricoAdapter(Electrico motorElectrico) {
		this.motorElectrico = motorElectrico;
	}

	@Override
	public void arrancar() {

		this.motorElectrico.conectar();
		this.motorElectrico.activar();

	}

	@Override
	public void acelerar() {
		this.motorElectrico.moverMasRapido();
	}

	@Override
	public void apagar() {

		this.motorElectrico.detener();
		this.motorElectrico.desconectar();

	}

}
