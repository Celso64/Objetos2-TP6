package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import modelo.Basico;
import modelo.Combo;
import modelo.ConCarne;
import modelo.ConPapas;
import modelo.ConQueso;
import modelo.ConTomate;
import modelo.Especial;

class Test {

    @org.junit.jupiter.api.Test
    void comboBasicoConDobleDePapas() {
	Combo combo = new ConPapas(new ConPapas(new Basico()));

	assertEquals(80.0, combo.getPrecio());
	assertEquals("Es un combo Basico con Papas con Papas", combo.getDescripcion());
    }

    @org.junit.jupiter.api.Test
    void comboEspecialConTodo() {
	Combo combo = new ConQueso(new ConCarne(new ConTomate(new ConPapas(new Especial()))));

	assertEquals(307.5, combo.getPrecio());
	assertEquals("Es un combo Especial con Papas con Tomate con Carne con Queso", combo.getDescripcion());
    }

}
