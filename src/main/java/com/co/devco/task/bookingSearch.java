package com.co.devco.task;

import com.co.devco.interactions.WaitFor;
import com.co.devco.models.accommodationsModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouseToTarget;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.co.devco.userinterfaces.accommodationUI.*;

public class bookingSearch implements Task {

    accommodationsModel listaccommodationsModel;

    public bookingSearch(accommodationsModel listaccommodationsModel) {
        this.listaccommodationsModel = listaccommodationsModel;
    }

    public static bookingSearch search(accommodationsModel listaccommodationsModel){
        return Tasks.instrumented(bookingSearch.class, listaccommodationsModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor){

        actor.attemptsTo(Click.on(UBICATION_INPUT));
        actor.attemptsTo(Enter.theValue(listaccommodationsModel.getUbication()).into(UBICATION_INPUT));
        String ubication = listaccommodationsModel.getUbication() + ", " + listaccommodationsModel.getDepart();
        actor.attemptsTo(Click.on(UBICATIONSELECT_INPUT.of(ubication)));
        actor.attemptsTo(WaitFor.seconds(2));
        actor.attemptsTo(Click.on(DATE_INPUT.of(listaccommodationsModel.getDatein())));
        actor.attemptsTo(Click.on(DATE_INPUT.of(listaccommodationsModel.getDateout())));
        actor.attemptsTo(WaitFor.seconds(2));
        actor.attemptsTo(Click.on(SEARCH_BUTTON));
        actor.attemptsTo(WaitFor.seconds(4));

    }
}
