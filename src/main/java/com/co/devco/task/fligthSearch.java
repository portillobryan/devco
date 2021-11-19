package com.co.devco.task;

import com.co.devco.interactions.WaitFor;
import com.co.devco.models.accommodationsModel;
import com.co.devco.models.fligthModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouseToTarget;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.co.devco.userinterfaces.fligthUI.*;

public class fligthSearch implements Task {

    fligthModel listfligthModel;

    public fligthSearch(fligthModel listfligthModel) {
        this.listfligthModel = listfligthModel;
    }

    public static fligthSearch search(fligthModel listfligthModel){
        return Tasks.instrumented(fligthSearch.class, listfligthModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor){

        actor.attemptsTo(Click.on(FLIGTH_SECTION));
        actor.attemptsTo(WaitFor.seconds(2));
        actor.attemptsTo(Click.on(ORIGEN_INPUT));
        actor.attemptsTo(Enter.theValue(listfligthModel.getOrigen()).into(ORIGEN_INPUT_VALUE));
        actor.attemptsTo(Click.on(SELECT_VALUE.of(listfligthModel.getOrigen())));
        actor.attemptsTo(Click.on(DESTINO_INPUT));
        actor.attemptsTo(Enter.theValue(listfligthModel.getDestino()).into(DESTINO_INPUT_VALUE));
        actor.attemptsTo(Click.on(SELECT_VALUE.of(listfligthModel.getDestino())));
        actor.attemptsTo(Click.on(DATEIN_INPUT));
        actor.attemptsTo(Click.on(DATE.of(listfligthModel.getDatein())));
        actor.attemptsTo(WaitFor.seconds(2));
        actor.attemptsTo(Click.on(DATE.of(listfligthModel.getDateout())));
        actor.attemptsTo(Click.on(SEARCH_BUTTON));
        actor.attemptsTo(WaitFor.seconds(4));

    }
}
