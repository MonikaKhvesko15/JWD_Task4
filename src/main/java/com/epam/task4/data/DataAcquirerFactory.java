package com.epam.task4.data;

public class DataAcquirerFactory implements AcquirerFactory{

    public static final String FILE_INPUT_TXT = "C:\\Users\\HP\\Documents\\JWD_Task4\\target\\classes\\input.txt";

    @Override
    public DataAcquirer createAcquirer(InputType inputType) {
        switch (inputType) {
            case CONSOLE:
                return new ConsoleDataAcquirer();
            case FILE:
                return new FileDataAcquirer(FILE_INPUT_TXT);
            case RANDOM:
                return new RandomDataAcquirer();
            default:
                throw new IllegalArgumentException("Unknown input type " + inputType);
        }
    }
}
