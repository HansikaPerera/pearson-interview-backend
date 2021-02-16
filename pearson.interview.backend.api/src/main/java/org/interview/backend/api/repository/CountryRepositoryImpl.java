package org.interview.backend.api.repository;

import org.interview.backend.api.entity.Country;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transaction;
import javax.transaction.Transactional;

public class CountryRepositoryImpl implements CustomCountryRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void deleteByCountryName(String countryName) {

        String sql = "delete from Country c where c.name = :name";
        Query query = em.createQuery(sql).setParameter("name", countryName);
        query.executeUpdate();
    }

    @Override
    public Country getCountryByCountryName(String countryName) {

        String sql = "select c from Country c where c.name = :name";
        Query query = em.createQuery(sql, Country.class)
                .setParameter("name", countryName);
        return (Country) query.getSingleResult();
    }
}
