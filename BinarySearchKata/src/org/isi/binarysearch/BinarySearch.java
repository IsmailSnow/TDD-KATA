package org.isi.binarysearch;

public class BinarySearch {

    public int findIndexOf(int key, int[] array){
        int low =0;
        int high =array.length-1;
        while (low<=high){
            int midPoint = (low + high)/2 ;
            if(key == array[midPoint]){
                return midPoint;
            }
            if(key > array[midPoint]){
                low = midPoint +1;
            }
            if(key < array[midPoint]){
                high = midPoint -1;
            }
        }

        return -1;
    }

}
