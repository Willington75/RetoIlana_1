package com.despegar.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        tags = "@Despegar",
        glue = "com.despegar.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class CompraRunner {
}
