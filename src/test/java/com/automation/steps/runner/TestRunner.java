package com.automation.steps.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/features/booking.feature",
        glue = "com.automation.steps",
        tags ="@Smoke and @Saniia"
)
public class TestRunner {
}
