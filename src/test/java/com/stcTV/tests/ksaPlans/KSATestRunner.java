package com.stcTV.tests.ksaPlans;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/com/stcTV/tests/ksaPlans/KSAPlans.feature",
        glue = {"com.stcTV.tests"},
        plugin = {"pretty","html:reports/KSAPlans-Report.html", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        monochrome = true
)

public class KSATestRunner extends AbstractTestNGCucumberTests {
}
