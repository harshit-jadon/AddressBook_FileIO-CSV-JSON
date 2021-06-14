package com.bridgelabz.addressbook.services;

import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.IOException;

public interface IMultiOperations {
    void newAddressBook(String name);

    void showAllAddressBook();

    void openAddressBook(String name);

    void searchCity(String city);

    void searchState(String state);

    void writeTextFile(String name, String fileName);

    void readTextFile(String fileName);

    void writeCSV(String name, String fileName) throws IOException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException;

    void readFromCSV(String fileName);
}
