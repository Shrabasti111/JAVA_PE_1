package com.stackroute.pe1;
public class CharacterType {

    /*  function to check the character type */
    public String checkType(String currentCharacter) {

        String value="";

        if(currentCharacter.charAt(0) >= 65 && currentCharacter.charAt(0) <= 90){
            value += "Capital Letter";
        } else if (currentCharacter.charAt(0) >= 97 && currentCharacter.charAt(0) <= 122){
            value += "Small Letter";
        } else if (currentCharacter.charAt(0) >= 48 && currentCharacter.charAt(0) <= 57){
            value += "Digit";
        } else {
            value += "Special Character";
        }

        return value;
    }

    /* main method */

}
