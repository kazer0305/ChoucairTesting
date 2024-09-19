package co.com.screenplay.project.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ClickeaSobre implements Interaction{

    private Target target;

    public ClickeaSobre(Target target){
        this.target = target;
    }

    public static ClickeaSobre el(Target target){
        return new ClickeaSobre(target);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
            WaitUntil.the(target, isClickable()).forNoMoreThan(15).seconds(),
            WaitUntil.the(target, isVisible()).forNoMoreThan(15).seconds(),
            Click.on(target)
        );
    }

}
