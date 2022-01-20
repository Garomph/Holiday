package org.bsocquet.holidays.controller;

import org.bsocquet.holidays.entity.Holiday;
import org.bsocquet.holidays.service.SearchHolidayService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SearchController {

    private final SearchHolidayService service;

    public SearchController(SearchHolidayService service) {
        this.service = service;
    }


    @GetMapping("/holiday/{area}")
    public ResponseEntity<List<Holiday>> getHolidayForArea(@PathVariable("area") String area) {
        return new ResponseEntity<>(service.getHolidaysForArea(area), HttpStatus.OK);
    }
}
