package co.com.screenplay.project.stepdefinitions;

import co.com.screenplay.project.models.Candidato;
import co.com.screenplay.project.tasks.AgendarEntrevista;
import co.com.screenplay.project.tasks.Reclutar;
import io.cucumber.java.Before;
import io.cucumber.java.an.Y;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ContratarCandidatoStep {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Y("se ingresa la informacion personal del candidato")
    public void seIngresaLaInformacionPersonalDelCandidato(){
        theActorInTheSpotlight().attemptsTo(
            Reclutar.unNuevo(new Candidato())
        );
    }

    @Y("este se le agrega la informacion en la seccion notas")
    public void esteSeLeAgregaLaInformacionEnLaSeccionNotas(){
        theActorInTheSpotlight().attemptsTo(
            AgendarEntrevista.paraUnCandidato()
        );
    }

    @Entonces("el candidato es ingresado en plantilla")
    public void elCandidatoEsIngresadoEnPlantilla(){
        theActorInTheSpotlight().should();
    }

}
