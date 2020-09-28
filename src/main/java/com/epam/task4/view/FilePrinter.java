package com.epam.task4.view;

import com.epam.task4.entity.Array;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FilePrinter implements PrintResult{

    public static final String FILE_OUTPUT_TXT = "output.txt";

    @Override
    public void print(Array array) throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_OUTPUT_TXT));
        writer.write(Arrays.toString(array.getArray()));

        writer.close();
    }
}
