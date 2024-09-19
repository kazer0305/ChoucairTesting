package co.com.screenplay.project.stepdefinitions;

import co.com.screenplay.project.tasks.Login;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import org.hamcrest.Matchers;

import static co.com.screenplay.project.utils.Constantes.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class IngresarUsuarioStep{

    private String username;
    private String password;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("Accede al sitio web usando sus credenciales")
    public void accedeAlSitioWebUsandoSusCredenciales(){
        username = NOMBRE_USUARIO;
        password = PASSWORD_USUARIO;
        theActorCalled(ACTOR).attemptsTo(
            Login.autenticarse(username, password)
        );
    }

    @Then("Visualizará la página de inicio y esperará una validación")
    public void visualizaraLaPaginaDeInicioYEsperaraUnaValidacion(){
        theActorInTheSpotlight().should(
            GivenWhenThen.seeThat(
                TheWebPage.title(),
                Matchers.containsString(ORANGE_TITLE)
            )
        );
    }
}
