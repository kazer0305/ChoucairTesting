package co.com.screenplay.project.stepdefinitions.hook;

import co.com.screenplay.project.hook.AbrirWeb;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.screenplay.project.utils.Constantes.WEB_URL_MAP;

public class Hook {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("{string} abre el sitio web de pruebas")
    public void abreElSitioWebDePruebas(String actor){
        OnStage.theActorCalled(actor).attemptsTo(
            AbrirWeb.navegaURL(WEB_URL_MAP)
        );
    }
}
