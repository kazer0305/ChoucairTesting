package co.com.screenplay.project.utils;

import java.io.File;

public class Archivo {

    private static String pathProject = new File("").getAbsolutePath();
    public static String getRouteUpload(String nameFile) {
        String pathResources = pathProject + "/src/test/resources/files/";
        return pathResources + nameFile;
    }
}
