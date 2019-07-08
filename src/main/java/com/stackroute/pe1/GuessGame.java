package com.stackroute.pe1;
import java.util.*;
public class GuessGame {

    /* function to check whether the number guessed matches the target number */
    public String guessNumber(int target) {

        String value="";

        if(target<1) {
            value += "Target is negative";
            return value;
        }

        if(target > 100){
            value += "Target is out of bounds";
            return value;
        }
       int randomNum;
        do{
            Random rand = new Random();
            randomNum = rand.nextInt((100-1)+1)+1; /* random number between 1 to 100 is generated */

            if(randomNum > target){
                System.out.println("Number guessed is more than the original number");
            } else {
                System.out.println("Number guessed is less than original number");
            }
        } while(randomNum != target); /* loop continues as long as the guessed number does not match the target */

        value+="Number matches the original number";

        return value;
    }

    /* main method */

}
