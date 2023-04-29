package main;

import java.io.File;
import java.io.FileOutputStream;

import com.google.gson.Gson;

import almacenamiento.ConnectionManager;
import almacenamiento.SQLitePostDAO;
import modelo.AlmacenarEnArchivo;
import modelo.AlmacenarEnBD;
import modelo.Consumidor;
import modelo.RestCall;

public class AppConAmbos {

    public static void main(String[] args) {

	String url = "jdbc:sqlite:./src/main/resources/postBD";

	Gson gson = new Gson();
	RestCall rest = new RestCall("https://jsonplaceholder.typicode.com/posts");

	try {
	    Consumidor salidaConAmbos = new AlmacenarEnArchivo(
		    new AlmacenarEnBD(rest, new SQLitePostDAO(ConnectionManager.getConexion(url)), gson),
		    new FileOutputStream(new File("./src/main/resources/salida.txt")), gson);

	    salidaConAmbos.run();

	    System.out.println("Listo");

	} catch (Exception e) {
	    e.printStackTrace();
	}

    }

}
