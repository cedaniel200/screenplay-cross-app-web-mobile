package com.cedaniel200.crossapp.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactory {

    public static WebDriver getWebDriver(){
        return new ChromeDriver();
    }

    public static WebDriver getAppiumDriver(){
        // TODO por implementar
        return null;
    }
}
