package co.com.screenplay.project.models;

import lombok.Getter;

@Getter
public class Candidato {
    private String nombre;
    private String segundoNombre;
    private String apellido;
    private String correo;
    private String celular;
    private String palabrasClave;
    private String notas;

    public Candidato(){
        this.nombre = "Alejandro";
        this.segundoNombre = "Araque";
        this.apellido = "Marin";
        this.correo = "alaraquema@gmail.com";
        this.celular = "3042467297";
        this.palabrasClave = "Creativo, Tester, Selenium, Gherkin";
        this.notas = "Perfil en tester de software  con enfasis en pruebas automatizadas";
    }


}
