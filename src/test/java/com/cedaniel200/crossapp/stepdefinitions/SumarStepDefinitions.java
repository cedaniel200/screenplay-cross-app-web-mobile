package com.cedaniel200.crossapp.stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;
import sun.security.util.PendingException;

import static com.cedaniel200.crossapp.task.ObtenerNumerosAleatoreos.obtenerNumerosAleatoreos;
import static com.cedaniel200.crossapp.util.WebDriverFactory.getAppiumDriver;
import static com.cedaniel200.crossapp.util.WebDriverFactory.getWebDriver;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SumarStepDefinitions {

    private WebDriver chrome;
    private WebDriver phone;

    @Before
    public void prepararEscenario() {
        chrome = getWebDriver();
        phone = getAppiumDriver();
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
    }

    @Then("^[a-zA-Z]{3,40} deberia ver que su resultado es correcto$")
    public void verificarResultadoSuma() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @After
    public void cerrarDrivers(){
        cerrar(chrome);
        cerrar(phone);
    }

    private void cerrar(WebDriver driver) {
        if(driver != null){
            driver.close();
            driver.quit();
        }
    }

}
