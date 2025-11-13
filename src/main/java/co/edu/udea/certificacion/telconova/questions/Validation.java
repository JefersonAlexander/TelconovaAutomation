package co.edu.udea.certificacion.telconova.questions;

import static co.edu.udea.certificacion.telconova.userinterfaces.GooglePage.TITLE_PAGE_UDEA;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class Validation  implements Question<String> {

    
    @Override
    public String answeredBy(Actor actor) {
        String msg =BrowseTheWeb.as(actor).find(TITLE_PAGE_UDEA).getText();
        return msg;
    }

    public static Validation theUdeASite(){
        return new Validation();
    }
   
}