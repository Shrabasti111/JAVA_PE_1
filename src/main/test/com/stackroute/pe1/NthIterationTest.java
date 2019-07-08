package com.stackroute.pe1;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class NthIterationTest {

    NthIteration nthIteration;

    @Before
    public void setUp() {
        nthIteration = new NthIteration();
    }

    @After
    public void tearDown() {
        nthIteration = null;
    }

    @Test
    public void givenNumberNDisplayNthNumberNTimes() { //checks whether the function returns the nth number n number of times
        //arrange

        //act
        String result = nthIteration.iterate(5);
        //assert
        assertEquals("122333444455555", result);
    }

    @Test
    public void givenNumberN1DisplayNthNumberN1Times() { //checks whether the function returns the nth number n number of times
        //arrange

        //act
        String result = nthIteration.iterate(2);
        //assert
        assertEquals("122", result);
    }

    @Test
    public void givenNumberN2DisplayNthNumberN2Times() { //checks whether the function returns the nth number n number of times
        //arrange

        //act
        String result = nthIteration.iterate(5);
        //assert
        assertEquals("122333444455555", result);
    }


    @Test
    public void givenZeroReturnNull() { //checks for null
        //arrange

        //act
        String result = nthIteration.iterate(0);
        assertNull(result);

    }


}
