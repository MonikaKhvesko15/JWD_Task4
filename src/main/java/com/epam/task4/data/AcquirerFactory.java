package com.epam.task4.data;

public interface AcquirerFactory {
    DataAcquirer createAcquirer(InputType inputType);
}
