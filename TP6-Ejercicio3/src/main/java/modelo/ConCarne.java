package modelo;

public class ConCarne extends Extra {

    private static final Double PRECIO = 30.0;
    private static final String DESCRIPCION = " con Carne";

    public ConCarne(Combo combo) {
	super.precio = PRECIO;
	super.descripcion = DESCRIPCION;
	super.combo = combo;
    }

    @Override
    protected String generarDescripcion() {
	return DESCRIPCION;
    }

    @Override
    protected Double calcularPrecio() {
	return PRECIO;
    }

}
