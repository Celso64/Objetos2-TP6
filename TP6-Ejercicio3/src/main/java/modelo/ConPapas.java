package modelo;

public class ConPapas extends Extra {

    private static final Double PRECIO = 15.0;
    private static final String DESCRIPCION = " con Papas";

    public ConPapas(Combo combo) {
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
