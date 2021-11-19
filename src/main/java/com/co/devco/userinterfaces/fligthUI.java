package com.co.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class fligthUI {

    public static Target FLIGTH_SECTION = Target.the("Fligth Section").locatedBy("//a[@data-decider-header='flights']");

    public static Target ORIGEN_INPUT = Target.the("Origen input").locatedBy("/html/body/div[1]/div[1]/main/div[1]/div[1]/div/div[1]/div/div[2]/section[2]/div/div/div[2]/form[1]/div[1]/div/div[1]/div/div[1]/div/div/div");

    public static Target ORIGEN_INPUT_VALUE = Target.the("ORIGEN_INPUT_VALUE").locatedBy("/html/body/div[4]/div/div[2]/div[1]/div[1]/input");

    public static Target SELECT_VALUE = Target.the("Origen select Value").locatedBy("//li[contains(@data-short-name,'{0}')]");

    public static Target DESTINO_INPUT = Target.the("Destino input").locatedBy("/html/body/div[1]/div[1]/main/div[1]/div[1]/div/div[1]/div/div[2]/section[2]/div/div/div[2]/form[1]/div[1]/div/div[1]/div/div[3]/div/div");

    public static Target DESTINO_INPUT_VALUE = Target.the("DESTINO_INPUT_VALUE").locatedBy("/html/body/div[5]/div/div[2]/div[1]/div[1]/input");

    public static Target DATEIN_INPUT = Target.the("Datein input").locatedBy("/html/body/div[1]/div[1]/main/div[1]/div[1]/div/div[1]/div/div[2]/section[2]/div/div/div[2]/form[1]/div[1]/div/div[1]/div/div[4]/div/div[1]/div/div/div[1]");

    public static Target DATE = Target.the("Date").locatedBy("//div[@aria-label='{0}']");

    public static Target SEARCH_BUTTON = Target.the("Search button").locatedBy("/html/body/div[1]/div[1]/main/div[1]/div[1]/div/div[1]/div/div[2]/section[2]/div/div/div[2]/form[1]/div[1]/div/div[2]/button");


    //FLIGTH SELECT

    public static Target SELECT_FLIGTH = Target.the("Select Fligth").locatedBy("/html/body/div[1]/div[1]/main/div/div[2]/div[2]/div/div[2]/div[1]/div[2]/div[4]/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/div/div[2]/div/div[2]/div[1]/div/div[2]/div[2]/div/div/div/a");


}
