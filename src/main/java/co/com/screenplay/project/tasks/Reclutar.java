package co.com.screenplay.project.tasks;

import co.com.screenplay.project.interactions.ClickeaSobre;
import co.com.screenplay.project.models.Candidato;
import co.com.screenplay.project.utils.Archivo;
import co.com.screenplay.project.utils.SubirArchivo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.screenplay.project.userinterfaces.Botones.*;
import static co.com.screenplay.project.userinterfaces.InputsReclutamiento.*;

public class Reclutar implements Task {

    private Candidato candidato;

    public Reclutar(Candidato candidato){
        this.candidato = candidato;
    }
    
    @Override
    public<T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ClickeaSobre.el(RECLUTAMIENTO_EN_MENU));
        actor.attemptsTo(ClickeaSobre.el(BOTON_AGREGAR));
        actor.attemptsTo(Enter.theValue(candidato.getNombre()).into(PRIMER_NOMBRE_INPUT));
        actor.attemptsTo(Enter.theValue(candidato.getSegundoNombre()).into(SEGUNDO_NOMBRE_INPUT));
        actor.attemptsTo(Enter.theValue(candidato.getApellido()).into(APELLIDO_INPUT));
        actor.attemptsTo(ClickeaSobre.el(LISTA_VACANTES));
        actor.attemptsTo(ClickeaSobre.el(SELECCION_VACANTE));
        actor.attemptsTo(Enter.theValue(candidato.getCorreo()).into(CORREO_INPUT));
        actor.attemptsTo(Enter.theValue(candidato.getCelular()).into(CELULAR_INPUT));
        SubirArchivo.seleccionando(
                actor,
                Archivo.obtenerRuta("Reto analista pruebas.pdf"),
                String.valueOf(SUBIR_ARCHIVO_INPUT.getCssOrXPathSelector())
        );
        actor.attemptsTo(Enter.theValue(candidato.getPalabrasClave()).into(PALABRAS_CLAVE_INPUT));
        actor.attemptsTo(Enter.theValue(candidato.getNotas()).into(NOTAS_INPUT));
        actor.attemptsTo(ClickeaSobre.el(CHECK_CONSENTIMIENTO_DATOS));
        actor.attemptsTo(ClickeaSobre.el(BOTON_GUARDAR));
        actor.attemptsTo(ClickeaSobre.el(BOTON_SHORTLIST));
        actor.attemptsTo(Enter.theValue(candidato.getNotas()).into(NOTAS_INPUT));
        actor.attemptsTo(ClickeaSobre.el(BOTON_GUARDAR));
    }

    public static Reclutar unNuevo(Candidato candidato){
        return Tasks.instrumented(Reclutar.class, candidato);
    }
}
