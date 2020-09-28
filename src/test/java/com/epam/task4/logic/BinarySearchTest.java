package com.epam.task4.logic;

import com.epam.task4.entity.Array;
import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {
    @Test
    public void shouldCorrectSearchElementOfArray() {
        //given
        BinarySearch binarySearch = new BinarySearch();
        Array array = new Array(new int[]{1, 2, 3, 4, 5});
        int findElem = 3;

        //when
        int actual = binarySearch.binarySearch(array, findElem);
        //then
        Assert.assertEquals(findElem, actual);
    }
}
