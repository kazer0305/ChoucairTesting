package co.com.screenplay.project.tasks;

import co.com.screenplay.project.interactions.ClickeaSobre;
import co.com.screenplay.project.models.Candidato;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.screenplay.project.userinterfaces.Botones.RECLUTAMIENTO_EN_MENU;

public class Reclutar implements Task {

    private Candidato candidato;

    public Reclutar(Candidato candidato){
        this.candidato = candidato;
    }

    @Override
    public<T extends Actor> void performAs(T actor){
        actor.attemptsTo(ClickeaSobre.on(RECLUTAMIENTO_EN_MENU));

    }

    public static Reclutar unNuevo(Candidato candidato){
        return Tasks.instrumented(Reclutar.class, candidato);
    }
}
