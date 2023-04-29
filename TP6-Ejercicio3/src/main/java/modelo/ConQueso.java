package modelo;

public class ConQueso extends Extra {

    private static final Double PRECIO = 7.5;
    private static final String DESCRIPCION = " con Queso";

    public ConQueso(Combo combo) {
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
