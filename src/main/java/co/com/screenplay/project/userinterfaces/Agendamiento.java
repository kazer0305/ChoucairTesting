package co.com.screenplay.project.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Agendamiento {

    public static final Target BOTON_AGENDAMIENTO =
        Target.the("Boton para realizar agendamiento").
        locatedBy("//button[normalize-space()='Schedule Interview']");

    public static final Target TITULO_ENTREVISTA =
        Target.the("Input para el nombre de la entrevista").
        locatedBy("//*[text()='Interview Title']/parent::div/following-sibling::div/child::input");

    public static final Target NOMBRE_ENTREVISTADOR =
        Target.the("Input para el nombre del entrevistador").
        locatedBy("//*[text()='Interviewer']/parent::div/following-sibling::div/descendant::input");

    public static final Target SELECCION_PRIMER_ENTREVISTADOR =
        Target.the("Selección del primer entrevistador disponible").
        locatedBy("(//div[@role='listbox']//span)[1]");

    public static final Target SELECCION_CALENDARIO =
        Target.the("Abre el calendario").
        locatedBy("//*[@class='oxd-date-input']/input");

    public static final Target SELECCION_DIA =
        Target.the("Selecciona el día actual").
        locatedBy("//div[@class='oxd-calendar-date --selected --today']");

    public static final Target SELECCION_TIEMPO =
        Target.the("Abre la opción Hora").
        locatedBy("//*[text()='Time']/parent::div/following-sibling::div/descendant::input");

    public static final Target MODIFICAR_HORA =
        Target.the("Cambia la hora").
        locatedBy("//*[@class='oxd-icon bi-chevron-up oxd-icon-button__icon oxd-time-hour-input-up']");

    public static final Target MODIFICAR_MINUTOS_15 =
        Target.the("Cambia 15 minutos").
        locatedBy("//*[@class='oxd-icon bi-chevron-up oxd-icon-button__icon oxd-time-minute-input-up']");

    public static final Target BOTON_APROBADO =
        Target.the("Boton para aprobar").
        locatedBy("//button[normalize-space()='Mark Interview Passed']");

    public static final Target BOTON_OFERTA =
        Target.the("Boton para ofrecer plaza de trabajo").
        locatedBy("//button[normalize-space()='Offer Job']");

    public static final Target BOTON_CONTRATAR =
        Target.the("Boton para ofrecer plaza de trabajo").
        locatedBy("//button[normalize-space()='Hire']");


}
