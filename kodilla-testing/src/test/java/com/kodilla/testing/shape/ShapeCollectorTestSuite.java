package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapes = new ShapeCollector();

        //When
        shapes.addFigure(new Circle(2.7));

        //Then
        Assert.assertEquals(1, shapes.getArraySize());
    }

    @Test
    public void testRemoveNotExistingShape() {
        //Given
        ShapeCollector shape = new ShapeCollector();

        //When
        boolean result = shape.removeFigure(new Square(7.1));

        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shape = new ShapeCollector();
        Shape theShape = new Triangle(5.3,4.7);
        shape.addFigure(theShape);

        //When
        boolean result = shape.removeFigure(theShape);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, shape.getArraySize());
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shape = new ShapeCollector();
        Shape theShape = new Square(9.6);
        shape.addFigure(theShape);

        //When
        Shape retrievedShape = shape.getFigure(0);

        //Then
        Assert.assertEquals(theShape, retrievedShape);
    }

    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector shape = new ShapeCollector();
        Shape theShape = new Circle(5.84);
        //When


        //Then

    }
}
