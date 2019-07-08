package com.stackroute.pe1;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class CharacterTypeTest {

    CharacterType characterType;

    @Before
    public void setUp() {

        characterType = new CharacterType();
    }

    @After
    public void tearDown() {
        characterType = null;
    }

    @Test
    public void givenCapitalShouldReturnCapital() { //checks whether the function returns capital letter
        //arrange

        //act
        String result = characterType.checkType("A");
        //assert
        assertEquals("Capital Letter",result);
    }

    @Test
    public void givenSmallShouldReturnSmall() { //checks whether the function returns small letter
        //arrange

        //act
        String result = characterType.checkType("a");
        //assert
        assertEquals("Small Letter",result);
    }

    @Test
    public void givenDigitShouldReturnDigit() { //checks whether the function returns digit
        //arrange

        //act
        String result = characterType.checkType("0");
        //assert

        assertEquals("Digit",result);

    }

    @Test
    public void givenSpecialShouldReturnSpecial() { //checks whether the function returns special character
        //arrange

        //act
        String result = characterType.checkType("$");
        //assert
        assertEquals("Special Character",result);
    }


    @Test(expected = NullPointerException.class) //checks for exception
    public void inputNullSubstringReturnException() {
        String result = characterType.checkType(null);
    }
}
