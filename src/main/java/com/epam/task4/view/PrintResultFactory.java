package com.epam.task4.view;

import com.epam.task4.data.ConsoleDataAcquirer;
import com.epam.task4.data.FileDataAcquirer;
import com.epam.task4.entity.Array;

public class PrintResultFactory implements PrintFactory {

    @Override
    public PrintResult createPrinter(OutputType outputType) {
        switch (outputType) {
            case CONSOLE:
                return new ConsolePrinter();
            case FILE:
                return new FilePrinter();
            default:
                throw new IllegalArgumentException("Unknown input type " + outputType);
        }
    }
}
