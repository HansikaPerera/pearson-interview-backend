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

    public Country getCountryById(int id) {

        return countryRepository.findById(id).get();
    }

    public Country saveOrUpdate(Country country) {

        return countryRepository.save(country);
    }

    public void delete(int id) {

        countryRepository.deleteById(id);
    }
}
