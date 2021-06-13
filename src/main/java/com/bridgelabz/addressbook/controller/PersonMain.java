package com.bridgelabz.addressbook.controller;

import com.bridgelabz.addressbook.entity.Person;
import com.bridgelabz.addressbook.services.IOperations;
import com.bridgelabz.addressbook.services.Operations;

import java.util.List;
import java.util.Scanner;

public class PersonMain {
//    public static void main(String[] args) {
//        System.out.println("Welcome to Address Book");
    public void operationsMethod(List<Person> contacts){
        Scanner scanner = new Scanner(System.in);
        IOperations operations = new Operations();
        int response;
        do{
            System.out.println("PRESS 1 (FOR ADD CONTACT)");
            System.out.println("PRESS 2 (FOR DISPLAY CONTACT)");
            System.out.println("PRESS 3 (FOR EDIT CONTACT)");
            System.out.println("PRESS 4 (FOR DELETE CONTACT)");
            System.out.println("PRESS 5 (FOR NUMBER OF PERSON in that CITY)");
            System.out.println("PRESS (FOR NUMBER OF PERSON in that STATE)");


            System.out.println("PRESS 9 (FOR EXIT CONTACT)");
            response = scanner.nextInt();
            switch(response){
                case 1:
                    operations.addContact(contacts);
                    operations.displayContact(contacts);
                    break;
                case 2:
                    operations.displayContact(contacts);
                    break;
                case 3:
                    System.out.println("Enter First Name");
                    String editN = scanner.next();
                    System.out.println("Enter last name");
                    String editL = scanner.next();
                    operations.editContact(editN,editL,contacts);
                    break;
                case 4:
                    System.out.println("Enter First Name");
                    String deleteN = scanner.next();
                    System.out.println("Enter Last Name");
                    String deleteL = scanner.next();
                    operations.deleteContact(deleteN,deleteL,contacts);
                    break;
                case 5:
                    System.out.println("Enter City name");
                    String noOfPersonInCity = scanner.next();
                    operations.noOfPersonInCityy(contacts, noOfPersonInCity);
                    break;
                case 6:
                    System.out.println("Enter State name");
                    String noOfPersonInState = scanner.next();
                    operations.noOfPersonInStatee(contacts, noOfPersonInState);
                    break;
                default:
                    break;
            }
        }while(response !=9);
    }
}