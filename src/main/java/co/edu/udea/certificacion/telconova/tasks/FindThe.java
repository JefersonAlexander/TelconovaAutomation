package co.edu.udea.certificacion.telconova.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Enter;
import co.edu.udea.certificacion.telconova.interactions.EnterThe;

public class FindThe implements Task{
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(EnterThe.worldToFind());
    }

    public static FindThe keyWord(){
        return Tasks.instrumented(FindThe.class);
    }
}