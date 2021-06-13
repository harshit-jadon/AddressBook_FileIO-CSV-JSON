package com.bridgelabz.addressbook.controller;

import com.bridgelabz.addressbook.entity.Person;
import com.bridgelabz.addressbook.services.IOperations;
import com.bridgelabz.addressbook.services.Operations;

import java.util.Scanner;

public class PersonMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
        Scanner scanner = new Scanner(System.in);
        IOperations operations = new Operations();
        int response = 0;
        do{
            System.out.println("PRESS 1 (FOR ADD CONTACT)");
            System.out.println("PRESS 2 (FOR DISPLAY CONTACT)");
            System.out.println("PRESS 3 (FOR EDIT CONTACT)");
            System.out.println("PRESS 4 (FOR DELETE CONTACT)");
            System.out.println("PRESS 9 (FOR EXIT CONTACT)");
            response = scanner.nextInt();
            switch(response){
                case 1:
                    operations.addContact();
                    operations.displayContact();
                    break;
                case 2:
                    operations.displayContact();
                    break;
                case 3:
                    System.out.println("Enter First Name");
                    String editN = scanner.next();
                    System.out.println("Enter last name");
                    String editL = scanner.next();
                    operations.editContact(editN,editL);
                    break;
                case 4:
                    System.out.println("Enter First Name");
                    String deleteN = scanner.next();
                    System.out.println("Enter Last Name");
                    String deleteL = scanner.next();
                    operations.deleteContact(deleteN,deleteL);
                    break;
                default:
                    break;
            }
        }while(response !=9);
    }
}
