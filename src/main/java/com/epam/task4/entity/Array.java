package com.epam.task4.entity;

import java.util.Arrays;
import java.util.Objects;

public class Array {
    private int size;
    private int[] array;

    public Array() {
        array = new int[size];
    }

    public Array(int size) {
        this.size = size;
        array = new int[size];
    }

    public Array(int[] array) {
        this.array = array.clone();
        this.size = array.length;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return this.size;
    }

    public void setArray(int[] array) {
        this.array = array.clone();
    }

    public int[] getArray() {
        return this.array;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Array array1 = (Array) o;
        return size == array1.size &&
                Arrays.equals(array, array1.array);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(size);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }

    @Override
    public String toString() {
        return "Array{" +
                "size=" + size +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}
