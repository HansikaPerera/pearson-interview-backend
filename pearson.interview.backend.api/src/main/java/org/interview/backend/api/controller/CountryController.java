package org.interview.backend.api.controller;

import org.interview.backend.api.entity.Country;
import org.interview.backend.api.repository.CountryRepositoryImpl;
import org.interview.backend.api.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CountryController {

    Logger logger = LoggerFactory.getLogger(CountryRepositoryImpl.class);

    @Autowired
    CountryService countryService;

    @GetMapping("/country")
    List<Country> getAllCountries() {

        logger.info("Fetching all countries");
        return countryService.getAllCountries();
    }

    @GetMapping("/country/{name}")
    private Country getCountry(@PathVariable String name) {

        logger.info("Fetching the country with name: " + name);
        return countryService.getCountryByName(name);
    }

    @DeleteMapping("/country/{name}")
    private void deleteCountry(@PathVariable String name) {

        logger.info("Deleting the country with name: " + name);
        countryService.delete(name);
    }

    @PostMapping("/country")
    private Country saveCountry(@RequestBody Country country) {

        logger.info("Saving the country with name: " + country.getName());
        countryService.saveOrUpdate(country);
        return country;
    }

    @PutMapping("/country")
    private Country updateCountry(@RequestBody Country country) {

        logger.info("Updating the country with name: " + country.getName());
        countryService.saveOrUpdate(country);
        return country;
    }
}
