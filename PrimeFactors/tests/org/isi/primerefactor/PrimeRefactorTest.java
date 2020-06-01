package org.isi.primerefactor;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeRefactorTest {

    @Test
    public void resultOf1IsNone() {
        //given
        int given = 1;
        //when
        List<Integer> result = PrimeRefactor.of(1);
        List<Integer> expected = Collections.unmodifiableList(Arrays.asList());
        //then
        assertEquals(expected, result);
    }

    @Test
    public void resultOf2Is2() {
        //given
        int given = 2;
        //when
        List<Integer> result = PrimeRefactor.of(given);
        List<Integer> expected = Collections.unmodifiableList(Arrays.asList(2));
        //then
        assertEquals(expected, result);
    }

    @Test
    public void resultOf3Is3() {
        //given
        int given = 3;
        //when
        List<Integer> result = PrimeRefactor.of(given);
        List<Integer> expected = Collections.unmodifiableList(Arrays.asList(3));
        //then
        assertEquals(expected, result);
    }

    @Test
    public void resultOf4IsTwo2() {
        //given
        int given = 4;
        //when
        List<Integer> result = PrimeRefactor.of(given);
        List<Integer> expected = Collections.unmodifiableList(Arrays.asList(2,2));
        //then
        assertEquals(expected, result);
    }

    @Test
    public void resultOf6Is2_3() {
        //given
        int given = 6;
        //when
        List<Integer> result = PrimeRefactor.of(given);
        List<Integer> expected = Collections.unmodifiableList(Arrays.asList(2,3));
        //then
        assertEquals(expected, result);
    }

    @Test
    public void resultOf6Is2_2_2() {
        //given
        int given = 8;
        //when
        List<Integer> result = PrimeRefactor.of(given);
        List<Integer> expected = Collections.unmodifiableList(Arrays.asList(2,2,2));
        //then
        assertEquals(expected, result);
    }

    @Test
    public void resultOf6Is3_3_3() {
        //given
        int given = 9;
        //when
        List<Integer> result = PrimeRefactor.of(given);
        List<Integer> expected = Collections.unmodifiableList(Arrays.asList(3,3));
        //then
        assertEquals(expected, result);
    }

    @Test
    public void acceptanceTest() {
        //given
        int given = 7*2*2*3*2*2;
        //when
        List<Integer> result = PrimeRefactor.of(given);
        List<Integer> expected = Collections.unmodifiableList(Arrays.asList(2,2,2,2,3,7));
        //then
        assertEquals(expected, result);
    }






}