package org.interview.backend.api.controller;

import org.interview.backend.api.entity.Country;
import org.interview.backend.api.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CountryController {

    @Autowired
    CountryService countryService;

    @GetMapping("/country")
    List<Country> getAllCountries() {

        return countryService.getAllCountries();
    }

    @GetMapping("/country/{id}")
    private Country getCountry(@PathVariable("id") int id) {

        return countryService.getCountryById(id);
    }

    @DeleteMapping("/student/{id}")
    private void deleteCountry(@PathVariable("id") int id) {

        countryService.delete(id);
    }

    @PostMapping("/country")
    private int saveCountry(@RequestBody Country country) {

        countryService.saveOrUpdate(country);
        return country.getId();
    }
}
