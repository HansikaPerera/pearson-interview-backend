package org.interview.backend.api.repository;

import org.interview.backend.api.entity.Country;

public interface CustomCountryRepository {

    void deleteByCountryName(String name);
    Country getCountryByCountryName(String name);
}
