package com.epam.task4.data;

import com.epam.task4.entity.Array;

import java.util.Scanner;

public class ConsoleDataAcquirer implements DataAcquirer {
    private static final int SIZE = 10;

    @Override
    public Array getIntArray() {
        Array array = new Array(SIZE);
        System.out.print("Enter " + SIZE + " array elements : \n>> ");
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < SIZE; i++) {
            while (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.print(">> ");
            }
            array.getArray()[i] = sc.nextInt();
        }
        return array;
    }
}
