package com.co.devco.stepdefinitions;

import com.co.devco.drivers.Driver;
import com.co.devco.models.accommodationsModel;
import com.co.devco.questions.TheElement;
import com.co.devco.task.bookingSearch;
import com.co.devco.task.bookingSelect;
import com.co.devco.utils.constants.General;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

import static com.co.devco.userinterfaces.accommodationUI.MESSAGE;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class bookingAccommodationStepDefinitions {
    @Given("^the user enters main page$")
    public void theUserEntersMainPage() {
        theActorInTheSpotlight().can(BrowseTheWeb.with(Driver.inThePage(General.URL)));
    }

    @When("^the user search the accommodation$")
    public void theUserSearchTheAccommodation(List<accommodationsModel> ListaccommodationsModel) {
        OnStage.theActorInTheSpotlight().attemptsTo(bookingSearch.search(ListaccommodationsModel.get(0)));

    }

    @When("^then user select the accommodation$")
    public void thenUserSelectTheAccommodation(List<accommodationsModel> ListaccommodationsModel){
        OnStage.theActorInTheSpotlight().attemptsTo(bookingSelect.select(ListaccommodationsModel.get(0)));
    }

    @Then("^the user successfully add$")
    public void theUserSuccessfullyAdd() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheElement.exists(MESSAGE)));
    }
}
