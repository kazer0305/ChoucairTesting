package co.com.screenplay.project.utils;

import net.serenitybdd.screenplay.Actor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.pages.components.FileToUpload;

public class SubirArchivo {

    public static WebDriver getDriver (Actor actor) {
        return BrowseTheWeb.as(actor).getDriver();
    }

    public static WebElement getUploadByXpath(Actor actor, String xpath) {
        return getDriver(actor).findElement(By.xpath(xpath));
    }

    public static void uploadFile (Actor actor, String absolutePath, String xpath) {
        WebDriver driver = getDriver(actor);
        WebElement uploadElement = getUploadByXpath(actor, xpath);
        FileToUpload fileToUpload = new FileToUpload(driver, absolutePath);
        fileToUpload.fromLocalMachine().to(uploadElement);
    }

}
