package org.isi.binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    public void searchingForKeyNotInArrayIsMinusOne() {
        assertEquals(-1, findIndexOf(1,new int[]{0}));
    }

    @Test
    public void searchingForKeyPresentInArrayLengthOneIsZero(){
        assertEquals(0, findIndexOf(1, new int[]{1}));
    }

    @Test
    public void searchForKeyThatIsMidpointOfArrayArrayLengthThreeIsOne(){
        assertEquals(1,findIndexOf(2,new int[]{1,2,3}));
    }

    @Test
    public void searchForKeyThatisMidpointofUpperHalfofArrayLengthThreeisTwo(){
        assertEquals(2,findIndexOf(3,new int[]{1,2,3}));
    }

    @Test
    public void searchForKeyThatIsMidpointofLowerHalfOfArrayLengthThreeIsZero(){
        assertEquals(0,findIndexOf(1,new int[]{1,2,3}));
    }


    private int findIndexOf(int key, int[] array) {
        return new BinarySearch().findIndexOf(key, array);
    }
}