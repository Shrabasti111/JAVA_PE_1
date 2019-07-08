package com.stackroute.pe1;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class ReverseStringTest {

    ReverseString reverseString;

    @Before
    public void setUp() {

        reverseString = new ReverseString();
    }

    @After
    public void tearDown() {

        reverseString = null;
    }

    @Test
    public void givenEmptyStringShouldReturnError() { //checks whether it returns error message
        //arrange

        //act
        String result = reverseString.reverse("");
        //assert
        assertEquals("Invalid Input!",result);
    }

    @Test
    public void givenString1ShouldPrintReverse() { //checks whether it returns the reversed string
        //arrange

        //act
        String result = reverseString.reverse("London");
        //assert
        assertEquals("nodnoL",result);
    }

    @Test
    public void givenString2ShouldPrintReverse() { //checks whether it returns the reversed string
        //arrange

        //act
        String result = reverseString.reverse("madam");
        //assert
        assertEquals("madam",result);

    }

    @Test(expected = NullPointerException.class) //checks for exception
    public void inputNullReturnException() {
        String result = reverseString.reverse(null);

    }
}
