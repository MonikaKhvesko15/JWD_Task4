package com.epam.task4;

import com.epam.task4.data.*;
import com.epam.task4.entity.Array;
import com.epam.task4.logic.BinarySearch;
import com.epam.task4.logic.QuickSort;
import com.epam.task4.view.OutputType;
import com.epam.task4.view.PrintFactory;
import com.epam.task4.view.PrintResult;
import com.epam.task4.view.PrintResultFactory;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws DataException, IOException {
        //create array
        AcquirerFactory acquirerFactory = new DataAcquirerFactory();
        DataAcquirer dataAcquirer = acquirerFactory.createAcquirer(InputType.FILE);//CONSOLE, RANDOM
        Array array = dataAcquirer.getIntArray();

        //logic
        QuickSort quickSort = new QuickSort();
        quickSort.sort(array.getArray(), 0, array.getSize() - 1);

        BinarySearch search = new BinarySearch();
        int findElem = 5;
        search.binarySearch(array, findElem);


        //show result
        PrintFactory factory = new PrintResultFactory();

        PrintResult printer = factory.createPrinter(OutputType.FILE);
        printer.print(array);

        PrintResult printer1 = factory.createPrinter(OutputType.CONSOLE);
        printer1.print(array);


    }
}
