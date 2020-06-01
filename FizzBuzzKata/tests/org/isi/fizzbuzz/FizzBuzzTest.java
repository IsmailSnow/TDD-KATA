package org.isi.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {

    @Test
    public void fizzBuzzOfZeroIsZero(){
        //given
        int given = 0 ;
        String expected= "0";
        // when
        String result = FizzBuzz.of(given);
        // then
        assertEquals(expected,result);
    }

    @Test
    public void fizzBuzzOfOneIsOne(){
        //given
        int given = 1 ;
        String expected= "1";
        // when
        String result = FizzBuzz.of(given);
        // then
        assertEquals(expected,result);
    }

    @Test
    public void fizzBuzzOfTwoIsTwo(){
        //given
        int given = 2 ;
        String expected= "2";
        // when
        String result = FizzBuzz.of(given);
        // then
        assertEquals(expected,result);
    }

    @Test
    public void fizzBuzzOfThreeIsFizz(){
        //given
        int given = 3 ;
        String expected= "Fizz";
        // when
        String result = FizzBuzz.of(given);
        // then
        assertEquals(expected,result);
    }

    @Test
    public void fizzBuzzOfFourIsFizz(){
        //given
        int given = 4 ;
        String expected= "4";
        // when
        String result = FizzBuzz.of(given);
        // then
        assertEquals(expected,result);
    }


    @Test
    public void fizzBuzzOfFiveIsBuzz(){
        //given
        int given = 5 ;
        String expected= "Buzz";
        // when
        String result = FizzBuzz.of(given);
        // then
        assertEquals(expected,result);
    }

    @Test
    public void fizzBuzzOfSixIsFizz(){
        //given
        int given = 6 ;
        String expected= "Fizz";
        // when
        String result = FizzBuzz.of(given);
        // then
        assertEquals(expected,result);
    }

    @Test
    public void fizzBuzzOfTenIsBuzz(){
        //given
        int given = 10 ;
        String expected= "Buzz";
        // when
        String result = FizzBuzz.of(given);
        // then
        assertEquals(expected,result);
    }

    @Test
    public void fizzBuzzOfFifthenIsFizzBuzz(){
        //given
        int given = 15 ;
        String expected= "FizzBuzz";
        // when
        String result = FizzBuzz.of(given);
        // then
        assertEquals(expected,result);
    }
}