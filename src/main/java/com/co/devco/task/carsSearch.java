package com.co.devco.task;

import com.co.devco.interactions.WaitFor;
import com.co.devco.models.carsModel;
import com.co.devco.models.fligthModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.co.devco.userinterfaces.carsUI.*;

public class carsSearch implements Task {

    carsModel listcarsModel;

    public carsSearch(carsModel listcarsModel) {
        this.listcarsModel = listcarsModel;
    }

    public static carsSearch search(carsModel listcarsModel){
        return Tasks.instrumented(carsSearch.class, listcarsModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor){

        actor.attemptsTo(Click.on(CARS_SECTION));
        actor.attemptsTo(WaitFor.seconds(2));
        actor.attemptsTo(Click.on(LOCATION_INPUT));
        actor.attemptsTo(Enter.theValue(listcarsModel.getLocation()).into(LOCATION_INPUT));
        actor.attemptsTo(Click.on(SELECT_VALUE.of(listcarsModel.getLocation())));
        actor.attemptsTo(Click.on(DATE_INPUT));

        actor.attemptsTo(WaitFor.seconds(2));

        if(listcarsModel.getMounthin() == "November"){
            actor.attemptsTo(Click.on(DATE.of("0",listcarsModel.getDatein())));
        }else if(listcarsModel.getMounthin() == "December"){
            actor.attemptsTo(Click.on(DATE.of("262",listcarsModel.getDatein())));
        }
        actor.attemptsTo(WaitFor.seconds(2));
        System.out.println(listcarsModel.getMounthout());
        if(listcarsModel.getMounthout() == "November"){
            actor.attemptsTo(Click.on(DATE.of("0",listcarsModel.getDateout())));
        }else if(listcarsModel.getMounthout() == "December"){
            actor.attemptsTo(Click.on(DATE.of("262",listcarsModel.getDateout())));
        }
        actor.attemptsTo(Scroll.to(SEARCH_BUTTON));
        actor.attemptsTo(Click.on(SEARCH_BUTTON));
        actor.attemptsTo(WaitFor.seconds(6));

    }
}
