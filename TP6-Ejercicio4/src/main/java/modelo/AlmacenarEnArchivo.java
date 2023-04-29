package modelo;

import java.io.IOException;
import java.io.OutputStream;

import com.google.gson.Gson;

public class AlmacenarEnArchivo implements Consumidor {

    private Consumidor consumidor;
    private OutputStream salida;
    private Gson formateador;

    public AlmacenarEnArchivo(Consumidor consumidor, OutputStream salida, Gson formateador) {
	this.consumidor = consumidor;
	this.salida = salida;
	this.formateador = formateador;
    }

    @Override
    public String run() throws IOException {
	String res = consumidor.run();

	Post[] posts = formateador.fromJson(res, Post[].class);
	String salida;

	for (Post post : posts) {
	    salida = post.toString() + "\n";
	    this.salida.write(salida.getBytes());
	}

	return res;
    }

}
