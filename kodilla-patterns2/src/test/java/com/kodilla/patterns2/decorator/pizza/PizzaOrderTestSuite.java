package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testPizzaWithOnionAndMushroomsGetCost() {
        //Given
        PizzaOrder pizza = new BasicPizza();
        pizza = new OnionDecorator(pizza);
        pizza = new MushroomsDecorate(pizza);
        //When
        BigDecimal theCost = pizza.getCost();
        //Then
        assertEquals(new BigDecimal(24), theCost);
    }

    @Test
    public void testPizzaWithOnionAndMushroomsGetDescription() {
        //Given
        PizzaOrder pizza = new BasicPizza();
        pizza = new OnionDecorator(pizza);
        pizza = new MushroomsDecorate(pizza);
        //When
        String description = pizza.getDescription();
        //Then
        assertEquals("Pizza: tomato sauce and cheese + onion + mushrooms", description);
    }

    @Test
    public void testPizzaWithAdditionalCheeseSeafoodOnionGetCost() {
        //Given
        PizzaOrder pizza = new BasicPizza();
        pizza = new AdditionalCheeseDecorate(pizza);
        pizza = new Seafood(pizza);
        pizza = new OnionDecorator(pizza);

        //When
        BigDecimal theCost = pizza.getCost();
        //Then
        assertEquals(new BigDecimal(31), theCost);
    }

    @Test
    public void testPizzaWithAdditionalCheeseSeafoodOnionGetDescription() {
        //Given
        PizzaOrder pizza = new BasicPizza();
        pizza = new AdditionalCheeseDecorate(pizza);
        pizza = new Seafood(pizza);
        pizza = new OnionDecorator(pizza);
        //When
        String description = pizza.getDescription();
        //Then
        assertEquals("Pizza: tomato sauce and cheese + additional cheese + seafood + onion", description);
    }
}
