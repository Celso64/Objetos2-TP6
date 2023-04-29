package modelo;

import java.io.IOException;

import com.google.gson.Gson;

import almacenamiento.PostDAO;
import almacenamiento.PostDTO;

public class AlmacenarEnBD implements Consumidor {

    private Consumidor consumidor;
    private PostDAO almacenamiento;
    private Gson formateador;

    public AlmacenarEnBD(Consumidor consumidor, PostDAO almacenamiento, Gson formateador) {
	this.consumidor = consumidor;
	this.almacenamiento = almacenamiento;
	this.formateador = formateador;
    }

    @Override
    public String run() throws IOException {

	String res = this.consumidor.run();

	Post[] posts = formateador.fromJson(res, Post[].class);

	for (Post post : posts) {
	    almacenamiento.create(new PostDTO(post.getUserId(), post.getId(), post.getTitulo(), post.getCuerpo()));
	}

	return res;
    }

}
