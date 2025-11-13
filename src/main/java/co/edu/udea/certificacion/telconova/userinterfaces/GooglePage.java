package co.edu.udea.certificacion.telconova.userinterfaces;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class GooglePage extends PageObject {
    public static final Target IMPUT_TEXT =Target.the("Text Box ini").locatedBy("//*[@id='APjFqb']");
    public static final Target LINK_TO_UDEA_HOMEPAGE =Target.the("Link to U de A site").locatedBy("//*[@id='_I0QVabmDMI2YwbkPu7WAuQ4_122']");
}