package org.interview.backend.api.service;

import org.interview.backend.api.entity.Country;
import org.interview.backend.api.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountryService {

    @Autowired
    CountryRepository countryRepository;

    public List<Country> getAllCountries() {

        List<Country> countries = new ArrayList<>();
        countryRepository.findAll().forEach(countries::add);
        return countries;
    }

    public Country getCountryByName(String name) {

        return countryRepository.getCountryByCountryName(name);
    }

    public Country saveOrUpdate(Country country) {

        return countryRepository.save(country);
    }

    public void delete(String name) {

        countryRepository.deleteByCountryName(name);
    }
}
