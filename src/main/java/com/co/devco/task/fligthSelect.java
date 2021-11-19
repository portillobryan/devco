package com.co.devco.task;

import com.co.devco.interactions.SwitchToNewWindow;
import com.co.devco.interactions.WaitFor;
import com.co.devco.models.accommodationsModel;
import com.co.devco.models.fligthModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.co.devco.userinterfaces.fligthUI.*;

public class fligthSelect implements Task {

    public static fligthSelect select(){
        return Tasks.instrumented(fligthSelect.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor){

        actor.attemptsTo(Click.on(SELECT_FLIGTH));

    }
}
