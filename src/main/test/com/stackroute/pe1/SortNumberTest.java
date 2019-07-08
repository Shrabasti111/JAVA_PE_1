package com.stackroute.pe1;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class SortNumberTest {

    SortNumber sortNumber;

    @Before
    public void setUp() {
        sortNumber = new SortNumber();
    }

    @After
    public void tearDown() {
        sortNumber = null;
    }

    @Test
    public void givenNumberReturnCountOfDigits() { //checks whether it returns the count of digit
        //arrange

        //act
        int result = sortNumber.countDigits(1234);
        //assert
        assertEquals(4,result);
    }

    @Test
    public void givenNumberReturnNumberWithDigitsInDecreasing() { //checks whether the digits are sorted
        //arrange

        //act
        int arr[] = {3,4,5,2,1};

        String result = sortNumber.sortDigits(arr);
        //assert
        assertEquals( "54321", result);
    }

    @Test
    public void givenNumberReturnSumOfEvenDigits() { //checks whether it returns the sum
        //arrange

        //act
        int arr[] = {3,4,5,2,1};

        int result = sortNumber.evenSum(arr);
        //assert
        assertEquals(6, result);
    }


}
