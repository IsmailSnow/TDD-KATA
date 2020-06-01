package org.isi.fizzbuzz;

public class FizzBuzz {

    public static String of(int input) {
        if(input ==0 ){
            return "0";
        }
        return fizzBuzzLogic(input);
    }

    private static String fizzBuzzLogic(int input) {
        String result ="";
        if(input % 3 == 0 ){
            result+="Fizz";
        }
        if (input % 5 == 0 ) {
            result+="Buzz";
        }
        return !result.isEmpty() ?  result : String.valueOf(input);
    }
}
