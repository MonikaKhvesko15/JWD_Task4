package com.epam.task4.logic;

import com.epam.task4.entity.Array;

public class BinarySearch {
    public int binarySearch(Array array, int elementToSearch) {
        int arr[] = array.getArray();
        int firstIndex = 0;
        int lastIndex = arr.length - 1;

        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (arr[middleIndex] == elementToSearch) {
                return arr[middleIndex];
            } else if (arr[middleIndex] < elementToSearch)
                firstIndex = middleIndex + 1;

            else if (arr[middleIndex] > elementToSearch)
                lastIndex = middleIndex - 1;

        }
       return -1;
    }
}
