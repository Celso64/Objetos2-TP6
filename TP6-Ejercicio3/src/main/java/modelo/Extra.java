package modelo;

public abstract class Extra extends Combo {

    protected Combo combo;

    @Override
    public String getDescripcion() {
	return this.combo.getDescripcion() + this.generarDescripcion();
    }

    @Override
    public Double getPrecio() {
	return this.combo.getPrecio() + this.calcularPrecio();
    }

    protected abstract String generarDescripcion();

    protected abstract Double calcularPrecio();

}
