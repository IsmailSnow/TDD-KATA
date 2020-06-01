package org.isi.caracterinstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CharacterInStringTest {

    @Test
    public void shouldReturnZeroIfEmpty(){
        //given
        char given ='b';
        CharacterInString counter = new CharacterInString("");
        int excepted = 0;
        //when
        int result = counter.counter(given);
        //then
        assertEquals(excepted,result);
    }

    @Test
    public void shouldReturnOneIfOne(){
        //given
        char given = 'a';
        CharacterInString counter = new CharacterInString("a");
        int excepted = 1;
        //when
        int result = counter.counter(given);
        //then
        assertEquals(excepted,result);
    }

    @Test
    public void shouldReturnTwoIfTwo(){
        //given
        char given ='A';
        CharacterInString counter = new CharacterInString("AA");
        int excepted = 2;
        //when
        int result = counter.counter(given);
        //then
        assertEquals(excepted,result);
    }
}