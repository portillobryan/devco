package com.co.devco.stepdefinitions;

import com.co.devco.models.accommodationsModel;
import com.co.devco.models.fligthModel;
import com.co.devco.questions.TheElement;
import com.co.devco.task.bookingSearch;
import com.co.devco.task.bookingSelect;
import com.co.devco.task.fligthSearch;
import com.co.devco.task.fligthSelect;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

import static com.co.devco.userinterfaces.accommodationUI.MESSAGE;

public class bookingFligthStepDefinitions {

    @When("^the user search the fligth$")
    public void theUserSearchTheFligth(List<fligthModel> ListfligthModel) {
        OnStage.theActorInTheSpotlight().attemptsTo(fligthSearch.search(ListfligthModel.get(0)));

    }

    @Then("^then user select successfully the fligth$")
    public void thenUserSelectSuccessfullyTheFligth(){
        OnStage.theActorInTheSpotlight().attemptsTo(fligthSelect.select());
    }

}
