package com.cedaniel200.crossapp.task;

import com.cedaniel200.crossapp.userinterface.GooglePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.Keys;

import static com.cedaniel200.crossapp.userinterface.GooglePage.CAMPO_DE_BUSQUEDA;
import static com.cedaniel200.crossapp.userinterface.NumeroAleatoreoPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.ENTER;

public class ObtenerNumerosAleatoreos implements Task {

    public static final String NUMERO_1 = "numero1";
    public static final String NUMERO_2 = "numero2";

    private GooglePage googlePage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(googlePage),
                Enter.theValue("números aleatorios")
                        .into(CAMPO_DE_BUSQUEDA)
                        .thenHit(ENTER),
                Enter.theValue("0").into(NUMERO_MINIMO),
                Enter.theValue("9").into(NUMERO_MAXIMO),
                Click.on(GENERAR_NUMERO_ALEATOREO)
        );
        String numeroAleatoreo = NUMERO_ALEATOREO.resolveFor(actor).getText();
        actor.remember(NUMERO_1, numeroAleatoreo);
        actor.attemptsTo(
                Click.on(GENERAR_NUMERO_ALEATOREO)
        );
        numeroAleatoreo = NUMERO_ALEATOREO.resolveFor(actor).getText();
        actor.remember(NUMERO_2, numeroAleatoreo);
    }

    public static ObtenerNumerosAleatoreos obtenerNumerosAleatoreos() {
        return instrumented(ObtenerNumerosAleatoreos.class);
    }
}
