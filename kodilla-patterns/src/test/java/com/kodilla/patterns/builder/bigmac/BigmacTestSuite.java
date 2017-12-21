package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testPizzaNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll("Thin")
                .burgers(3)
                .sauce("Spicy")
                .ingredient("Ham")
                .ingredient("Mushrooms")
                .ingredient("Onion")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(3, howManyIngredients);
        Assert.assertEquals("Thin", bigmac.getRoll());
        Assert.assertEquals(3, bigmac.getBurgers());
        Assert.assertEquals("Spicy", bigmac.getSauce());
    }
}
