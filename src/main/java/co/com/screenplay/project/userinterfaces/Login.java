package co.com.screenplay.project.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Login extends PageObject {
    public static final Target APARTADO_LOGIN = Target.the("Selecciona Apartado Login").located(By.xpath("//div[@class='orangehrm-login-slot']"));
    public static final Target USER_NAME_INPUT = Target.the("Nombre").locatedBy("//input[@name='username']");
    public static final Target PASSWORD_INPUT = Target.the("Password").locatedBy("//input[@name='password']");
    public static final Target BOTON_LOGIN = Target.the("Boton Login").locatedBy("//button[@type='submit']");
}
