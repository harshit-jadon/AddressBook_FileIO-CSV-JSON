package com.bridgelabz.addressbook.services;

import com.bridgelabz.addressbook.controller.PersonMain;
import com.bridgelabz.addressbook.entity.Person;
import com.bridgelabz.addressbook.thirdpartylibraries.CSVLibrary;
import com.bridgelabz.addressbook.thirdpartylibraries.FileIO;
import com.bridgelabz.addressbook.thirdpartylibraries.JSONLibrary;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultiOperations implements IMultiOperations{
    HashMap<String, List<Person>> addressBook = new HashMap<>();

    @Override
    public void newAddressBook(String name) {
        addressBook.put(name, new ArrayList<>());
    }
    @Override
    public void showAllAddressBook() {
        for(Map.Entry<String, List<Person>> show : addressBook.entrySet()){
            System.out.println(show.getKey());
        }
    }
    @Override
    public void openAddressBook(String name) {
        PersonMain personMain = new PersonMain();
        personMain.operationsMethod(addressBook.get(name));
    }

    @Override
    public void searchCity(String city) {
        for(Map.Entry<String, List<Person>> searchCity : addressBook.entrySet()){
            List<Person> contacts = addressBook.get(searchCity.getKey());
            contacts.stream().filter(n -> n.getCity().equalsIgnoreCase(city)).forEach(System.out::println);
        }
    }
    @Override
    public void searchState(String state) {
        for(Map.Entry<String, List<Person>> searchState : addressBook.entrySet()){
            List<Person> contacts = addressBook.get(searchState.getKey());
            contacts.stream().filter(n -> n.getCity().equalsIgnoreCase(state)).forEach(System.out::println);
        }
    }
    @Override
    public void writeTextFile(String name, String fileName) {
        FileIO fileIO = new FileIO();
        fileIO.writeTextFile(addressBook.get(name),fileName);
    }

    @Override
    public void readTextFile(String fileName) {
        FileIO fileIO = new FileIO();
        fileIO.readTextFile(fileName);
    }

    @Override
    public void writeCSV(String name, String fileName) throws IOException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException {
        CSVLibrary csvLibrary = new CSVLibrary();
        csvLibrary.writeCSV(addressBook.get(name),fileName);
    }

    @Override
    public void readFromCSV(String fileName) {
        CSVLibrary csvLibrary = new CSVLibrary();
        csvLibrary.readFromCSV(fileName);
    }

    @Override
    public void writeJSOn(String name, String fileName) throws IOException {
        JSONLibrary jsonLibrary = new JSONLibrary();
        jsonLibrary.writeJSOn((addressBook.get(name)),fileName);
    }

    @Override
    public void readJSON(String fileName) throws FileNotFoundException {
        JSONLibrary jsonLibrary = new JSONLibrary();
        jsonLibrary.readJSON(fileName);
    }

}
