package com.it_academy.onliner_tester.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "pretty",
        monochrome = true,
        features = "src/test/recources/com.it_academy.onliner.features"
)
public class CucumberTestRunner {
}
