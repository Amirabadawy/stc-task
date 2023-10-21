package com.stcTV.tests.bahrainPlans;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/com/stcTV/tests/bahrainPlans/BahrainPlans.feature",
        glue = {"com.stcTV.tests"},
        plugin = {"pretty","html:reports/BahrainPlans-Report.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        monochrome = true
)
public class BahrainTestRunner extends AbstractTestNGCucumberTests {
}