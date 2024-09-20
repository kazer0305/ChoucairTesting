package co.com.screenplay.project.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Login {
    public static final Target APARTADO_LOGIN =
        Target.the("Contenedor de Login").
        located(By.xpath("//div[@class='orangehrm-login-container']"));
    public static final Target USER_NAME_INPUT =
        Target.the("Nombre usuario").
        located(By.name("username"));
    public static final Target PASSWORD_INPUT =
        Target.the("Password usuario").
        located(By.name("password"));
    public static final Target BOTON_LOGIN =
        Target.the("Boton Login").
        locatedBy("//button[@type='submit']");
}
