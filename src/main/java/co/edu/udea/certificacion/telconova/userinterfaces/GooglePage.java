package co.edu.udea.certificacion.telconova.userinterfaces;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class GooglePage extends PageObject {
    public static final Target IMPUT_TEXT =Target.the("Text Box ini").locatedBy("//*[@id='APjFqb']");
    public static final Target LINK_TO_UDEA_HOMEPAGE =Target.the("Link to U de A site").locatedBy("//h3[contains(@class, 'LC20lb MBeuO DKV0Md')]");
    public static final Target TITLE_PAGE_UDEA =Target.the("U de A Title").locatedBy("//*[@id=\"layoutContainers\"]/div/div[2]/div/div[1]/section/div[2]/header/div[2]/button[1]");
}
