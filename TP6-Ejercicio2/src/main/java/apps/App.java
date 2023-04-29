package apps;

import java.io.File;
import modelo.Report;

public class App {

  public static void main(String[] args) {

    Report r = new Report("Reporte de Prueba");

    File archivo = new File("./src/main/resources/salida.txt");


    r.export(archivo);
    System.out.println("fin");


  }

}
