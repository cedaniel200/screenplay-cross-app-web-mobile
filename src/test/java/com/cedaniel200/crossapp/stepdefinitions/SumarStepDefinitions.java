package com.cedaniel200.crossapp.stepdefinitions;

import com.cedaniel200.crossapp.questions.Resultado;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

import static com.cedaniel200.crossapp.task.ObtenerNumerosAleatoreos.obtenerNumerosAleatoreos;
import static com.cedaniel200.crossapp.task.SumarNumerosAleatoreos.sumarNumerosAleatoreos;
import static com.cedaniel200.crossapp.util.WebDriverFactory.getAppiumDriver;
import static com.cedaniel200.crossapp.util.WebDriverFactory.getWebDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.Is.is;

public class SumarStepDefinitions {

    private WebDriver chrome;
    private WebDriver phone;

    @Before
    public void prepararEscenario() throws MalformedURLException {
        phone = getAppiumDriver();
        chrome = getWebDriver();
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) obtiene dos numeros aleatoreos$")
    public void obtenerDosNumerosAleatoreos(String name) {
        theActorCalled(name).can(BrowseTheWeb.with(chrome));
        theActorInTheSpotlight().attemptsTo(
                obtenerNumerosAleatoreos()
        );
    }

    @When("^[a-zA-Z]{3,40} suma dos numeros$")
    public void sumarDosNumeros() {
        theActorInTheSpotlight().can(BrowseTheWeb.with(phone));
        theActorInTheSpotlight().attemptsTo(
                sumarNumerosAleatoreos()
        );
    }

    @Then("^[a-zA-Z]{3,40} deberia ver que su resultado es correcto$")
    public void verificarResultadoSuma() {
        theActorInTheSpotlight().should(seeThat(Resultado.esCorrecto()));
    }

    @After
    public void cerrarDrivers(){
        cerrar(chrome);
        cerrar(phone);
    }

    private void cerrar(WebDriver driver) {
        if(driver != null){
            driver.quit();
        }
    }

}
