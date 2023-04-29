package mains;

import modelo.Basico;
import modelo.Combo;
import modelo.ConPapas;

public class App {

    public static void main(String[] args) {

	Combo combo = new ConPapas(new ConPapas(new Basico()));

	Double esperado, real;

	esperado = 80.0;
	real = combo.getPrecio();

	System.out.println(esperado.toString() + " es igual a " + real.toString() + ": " + (esperado == real));

    }

}
