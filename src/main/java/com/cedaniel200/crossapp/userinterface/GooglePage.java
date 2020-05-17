package com.cedaniel200.crossapp.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://google.com")
public class GooglePage extends PageObject {
    public static Target CAMPO_DE_BUSQUEDA = Target.the("Campo de búsqueda")
            .locatedBy("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input");
}
