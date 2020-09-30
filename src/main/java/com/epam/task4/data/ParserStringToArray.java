package com.epam.task4.data;

import com.epam.task4.entity.Array;

import java.util.Arrays;

public class ParserStringToArray {

    public int[] parse(String line) {
        String[] lines = line.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split(",");

        int[] numbers = new int[lines.length];
        for (int i = 0; i < lines.length; i++) {
            numbers[i] = Integer.parseInt(lines[i]);
        }
        return numbers;
    }
}
