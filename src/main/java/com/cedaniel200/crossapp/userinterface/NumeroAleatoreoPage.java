package com.cedaniel200.crossapp.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class NumeroAleatoreoPage {

    public static Target GENERAR_NUMERO_ALEATOREO = Target.the("Generar número aleatoreo")
            .located(By.id("ZdzlKb"));

    public static Target NUMERO_ALEATOREO = Target.the("Número aleatoreo")
            .locatedBy("//*[@id=\"Zv1Nfb\"]/div[1]");

    public static Target NUMERO_MINIMO = Target.the("Número mínimo")
            .located(By.id("UMy8j"));

    public static Target NUMERO_MAXIMO = Target.the("Número máximo")
            .located(By.id("nU5Yvb"));
}
