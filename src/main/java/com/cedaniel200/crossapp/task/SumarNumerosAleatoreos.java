package com.cedaniel200.crossapp.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.cedaniel200.crossapp.task.ObtenerNumerosAleatoreos.NUMERO_1;
import static com.cedaniel200.crossapp.task.ObtenerNumerosAleatoreos.NUMERO_2;
import static com.cedaniel200.crossapp.userinterface.CalculadoraMovilPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SumarNumerosAleatoreos implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        String numero1 = actor.recall(NUMERO_1);
        String numero2 = actor.recall(NUMERO_2);
        // TODO verificar terminos y condiciones  --- id -> button1
        actor.attemptsTo(
                Click.on(BOTON_NUMERICO.of(numero1)),
                Click.on(BOTON_SUMAR),
                Click.on(BOTON_NUMERICO.of(numero2)),
                Click.on(BOTON_IGUAL)
        );
    }

    public static SumarNumerosAleatoreos sumarNumerosAleatoreos(){
        return instrumented(SumarNumerosAleatoreos.class);
    }
}
