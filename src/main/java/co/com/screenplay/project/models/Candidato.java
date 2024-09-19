package co.com.screenplay.project.models;

import lombok.Getter;

@Getter
public class Candidato {
    private String nombre;
    private String segundoNombre;
    private String apellido;
    private String correo;
    private String celular;
    private String descripcion;
    private String caracteristicas;

    public Candidato(){
        this.nombre = "Alejandro";
        this.segundoNombre = "A";
        this.apellido = "Araque";
        this.correo = "alaraquema@gmail.com";
        this.celular = "3042467297";
        this.descripcion = "Técnologo en Desarrollo de software";
        this.caracteristicas = "perfil software tester con enfasis en pruebas automatizadas";
    }


}
