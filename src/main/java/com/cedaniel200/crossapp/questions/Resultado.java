package com.cedaniel200.crossapp.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

import static com.cedaniel200.crossapp.task.ObtenerNumerosAleatoreos.NUMERO_1;
import static com.cedaniel200.crossapp.task.ObtenerNumerosAleatoreos.NUMERO_2;
import static com.cedaniel200.crossapp.userinterface.CalculadoraMovilPage.RESULTADO;

@Subject("el resultado es correcto")
public class Resultado implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        int resultado = aNumero(RESULTADO.resolveFor(actor).getText().replace("=", "").trim());
        int numero1 = aNumero(actor.recall(NUMERO_1));
        int numero2 = aNumero(actor.recall(NUMERO_2));
        return resultado == (numero1 + numero2);
    }

    private int aNumero(String numero){
        return Integer.parseInt(numero);
    }

    public static Resultado esCorrecto() {
        return new Resultado();
    }
}
