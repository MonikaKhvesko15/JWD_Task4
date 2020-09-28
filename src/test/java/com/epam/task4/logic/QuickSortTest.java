package com.epam.task4.logic;

import com.epam.task4.entity.Array;
import org.junit.Test;

import java.util.Arrays;

public class QuickSortTest {
    @Test
    public void shouldCorrectSortArray(){
        //given
        QuickSort quickSort=new QuickSort();
        Array array=new Array(new int[]{5,1,7,4,8,3},5);
        int[] correctResult=new int[]{1,3,4,5,7,8};

        //when
        quickSort.sort(array.getArray(), 0,array.getArray().length-1);

        //then
        Arrays.equals(correctResult,array.getArray());

    }

}
