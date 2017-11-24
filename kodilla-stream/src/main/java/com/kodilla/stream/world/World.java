package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class World {

    private final Set<Continent> continentList = new HashSet<>();

    public BigDecimal getWorldPeopleQuantity(Set<Continent> continentList){
        return continentList.stream()
                .flatMap(continent->continent.getCountryList().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
