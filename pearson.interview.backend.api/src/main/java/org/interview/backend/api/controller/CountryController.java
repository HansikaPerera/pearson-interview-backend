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

    @GetMapping("/country/{name}")
    private Country getCountry(@PathVariable String name) {

        return countryService.getCountryByName(name);
    }

    @DeleteMapping("/country/{name}")
    private void deleteCountry(@PathVariable String name) {

        countryService.delete(name);
    }

    @PostMapping("/country")
    private Country saveCountry(@RequestBody Country country) {

        countryService.saveOrUpdate(country);
        return country;
    }

    @PutMapping("/country")
    private Country updateCountry(@RequestBody Country country) {

        countryService.saveOrUpdate(country);
        return country;
    }
}
