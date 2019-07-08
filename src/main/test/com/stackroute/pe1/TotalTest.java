package com.stackroute.pe1;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class TotalTest {


    Total total;

    @Before
    public void setUp() {

        total = new Total();
    }

    @After
    public void tearDown() {
        total = null;
    }

    @Test
    public void givenStringReturnTotal(){ //checks whether it returns the total of the given numbers
        //arrange

        //act
        int result = total.calculateTotal("12 21");
        //assert
        assertEquals(33,result);
    }

    @Test
    public void givenString1ReturnTotal(){ //checks whether it returns the total of the given numbers
        //arrange

        //act
        int result = total.calculateTotal("12 21 24");
        //assert
        assertEquals(57,result);
    }

    @Test
    public void givenString2ReturnTotal(){ //checks whether it returns the total of the given numbers
        //arrange

        //act
        int result = total.calculateTotal("12 21 1 2");
        //assert
        assertEquals(36,result);
    }

}
