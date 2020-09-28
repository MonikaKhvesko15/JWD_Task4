package com.epam.task4.view;

import com.epam.task4.entity.Array;

import java.io.IOException;
import java.util.Arrays;

public class ConsolePrinter implements PrintResult{
    @Override
    public void print(Array array) throws IOException {
        System.out.println(Arrays.toString(array.getArray()));
    }
}
