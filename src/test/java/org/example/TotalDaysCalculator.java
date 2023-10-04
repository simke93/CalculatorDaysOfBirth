package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class TotalDaysCalculator {
    public String birthDateStr;
    public String resultMessage;


    @Given("I enter my birthdate as {string}")
    public void enterBirthDate(String birthDate) {
        birthDateStr = birthDate;
    }

    @When("I calculate total days")
    public void calculateTotalDays(){
        long totalDays = 0;
        resultMessage = "Total days in life: " + totalDays;
    }

    @Then("I should see {string}")
    public void checkResultMessage(String expectedMessage){
        Assert.assertEquals(expectedMessage, resultMessage);
    }

}
