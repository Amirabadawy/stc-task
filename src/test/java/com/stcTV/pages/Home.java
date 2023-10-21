package com.stcTV.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;

public class Home extends BasePage{
    private final By countryName = By.id("country-name");
    private final By litePlan = By.id("name-lite");
    private final By classicPlan = By.id("name-classic");
    private final By premiumPlan = By.id("name-premium");
    private final By liteCurrency = By.xpath("//*[@id= \"currency-lite\"]/i");
    private final By litePrice = By.id("currency-lite");
    private final By classicPrice = By.id("currency-classic");
    private final By classicCurrency = By.xpath("//*[@id='currency-classic']/i");
    private final By premiumPrice = By.id("currency-premium");
    private final By arrow = By.id("arrow");
    private final By Bahrain = By.id("bh");
    private final By KSA = By.id("sa");
    private final By Kuwait = By.id("kw");

    public WebElement getCountryName() {
        return findElement(countryName);
    }

    public WebElement getLitePlan() {
        return findElement (litePlan);
    }

    public WebElement getClassicPlan() {
        return findElement (classicPlan);
    }

    public WebElement getPremiumPlan() {
        return findElement(premiumPlan);
    }

    public WebElement getLiteCurrency() {
        return findElement (liteCurrency);
    }

    public WebElement getLitePrice() {
        return findElement(litePrice);
    }

    public WebElement getClassicPrice() {
        return findElement(classicPrice);
    }

    public WebElement getClassicCurrency() {
        return findElement (classicCurrency);
    }

    public WebElement getPremiumPrice() {
        return findElement (premiumPrice);
    }

    public WebElement getArrow() {
        return findElement (arrow);
    }

    public WebElement getBahrain() {
        return findElement (Bahrain);
    }

    public WebElement getKSA() {
        return findElement (KSA);
    }

    public WebElement getKuwait() {
        return findElement (Kuwait);
    }

    public void clickOnArrow(){
        findElement(arrow).click();
    }

    public void clickOnBahrain(){
        findElement(Bahrain).click();
    }

    public void clickOnKuwait(){
        findElement(Kuwait).click();
    }

    public List<String> getPrice(String planPrice) {
        String[] strParts= null;
        List<String> list = null;
//        strParts = planPrice.split("[SAR,/,month]");
        strParts = planPrice.split("[SAR |/|[ | ] |month]");
        list = Arrays.asList(strParts);
        return list;
    }
}
