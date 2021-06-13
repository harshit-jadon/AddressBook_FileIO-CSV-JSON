package com.bridgelabz.addressbook.controller;

import com.bridgelabz.addressbook.services.IMultiOperations;
import com.bridgelabz.addressbook.services.MultiOperations;

import java.util.Scanner;

public class MultiAddressMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
        Scanner scanner = new Scanner(System.in);
        IMultiOperations multiOperations = new MultiOperations();
        int response;
        do{
            scanner.nextLine();
            System.out.println("PRESS 1 (for ADD New Address Book)");
            System.out.println("PRESS 2 (for SHOW All Address Book)");
            System.out.println("PRESS 3 (for OPEN Address Book)");
            System.out.println("PRESS 9 (for EXIT Address Book)");
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
                default:
                    break;
            }
        }while(response !=9);

    }

}
