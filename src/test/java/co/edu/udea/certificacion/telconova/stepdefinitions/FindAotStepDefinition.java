package co.edu.udea.certificacion.telconova.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import org.openqa.selenium.WebDriver;

import com.fasterxml.jackson.databind.deser.DataFormatReaders.Match;

import co.edu.udea.certificacion.telconova.tasks.OpenThe;
import co.edu.udea.certificacion.telconova.userinterfaces.GooglePage;
import co.edu.udea.certificacion.telconova.questions.Validation;
import co.edu.udea.certificacion.telconova.tasks.FindThe;
import org.hamcrest.Matchers;


public class FindAotStepDefinition {

    private Actor student;

    @Managed(driver = "chrome", uniqueSession = true)
    public WebDriver thedriver;

    @Before
    public void config() {
        OnStage.setTheStage(new OnlineCast());
        student = OnStage.theActorCalled("Sara");
        student.can(BrowseTheWeb.with(thedriver));
    }

    @Given("I am in the google page")
    public void iAmInTheGooglePage() {
        student.attemptsTo(
            OpenThe.navigator(new GooglePage())
        );
    }

    @When("I type a words on google search")
    public void iTypeAWordsOnGoogleSearch() {
        student.attemptsTo(FindThe.keyWord());
    }

    @Then("I can see the official page of U de A")
    public void iCanSeeTheOfficialPageOfUDeA() {
        GivenWhenThen.then(student).should(GivenWhenThen.seeThat(Validation.theUdeASite(),Matchers.containsString("Estudiante")));

    }
}
