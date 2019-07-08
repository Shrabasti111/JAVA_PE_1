package com.stackroute.pe1;

public class NthIteration {

    /* method to display nth number for n number of times */
    public String iterate(int n){
        
        if(n==0){
            return null;
        }

        if(n==0){
            return null;
        }

        String value="";

        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++){
                value += String.valueOf(i);
            }
        }
        System.out.println(" ");
        return value;
    }



    /* main method */


}
