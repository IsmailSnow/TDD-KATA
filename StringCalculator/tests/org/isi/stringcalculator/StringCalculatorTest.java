package org.isi.stringcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {


    @Test
    public void sumsEmptyStringIsZero(){
        //given
        String given = "";
        int expected = 0;
        //when
        int result = StringCalculator.sum(given);
        //then
        assertEquals(expected,result);
    }

    @Test
    public void sumsSingleNumberIsItselef(){
        //given
        String given = "5";
        int expected = 5;
        //when
        int result = StringCalculator.sum(given);
        //then
        assertEquals(expected,result);
    }


    @Test
    public void sumsNumberSepartedbyComma(){
        //given
        String given = "1,2,3";
        int expected = 6;
        //when
        int result = StringCalculator.sum(given);
        //then
        assertEquals(expected,result);
    }

    @Test
    public void sumsTwoNumberSepartedbyComma(){
        //given
        String given = "10,30";
        int expected = 40;
        //when
        int result = StringCalculator.sum(given);
        //then
        assertEquals(expected,result);
    }
}