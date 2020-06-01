package org.isi.romanconverter;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RomanConverterTest {

    @Test
    public void convert1ToI(){
        //Given
        int input = 1;
        String expected = "I";
        RomanConverter converter = new RomanConverter();
        //When
        String result = converter.convert(input);
        //then
        assertEquals(expected,result);
    }


    @Test
    public void convert2ToII(){
        //Given
        int input = 2;
        String expected = "II";
        RomanConverter converter = new RomanConverter();
        //When
        String result = converter.convert(input);
        //then
        assertEquals(expected,result);
    }

    @Test
    public void convert3ToIII(){
        //Given
        int input = 3;
        String expected = "III";
        RomanConverter converter = new RomanConverter();
        //When
        String result = converter.convert(input);
        //then
        assertEquals(expected,result);
    }


    @Test
    public void convert10ToX(){
        //Given
        int input = 10;
        String expected = "X";
        RomanConverter converter = new RomanConverter();
        //When
        String result = converter.convert(input);
        //then
        assertEquals(expected,result);
    }

    @Test
    public void convert20ToXX(){
        //Given
        int input = 20;
        String expected = "XX";
        RomanConverter converter = new RomanConverter();
        //When
        String result = converter.convert(input);
        //then
        assertEquals(expected,result);
    }

    @Test
    public void convert30ToX(){
        //Given
        int input = 30;
        String expected = "XXX";
        RomanConverter converter = new RomanConverter();
        //When
        String result = converter.convert(input);
        //then
        assertEquals(expected,result);
    }

    @Test
    public void convert11ToXI(){
        //Given
        int input = 11;
        String expected = "XI";
        RomanConverter converter = new RomanConverter();
        //When
        String result = converter.convert(input);
        //then
        assertEquals(expected,result);
    }


    @Test
    public void convert5ToV(){
        //Given
        int input = 5;
        String expected = "V";
        RomanConverter converter = new RomanConverter();
        //When
        String result = converter.convert(input);
        //then
        assertEquals(expected,result);
    }

    @Test
    public void convert4ToIV(){
        //Given
        int input = 4;
        String expected = "IV";
        RomanConverter converter = new RomanConverter();
        //When
        String result = converter.convert(input);
        //then
        assertEquals(expected,result);
    }


    @Test
    public void convert9ToIX(){
        //Given
        int input = 9;
        String expected = "IX";
        RomanConverter converter = new RomanConverter();
        //When
        String result = converter.convert(input);
        //then
        assertEquals(expected,result);
    }

    @Test
    public void convert40ToXL(){
        //Given
        int input = 40;
        String expected = "XL";
        RomanConverter converter = new RomanConverter();
        //When
        String result = converter.convert(input);
        //then
        assertEquals(expected,result);
    }






}