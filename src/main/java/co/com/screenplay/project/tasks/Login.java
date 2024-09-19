package co.com.screenplay.project.tasks;

import co.com.screenplay.project.interactions.ClickeaSobre;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.screenplay.project.userinterfaces.Login.*;
import static co.com.screenplay.project.utils.Constantes.TIEMPO_ESPERA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

@AllArgsConstructor
public class Login implements Task {

    private String username;
    private String password;

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(WaitUntil.the(APARTADO_LOGIN, isVisible()).forNoMoreThan(TIEMPO_ESPERA).seconds());
        actor.attemptsTo(Enter.theValue(username).into(USER_NAME_INPUT));
        actor.attemptsTo(Enter.theValue(password).into(PASSWORD_INPUT));
        actor.attemptsTo(ClickeaSobre.on(BOTON_LOGIN));
    }

    public static Login autenticarse(String user, String password){
        return Tasks.instrumented(Login.class, user, password);
    }


}
