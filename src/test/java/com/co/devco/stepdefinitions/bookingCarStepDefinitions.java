package com.co.devco.stepdefinitions;

import com.co.devco.models.carsModel;
import com.co.devco.models.fligthModel;
import com.co.devco.task.carsSearch;
import com.co.devco.task.fligthSearch;
import com.co.devco.task.fligthSelect;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

public class bookingCarStepDefinitions {

    @When("^the user search the cars$")
    public void theUserSearchTheCars(List<carsModel> ListcarsModel) {
        OnStage.theActorInTheSpotlight().attemptsTo(carsSearch.search(ListcarsModel.get(0)));

    }

    @Then("^then user select successfully the cars$")
    public void thenUserSelectSuccessfullyTheCars(){
        OnStage.theActorInTheSpotlight().attemptsTo(fligthSelect.select());
    }
}
