package com.epam.task4.data;

import com.epam.task4.entity.Array;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileDataAcquirer implements DataAcquirer {
    private String filename;

    //constructor
    public FileDataAcquirer(String filename) {
        this.filename = filename;
    }

    @Override
    public Array getIntArray() throws DataException {
        BufferedReader reader;
        ParserStringToArray parser = new ParserStringToArray();
        try {
            reader = new BufferedReader(new FileReader(filename));
            String line = reader.readLine();
            Array array = new Array(parser.parse(line));

            return array;

        } catch (IOException | NumberFormatException e) {
            throw new DataException(e.getMessage(), e);
        }
    }
}
