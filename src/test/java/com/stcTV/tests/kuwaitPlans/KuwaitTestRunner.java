package com.stcTV.tests.kuwaitPlans;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/com/stcTV/tests/kuwaitPlans/KuwaitPlans.feature",
        glue = {"com.stcTV.tests"},
        plugin = {"pretty","html:reports/KuwaitPlans-Report.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        monochrome = true
)

public class KuwaitTestRunner extends AbstractTestNGCucumberTests {
}
