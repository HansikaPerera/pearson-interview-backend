package org.interview.backend.api.repository;

import org.interview.backend.api.entity.Country;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository<Country, Integer>, CustomCountryRepository {
}
