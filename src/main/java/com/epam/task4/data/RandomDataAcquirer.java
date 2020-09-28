package com.epam.task4.data;

import com.epam.task4.entity.Array;

public class RandomDataAcquirer implements DataAcquirer {
    @Override
    public Array getIntArray() {
        int size = (int) (Math.random() * 9) + 1;
        Array array = new Array(size);

        for (int i = 0; i < size; i++) {
            array.getArray()[i] = (int) (Math.random() * 9) + 1;
        }

        return array;
    }
}
