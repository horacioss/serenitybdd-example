package com.horacioss.automationtest.runners;


import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = {"com.horacioss.automationtest.glue", "com.horacioss.automationtest.hooks"},
        plugin = "json:build/cucumber-reports/json/cucumber.json",
        tags = "@Login"
)
public class RunnerTest {
}
