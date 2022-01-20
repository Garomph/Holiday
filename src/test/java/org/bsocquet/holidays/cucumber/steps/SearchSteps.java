package org.bsocquet.holidays.cucumber.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.bsocquet.holidays.entity.Holiday;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchSteps {

    @Autowired
    private TestRestTemplate testRestTemplate;


    private List<Holiday> holidays;

    @When("I ask for the list of holiday in {string}")
    public void getListOfHolidays(String area) {
    }


    @Then("The application returns :")
    public void returnContains(DataTable dataTable) {
    }
}
