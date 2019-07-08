package com.stackroute.pe1;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class GuessGameTest {

    GuessGame guessGame;

    @Before
    public void setUp() {
       

        guessGame = new GuessGame();
    }

    @After
    public void tearDown() {
        guessGame = null;
    }

    @Test
    public void givenTargetShouldReturnWhenMatches() { //checks if the target matches the randomly generated number
        //arrange

        //act
        String result = guessGame.guessNumber(45);
        //assert
        assertEquals("Number matches the original number", result);
    }

    @Test
    public void givenNegativeTargetShouldReturnErrorMessage(){ //checks whether the function returns error message for a negative integer

        //arrange

        //act
        String result = guessGame.guessNumber(-2);
        //assert
        assertEquals("Target is negative", result);
    }

    @Test
    public void givenOutOfRangeShouldReturnErrorMessage() { //checks whether the function returns error message for an out of range input
        //arrange

        //act
        String result = guessGame.guessNumber(221);
        //assert
        assertEquals("Target is out of bounds", result);
    }



}
