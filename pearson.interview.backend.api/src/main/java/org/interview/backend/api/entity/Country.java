package org.interview.backend.api.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table
public class Country {

    @Id
    @Column
    private String name;

    @Column
    private int population;

    @Column
    private String capital;

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getPopulation() {

        return population;
    }

    public void setPopulation(int population) {

        this.population = population;
    }

    public String getCapital() {

        return capital;
    }

    public void setCapital(String capital) {

        this.capital = capital;
    }
}
