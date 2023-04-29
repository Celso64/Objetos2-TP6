package modelo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Report implements Reportador {
    private String reporte;
    private Boolean ultimoExportExitoso;

    public Report(String reporte) {
	this.reporte = reporte;
	this.ultimoExportExitoso = false;
    }

    @Override
    public void export(File file) {

	if (file == null) {
	    throw new IllegalArgumentException("File es NULL; no puedo exportar...");

	}

	try (OutputStream salida = new FileOutputStream(file);) {

	    salida.write(reporte.getBytes());
	    this.ultimoExportExitoso = true;
	} catch (Exception e) {
	    throw new RuntimeException("No se pudo escribir");
	}

    }

    public Boolean getUltimoExportExitoso() {
	return ultimoExportExitoso;
    }

    public String getReporte() {
	return reporte;
    }

}
