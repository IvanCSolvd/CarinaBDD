package com.solvd.carina.cucumber;

import com.zebrunner.carina.cucumber.CucumberBaseTest;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/SaucedemoLogin.feature",
        glue = "src/test/java/com/solvd/carina/cucumber/steps",
        plugin={"pretty",
                "html:target/cucumber-core-test-report",
                "pretty:target/cucumber-core-test-report.txt",
                "json:target/cucumber-core-test-report.json"}
)
public class SaucedemoTest extends CucumberBaseTest {
}
