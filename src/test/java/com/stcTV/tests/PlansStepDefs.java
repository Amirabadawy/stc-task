package com.stcTV.tests;

import com.stcTV.browser.Browser;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import org.testng.Assert;

import java.util.List;

public class PlansStepDefs extends BaseTest{
    List<String> list;

    @Given("website is opened")
    public void websiteIsOpened() {
        browser = new Browser();
    }

    @When("click on arrow button in home page")
    public void clickOnSearchButton(){
        browser.stcTV.home.clickOnArrow();
    }

    @When("click on Bahrain country in popUp")
    public void clickOnBahrainCountry(){
        browser.stcTV.home.clickOnBahrain();
    }

    @When("click on Kuwait country in popUp")
    public void clickOnKuwaitCountry(){
        browser.stcTV.home.clickOnKuwait();
    }

    @Then("country Name {string} should be displayed in home page")
    public void KSACountryShouldBeDisplayed(String countryName){
        Assert.assertEquals(browser.stcTV.home.getCountryName().getText(),countryName);
    }

    @Then("plan type should be lite {string} in home page")
    public void planTypeShouldBeDisplayedLite(String planType){
        Assert.assertEquals(browser.stcTV.home.getLitePlan().getText(),planType);
    }

    @Then("plan type should be classic {string} in home page")
    public void planTypeShouldBeDisplayedClassic(String planType){
        Assert.assertEquals(browser.stcTV.home.getClassicPlan().getText(),planType);
    }

    @Then("plan type should be premium {string} in home page")
    public void planTypeShouldBeDisplayedPremium(String planType){
        Assert.assertEquals(browser.stcTV.home.getPremiumPlan().getText(),planType);
    }


    @Then("price of lite plan should be {string} in home page")
    public void priceOfLitePlanShouldBe(String planPrice){
//        list = browser.stcTv.home.getPrice(browser.stcTv.home.getLitePrice().getText());
//        list.toString();
//        Assert.assertEquals(list, planPrice);
        Assert.assertTrue(browser.stcTV.home.getLitePrice().getText().contains(planPrice));
    }

    @Then("currency should be {string} in home page")
    public void currencyShouldBe(String currency){
        Assert.assertTrue(browser.stcTV.home.getLitePrice().getText().contains(currency));
    }

    @Then("price of classic plan should be {string} in home page")
    public void priceOfClassicPlanShouldBe(String planPrice){
        Assert.assertTrue(browser.stcTV.home.getClassicPrice().getText().contains(planPrice));
    }

    @Then("price of premium plan should be {string} in home page")
    public void priceOfPremiumPlanShouldBe(String planPrice){
        Assert.assertTrue(browser.stcTV.home.getPremiumPrice().getText().contains(planPrice));
    }
}
