package com.cedaniel200.crossapp.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/sumar.feature",
        glue = {"com.cedaniel200.crossapp.stepdefinitions"},
        snippets = SnippetType.CAMELCASE)
public class Sumar {
}
