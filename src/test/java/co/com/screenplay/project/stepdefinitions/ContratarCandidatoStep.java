package co.com.screenplay.project.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.an.Y;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ContratarCandidatoStep {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Y("se ingresa la informacion personal del candidato")
    public void seIngresaLaInformacionPersonalDelCandidato(){
        theActorInTheSpotlight().attemptsTo();
    }

    @Y("este se le agrega la informacion en la seccion notas")
    public void esteSeLeAgregaLaInformacionEnLaSeccionNotas(){
        theActorInTheSpotlight().attemptsTo();
    }

    @Entonces("el candidato es ingresado en plantilla")
    public void elCandidatoEsIngresadoEnPlantilla(){
        theActorInTheSpotlight().attemptsTo();
    }

}
