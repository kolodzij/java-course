package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class Continent {

    private final String continent;
    private final Set<Country> countryList;

    public Continent(String continent, Set<Country> countryList) {
        this.continent = continent;
        this.countryList = countryList;
    }

    public Set<Country> getCountryList() {
        return countryList;
    }
}
