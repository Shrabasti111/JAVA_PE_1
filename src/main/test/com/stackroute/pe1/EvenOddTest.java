package com.stackroute.pe1;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class EvenOddTest {

    EvenOdd evenOdd;

    @Before
    public void setUp() {
        evenOdd = new EvenOdd();
    }

    @After
    public void tearDown() {
        evenOdd = null;
    }

    @Test
    public void givenOddShouldPrintTom() { //checks if the function returns Tom
        //arrange

        //act
        String result = evenOdd.tomJerry(23);
        //assert
        assertEquals("Tom",result);
    }

    @Test
    public void givenEvenShouldPrintJerry() { //checks if the function returns Jerry
        //arrange

        //act
        String result = evenOdd.tomJerry(24);
        //assert
        assertEquals("Jerry",result);
    }

    @Test
    public void givenOutOfRangeShouldPrintNeither() { //checks if the function returns Neither Tom Nor Jerry
        //arrange

        //act
        String result = evenOdd.tomJerry(3);
        //assert
        assertEquals("Neither Tom nor Jerry", result);

    }

    @Test
    public void givenNegativeShouldPrintNeither() { //checks if the function returns Neither Tom Nor Jerry
        //arrange

        //act
        String result = evenOdd.tomJerry(-3);
        //assert
        assertEquals("Neither Tom nor Jerry", result);

    }

    @Test
    public void givenZeroShouldPrintNeither() { //checks if the function returns Neither Tom Nor Jerry
        //arrange

        //act
        String result = evenOdd.tomJerry(0);
        //assert
        assertEquals("Neither Tom nor Jerry", result);

    }



}

