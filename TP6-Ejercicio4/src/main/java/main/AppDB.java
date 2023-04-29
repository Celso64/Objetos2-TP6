package main;

import com.google.gson.Gson;

import almacenamiento.ConnectionManager;
import almacenamiento.SQLitePostDAO;
import modelo.AlmacenarEnBD;
import modelo.Consumidor;
import modelo.RestCall;

public class AppDB {
    public static void main(String[] args) {

	String url = "jdbc:sqlite:./src/main/resources/postBD";

	Gson gson = new Gson();
	RestCall rest = new RestCall("https://jsonplaceholder.typicode.com/posts");

	try {
	    Consumidor salidaDB = new AlmacenarEnBD(rest, new SQLitePostDAO(ConnectionManager.getConexion(url)), gson);

	    salidaDB.run();

	    System.out.println("Listo");

	} catch (Exception e) {
	    e.printStackTrace();
	}

    }

}
