package modelo;

import java.io.File;

public class SinSobreescritura implements Reportador {

    private Reportador reporte;

    public SinSobreescritura(Reportador reporte) {
	this.reporte = reporte;
    }

    @Override
    public void export(File file) {

	if (file.exists()) {
	    throw new IllegalArgumentException("El archivo ya existe...");
	}
	this.reporte.export(file);

    }

}
