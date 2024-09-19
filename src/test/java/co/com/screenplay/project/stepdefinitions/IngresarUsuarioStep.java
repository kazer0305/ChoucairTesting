package co.com.screenplay.project.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import org.hamcrest.Matchers;

import static co.com.screenplay.project.utils.Constantes.*;
import static co.com.screenplay.project.utils.Constantes.WEBSITE_NAME;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class IngresarUsuarioStep{

    private String userName;
    private String password;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("Accede al sitio web usando sus credenciales")
    public void accedeAlSitioWebUsandoSusCredenciales(){
        userName = "admin";
        password = "admin1234";
        theActorCalled(ACTOR).attemptsTo(

        );
    }

    @Then("Visualizará la página de inicio y esperará una validación")
    public void visualizaraLaPaginaDeInicioYEsperaraUnaValidacion(){
        theActorInTheSpotlight().should(
            GivenWhenThen.seeThat(
                TheWebPage.title(),
                Matchers.containsString(WEBSITE_NAME)
            )
        );
    }
}
