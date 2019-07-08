
package com.stackroute.pe1;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class VowelConsonantTest {

    VowelConsonant vowelConsonant;

    @Before
    public void setUp() {

        vowelConsonant = new VowelConsonant();
    }

    @After
    public void tearDown() {

        vowelConsonant = null;
    }

    @Test
    public void givenStringReturnConsonantVowel(){ //checks whether it identifies vowel and consonant
        //arrange

        //act
        String result = vowelConsonant.determineVowelConsonants("mad");
        //assert
        assertEquals("consonantvowelconsonant", result);
    }

    @Test
    public void givenStringReturnInvalidInput(){ //checks whether it identifies invalid input
        //arrange

        //act
        String result = vowelConsonant.determineVowelConsonants("@%&");
        //assert
        assertEquals("Invalid Input! Invalid Input! Invalid Input! ", result);
    }

    @Test
    public void givenString1ReturnInvalidInput(){ //checks whether it identifies invalid input


        //act
        String result = vowelConsonant.determineVowelConsonants("ma@");
        //assert
        assertEquals("consonantvowelInvalid Input! ", result);
    }

    @Test(expected = NullPointerException.class) //checks for exception
    public void inputNullReturnException() {
        String result = vowelConsonant.determineVowelConsonants(null);
    }


}
