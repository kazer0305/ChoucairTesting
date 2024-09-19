package co.com.screenplay.project.utils;

import java.io.File;

public class Archivo {

    private static String rutaProyecto= new File("").getAbsolutePath();
    public static String obtenerRuta(String nameFile) {
        String pathResources = rutaProyecto + "/src/test/resources/files/";
        return pathResources + nameFile;
    }
}
