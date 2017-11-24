package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Set<Continent> theContinentList = new HashSet<>();

        Set<Country> asiaCountryList = new HashSet<Country>();
        Country india = new Country("india", new BigDecimal("1339180127"));
        Country china = new Country("china",new BigDecimal("1409517397"));
        Country indonesia = new Country("indonesia",new BigDecimal("263991379"));
        Country pakistan = new Country("pakistan",new BigDecimal("197015955"));
        asiaCountryList.add(india);
        asiaCountryList.add(china);
        asiaCountryList.add(indonesia);
        asiaCountryList.add(pakistan);

        Set<Country> africaCountryList = new HashSet<Country>();
        Country egypt = new Country("egypt",new BigDecimal("97553151"));
        Country ethiopia = new Country("ethiopia",new BigDecimal("104957438"));
        Country nigeria = new Country("nigeria",new BigDecimal("190886311"));
        africaCountryList.add(egypt);
        africaCountryList.add(ethiopia);
        africaCountryList.add(nigeria);

        Set<Country> europeCountryList = new HashSet<Country>();
        Country germany = new Country("germany",new BigDecimal("82114224"));
        Country france = new Country("france",new BigDecimal("64979548"));
        Country italy = new Country("italy",new BigDecimal("59359900"));
        Country spain = new Country("spain",new BigDecimal("46354321"));
        Country uk = new Country("uk",new BigDecimal("66181585"));
        europeCountryList.add(germany);
        europeCountryList.add(france);
        europeCountryList.add(italy);
        europeCountryList.add(spain);
        europeCountryList.add(uk);

        theContinentList.add(new Continent("asia",asiaCountryList));
        theContinentList.add(new Continent("africa",africaCountryList));
        theContinentList.add(new Continent("europe",europeCountryList));

        World theWorld = new World();

        //When
        BigDecimal totalPeopleQuantity = theWorld.getWorldPeopleQuantity(theContinentList);

        //Then
        BigDecimal expectedVal = new BigDecimal("3922091336");
        Assert.assertEquals(expectedVal,totalPeopleQuantity);
    }
}
