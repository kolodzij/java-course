package com.kodilla.testing.collection;

import com.kodilla.testing.user.SimpleUser;
import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator numbersList = new OddNumbersExterminator();
        //When
        ArrayList<Integer> result = numbersList.exterminate(new ArrayList<Integer>());
        //Then
        Assert.assertEquals(0,result.size());
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator numbersList = new OddNumbersExterminator();
        //When
        ArrayList<Integer> result = numbersList.exterminate(new ArrayList<Integer>(Arrays.asList(1,2,3,8,7,15,18,20,25)));
        //Then
        Assert.assertArrayEquals(Arrays.asList(2,8,18,20).toArray() ,result.toArray());
    }
}

