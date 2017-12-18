package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double sum=calculator.add(3,5);
        double sub=calculator.sub(3,5);
        double mul=calculator.mul(3,5);
        double div=calculator.div(5,2);
        //Then
        Assert.assertEquals(8, sum,0);
        Assert.assertEquals(-2, sub,0);
        Assert.assertEquals(15, mul,0);
        Assert.assertEquals(2.5, div,0);

    }
}
