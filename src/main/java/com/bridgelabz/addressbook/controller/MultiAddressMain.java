package com.bridgelabz.addressbook.controller;

import com.bridgelabz.addressbook.services.IMultiOperations;
import com.bridgelabz.addressbook.services.MultiOperations;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.IOException;
import java.util.Scanner;

public class MultiAddressMain {
    public static void main(String[] args) throws IOException, CsvRequiredFieldEmptyException, CsvDataTypeMismatchException {
        System.out.println("Welcome to Address Book");
        Scanner scanner = new Scanner(System.in);
        IMultiOperations multiOperations = new MultiOperations();
        int response;
        do{
            System.out.println("PRESS 1 (for ADD New Address Book)");
            System.out.println("PRESS 2 (for SHOW All Address Book)");
            System.out.println("PRESS 3 (for OPEN Address Book)");
            System.out.println("PRESS 4 (for SEARCH CONTACT by CITY in Address Book)");
            System.out.println("PRESS 5 (for SEARCH CONTACT by STATE in Address Book)");
            System.out.println("PRESS 6 (for WRITE TEXT FILE)");
            System.out.println("PRESS 7 (for READ TEXT FILE)");
            System.out.println("PRESS 8 (for WRITE CSV FILE)");
            System.out.println("PRESS 9 (for READ CSV FILE)");
            System.out.println("PRESS 10 (for READ JSON FILE)");
            System.out.println("PRESS 11 (for WRITE JSON FILE)");
            System.out.println("PRESS 12 (for EXIT Address Book)");
            response = scanner.nextInt();
            switch (response){
                case 1:
                    System.out.println("Enter Address Book Name");
                    String addressBookName = scanner.next();
                    multiOperations.newAddressBook(addressBookName);
                    break;
                case 2:
                    System.out.println("Current Available Address Book");
                    multiOperations.showAllAddressBook();
                    break;
                case 3:
                    System.out.println("Available Address Book for Open");
                    multiOperations.showAllAddressBook();
                    System.out.println("Enter name of Address Book to Open");
                    String openAddressBook = scanner.next();
                    multiOperations.openAddressBook(openAddressBook);
                    break;
                case 4:
                    System.out.println("Enter City to search");
                    String city = scanner.next();
                    multiOperations.searchCity(city);
                    break;
                case 5:
                    System.out.println("Enter State to search");
                    String state = scanner.next();
                    multiOperations.searchState(state);
                    break;
                case 6:
                    System.out.println("Enter AddressBook");
                    String writeFile = scanner.next();
                    System.out.println("Enter Name of Text File");
                    String textFile = scanner.next();
                    multiOperations.writeTextFile(writeFile,textFile);
                    break;
                case 7:
                    System.out.println("Enter File Name to Read");
                    String readFile = scanner.next();
                    multiOperations.readTextFile(readFile);
                    break;
                case 8:
                    System.out.println("Enter AddressBook");
                    String writeCSV = scanner.next();
                    System.out.println("Enter Name of CSV File");
                    String csvFile = scanner.next();
                    multiOperations.writeCSV(writeCSV,csvFile);
                    break;
                case 9:
                    System.out.println("Enter File Name to Read");
                    String readCSV = scanner.next();
                    multiOperations.readFromCSV(readCSV);
                    break;
                case 10:
                    System.out.println("Enter Address Book Name ");
                    String writeJson = scanner.next();
                    System.out.println("Enter file to write");
                    String writeJFile = scanner.next();
                    multiOperations.writeJSOn(writeJson,writeJFile);
                    break;
                case 11:
                    System.out.println("enter file name");
                    String readJson = scanner.next();
                    multiOperations.readJSON(readJson);
                    break;

                default:
                    break;
            }
        }while(response !=12);

    }

}
