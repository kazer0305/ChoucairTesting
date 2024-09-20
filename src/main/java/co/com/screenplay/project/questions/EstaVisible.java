package co.com.screenplay.project.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.hamcrest.Matcher;

import static co.com.screenplay.project.utils.Constantes.TIEMPO_ESPERA;

public class EstaVisible implements Question<Boolean>{

    Matcher matcher;
    Target target;

    public EstaVisible(Target target, Matcher matcher){
        this.target = target;
        this.matcher = matcher;
    }

    @Override
    public Boolean answeredBy(Actor actor){
        actor.attemptsTo(
            WaitUntil.the(target, matcher).forNoMoreThan(TIEMPO_ESPERA).seconds()
        );
        return true;
    }

    public static EstaVisible elObjetivo(Target target){
        return new EstaVisible(target, WebElementStateMatchers.isVisible());
    }


}
