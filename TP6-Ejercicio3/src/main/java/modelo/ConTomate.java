package modelo;

public class ConTomate extends Extra {

    private static final Double PRECIO = 5.0;
    private static final String DESCRIPCION = " con Tomate";

    public ConTomate(Combo combo) {
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
