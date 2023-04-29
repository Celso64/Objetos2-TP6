package main;

import java.io.File;
import java.io.FileOutputStream;

import com.google.gson.Gson;

import modelo.AlmacenarEnArchivo;
import modelo.Consumidor;
import modelo.RestCall;

public class AppArchivo {

    public static void main(String[] args) {

	Gson gson = new Gson();
	RestCall rest = new RestCall("https://jsonplaceholder.typicode.com/posts");

	try {
	    Consumidor salidaArchivo = new AlmacenarEnArchivo(rest,
		    new FileOutputStream(new File("./src/main/resources/salida.txt")), gson);

	    salidaArchivo.run();

	    System.out.println("Listo");
	} catch (Exception e) {
	    e.printStackTrace();
	}

    }

}
