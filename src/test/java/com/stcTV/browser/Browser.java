package com.stcTV.browser;

import com.stcTV.StcTV;
import com.stcTV.driver.WebDriverHandler;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Browser {
    private final WebDriver webDriver = WebDriverHandler.getWebDriver();
    public StcTV stcTV;

    public Browser() {
        stcTV = new StcTV();
    }

    public Alert getAlert() {
        WebDriverWait wait = new WebDriverWait(WebDriverHandler.getWebDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = webDriver.switchTo().alert();
        return alert;
    }
}
