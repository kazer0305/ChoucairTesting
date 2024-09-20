package co.com.screenplay.project.tasks;

import co.com.screenplay.project.interactions.ClickeaSobre;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.screenplay.project.userinterfaces.Agendamiento.*;
import static co.com.screenplay.project.userinterfaces.Botones.RECLUTAMIENTO_EN_MENU;
import static co.com.screenplay.project.userinterfaces.InputsReclutamiento.BOTON_GUARDAR;
import static co.com.screenplay.project.userinterfaces.InputsReclutamiento.NOTAS_INPUT;

public class AgendarEntrevista implements Task {

    @Override
    public<T extends Actor> void performAs(T actor){
        actor.attemptsTo(ClickeaSobre.el(BOTON_AGENDAMIENTO));
        actor.attemptsTo(Enter.theValue("Reto técnico QA AUTOMATION").into(TITULO_ENTREVISTA));
        actor.attemptsTo(Enter.theValue("M").into(NOMBRE_ENTREVISTADOR));
        actor.attemptsTo(ClickeaSobre.el(SELECCION_PRIMER_ENTREVISTADOR));
        actor.attemptsTo(ClickeaSobre.el(SELECCION_CALENDARIO));
        actor.attemptsTo(ClickeaSobre.el(SELECCION_DIA));
        actor.attemptsTo(ClickeaSobre.el(SELECCION_TIEMPO));
        actor.attemptsTo(ClickeaSobre.el(MODIFICAR_HORA));
        actor.attemptsTo(ClickeaSobre.el(MODIFICAR_MINUTOS_15));
        actor.attemptsTo(Enter.theValue("Entrevista QA AUTOMATION").into(NOTAS_INPUT));
        actor.attemptsTo(ClickeaSobre.el(BOTON_GUARDAR));
        actor.attemptsTo(ClickeaSobre.el(BOTON_APROBADO));
        actor.attemptsTo(ClickeaSobre.el(BOTON_GUARDAR));
        actor.attemptsTo(ClickeaSobre.el(BOTON_OFERTA));
        actor.attemptsTo(ClickeaSobre.el(BOTON_GUARDAR));
        actor.attemptsTo(ClickeaSobre.el(BOTON_CONTRATAR));
        actor.attemptsTo(ClickeaSobre.el(BOTON_GUARDAR));
        actor.attemptsTo(ClickeaSobre.el(RECLUTAMIENTO_EN_MENU));
    }

    public static AgendarEntrevista paraUnCandidato(){
        return Tasks.instrumented(AgendarEntrevista.class);
    }
}
