package com.co.devco.interactions;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import org.openqa.selenium.WebDriver;

import java.util.Set;


public class SwitchToNewWindow implements Task {
    private static final Logger log = LoggerFactory.getLogger(SwitchToNewWindow.class);

    public SwitchToNewWindow() { }

    @Override
    public <T extends Actor> void performAs(T actor) {

        WebDriver driver = BrowseTheWeb.as(actor).getDriver();

        String currHandle = driver.getWindowHandle();
        Set<String> allHandles = driver.getWindowHandles();

        log.debug("open windows: " + allHandles.size());
        log.debug("current window: " + currHandle);
        for (String handle : allHandles) {
            if (!handle.contentEquals(currHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }
        log.debug("new window: " + driver.getWindowHandle());
    }

    public static SwitchToNewWindow change() {

        return Tasks.instrumented(SwitchToNewWindow.class);
    }
}
