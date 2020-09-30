package com.epam.task4.data;

public class DataException extends Exception {
    public DataException(String message, Exception e) {

        super(message, e);
    }
}