package com.epam.task4.view;

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
