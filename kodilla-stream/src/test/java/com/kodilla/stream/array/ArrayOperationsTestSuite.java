package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int[] sampleTable = new int[20];
        for (int i=0;i< 20;i++) {
           sampleTable[i]=i+1;
        }
        //When
        double theResult=ArrayOperations.getAverage(sampleTable);

        //Then
        Assert.assertEquals(10.5, theResult,0);
    }

}
