package com.co.devco.runners;

import com.co.devco.utils.excel.BeforeSuite;
import com.co.devco.utils.excel.DataToFeature;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;

@RunWith(CustomRunner.class)
@CucumberOptions(
        features = "src/test/resources/features/booking_accommodation.feature",
        glue = {"com.co.devco.stepdefinitions", "com.co.devco.hooks"},
        snippets = SnippetType.CAMELCASE,
        tags = "@Test"

)

public class bookingAccommodationRunner {
    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles("src/test/resources/features/booking_accommodation.feature");
    }
}
