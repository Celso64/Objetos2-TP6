package test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.File;

import modelo.Report;
import modelo.Reportador;
import modelo.SinSobreescritura;

class Test {

    @org.junit.jupiter.api.Test
    void reporteNormal() {

	Report reporte = new Report("Test de Reporte");

	reporte.export(new File("./src/test/resources/test.txt"));

	assertEquals("Test de Reporte", reporte.getReporte());
	assertTrue(reporte.getUltimoExportExitoso());

    }

    @org.junit.jupiter.api.Test
    void reporteConSobreescrituraNoPermitida() {
	Reportador reporte = new SinSobreescritura(new Report("Test de Reporte"));

	Exception exception = assertThrows(IllegalArgumentException.class, () -> {
	    reporte.export(new File("./src/test/resources/test.txt"));
	});

	String mensajeEsperado = "El archivo ya existe...";
	String mensajeRecibido = exception.getMessage();

	assertEquals(mensajeEsperado, mensajeRecibido);

    }

}
