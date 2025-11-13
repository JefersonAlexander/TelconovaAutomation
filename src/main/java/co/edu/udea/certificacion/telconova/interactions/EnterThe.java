package co.edu.udea.certificacion.telconova.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;

import org.openqa.selenium.Keys;

import co.edu.udea.certificacion.telconova.utils.WaitTime;

import static co.edu.udea.certificacion.telconova.userinterfaces.GooglePage.IMPUT_TEXT;
import static co.edu.udea.certificacion.telconova.userinterfaces.GooglePage.LINK_TO_UDEA_HOMEPAGE;

public class EnterThe implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Enter.theValue("U de A").into(IMPUT_TEXT),
            Enter.keyValues(Keys.RETURN).into(IMPUT_TEXT));
        WaitTime.putWaitTimeOf(6000);
        actor.attemptsTo(Click.on(LINK_TO_UDEA_HOMEPAGE));
    }

    public static EnterThe worldToFind() {
        return Tasks.instrumented(EnterThe.class);
    }
}
