package co.com.screenplay.project.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Botones {

    public static final Target RECLUTAMIENTO_EN_MENU =
        Target.the("Opción reclutamiento menú lateral").
        locatedBy("//*[@class='oxd-text oxd-text--span oxd-main-menu-item--name' and text()='Recruitment']");

    public static final Target BOTON_AGREGAR =
        Target.the("Boton agregar").
        locatedBy("//button[normalize-space()='Add']");

}
