package com.cedaniel200.crossapp.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CalculadoraMovilPage {

    // TODO mejorar xpath
    public static final Target BOTON_NUMERICO = Target.the("Botón {0}")
            .locatedBy("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@resource-id=\"com.miui.calculator:id/btn_{0}_s\"]");

    public static final Target BOTON_SUMAR = Target.the("Botón sumar")
            .located(By.id("btn_plus_s"));
    public static final Target BOTON_IGUAL = Target.the("Botón igual")
            .located(By.id("btn_equal_s"));
    public static final Target RESULTADO = Target.the("resultado")
            .located(By.id("result"));
}
