package com.stcTV.tests;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.stcTV.browser.Browser;
import com.stcTV.utilities.PropertiesConfig;
import com.stcTV.driver.WebDriverHandler;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.BeforeTest;
import java.io.IOException;

public class HooksHandler extends BaseTest {

    @Before
    public void setUp() throws IOException {
        webDriverHandler = new WebDriverHandler();
        browser = new Browser();
        config = new PropertiesConfig("resources/config/config.properties");
        webDriverHandler.navigateTo("https://subscribe.stctv.com/sa-en");
        webDriverHandler.maximizeWindow();
    }

    @AfterStep
    public void AfterStep(Scenario scenario) throws IOException, InterruptedException {
        if (scenario.isFailed()) {
            ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64Screenshot()).build());
        }
    }

    @After()
    public void tearDown() {
        webDriverHandler.close();
    }

    public String getBase64Screenshot() {
        return ((TakesScreenshot) WebDriverHandler.getWebDriver()).getScreenshotAs(OutputType.BASE64);
    }

}
