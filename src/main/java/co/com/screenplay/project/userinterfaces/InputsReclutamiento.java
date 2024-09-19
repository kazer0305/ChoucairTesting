package co.com.screenplay.project.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class InputsReclutamiento {

    public static final Target PRIMER_NOMBRE_INPUT =
        Target.the("Input Primer Nombre").
        locatedBy("//input[@name='firstName']");

    public static final Target SEGUNDO_NOMBRE_INPUT =
        Target.the("Input Segundo Nombre").
        locatedBy("//input[@name='middleName']");

    public static final Target APELLIDO_INPUT =
        Target.the("Input Apellido").
        locatedBy("//input[@name='lastName']");

    public static final Target LISTA_VACANTES =
        Target.the("Lista vacantes").
        locatedBy("//div[@class='oxd-select-text-input']");

    public static final Target SELECCION_VACANTE =
        Target.the("Opción de Rol").
        locatedBy("//label[normalize-space()='Vacancy']/ancestor::div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@role='listbox']//span[normalize-space()='Payroll Administrator']");

    public static final Target CORREO_INPUT =
        Target.the("Input correo").
        locatedBy("//*[text()='Email']/parent::div/following-sibling::div/child::input");

    public static final Target CELULAR_INPUT =
        Target.the("Input celular").
        locatedBy("//*[text()='Contact Number']/parent::div/following-sibling::div/child::input");

    public static final Target SUBIR_ARCHIVO_INPUT =
        Target.the("Input para subir archivo").
        locatedBy("//input[@type='file']");

    public static final Target PALABRAS_CLAVE_INPUT =
        Target.the("Input para palabras clave").
        locatedBy("//*[text()='Keywords']/parent::div/following-sibling::div/child::input");

    public static final Target NOTAS_INPUT =
        Target.the("Input para Notas").
        locatedBy("//*[text()='Notes']/parent::div/following-sibling::div/child::textarea");

    public static final Target CHECK_CONSENTIMIENTO_DATOS=
        Target.the("Check para consentir datos").
        locatedBy("//div[@class='oxd-checkbox-wrapper']//span");

    public static final Target BOTON_GUARDAR=
        Target.the("Boton para guardar").
        locatedBy("//button[normalize-space()='Save']");

    public static final Target BOTON_SHORTLIST=
        Target.the("Boton para guardar").
        locatedBy("//button[normalize-space()='Shortlist']");

}
