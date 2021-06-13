package com.bridgelabz.addressbook.services;

import com.bridgelabz.addressbook.entity.Person;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Operations implements IOperations{
    Scanner scanner = new Scanner(System.in);
//    ArrayList<Person> contacts = new ArrayList<>();

    @Override
    public void addContact(List<Person> contacts) {
        Person person = new Person();
        System.out.println("First Name");
        person.setFirst_name(scanner.nextLine());
        System.out.println("Last Name");
        person.setLast_name(scanner.nextLine());
        System.out.println("Address");
        person.setAddress(scanner.nextLine());
        System.out.println("City");
        person.setCity(scanner.nextLine());
        System.out.println("State");
        person.setState(scanner.nextLine());
        System.out.println("Zip");
        person.setZip(scanner.nextLine());
        System.out.println("Phone Number");
        person.setPhone_number(scanner.nextLine());
        System.out.println("Email");
        person.setEmail(scanner.nextLine());
        contacts.add(person);
    }
    @Override
        public void displayContact(List<Person> contacts){
        for(int i= 0; i< contacts.size(); i++){
            System.out.println(contacts.get(0).toString());
        }
    }
    @Override
    public void editContact(String first_name, String last_name,List<Person> contacts) {
        System.out.println("Enter First Name");
        String editNa = scanner.nextLine();
        System.out.println("Enter Last Name");
        String editLa = scanner.nextLine();
        System.out.println("Enter City");
        String editCi = scanner.nextLine();
        System.out.println("Enter State");
        String editSt = scanner.nextLine();
        System.out.println("Enter Pin Code");
        String editPi = scanner.nextLine();
        System.out.println("Enter Phone Number");
        String editMo = scanner.nextLine();
        System.out.println("Enter Email");
        String editEm = scanner.nextLine();
        int flag = 0;
        for(Person contact: contacts){
            if (contact.getFirst_name().equalsIgnoreCase(first_name) && contact.getLast_name().equalsIgnoreCase(last_name)) {
                flag = 1;
                contact.setFirst_name(editNa);
                contact.setLast_name(editLa);
                contact.setCity(editCi);
                contact.setState(editSt);
                contact.setZip(editPi);
                contact.setPhone_number(editMo);
                contact.setEmail(editEm);
                break;
            }
        }
        if(flag == 1)
            System.out.println("Contact updated successfully");
        else
            System.out.println("Contact Not found");
    }
    @Override
    public void deleteContact(String first_name, String last_name,List<Person> contacts) {
        int flag = 0;
        for (Person contact : contacts) {
            if (contact.getFirst_name().equalsIgnoreCase(first_name) && contact.getLast_name().equalsIgnoreCase(last_name)) {
                flag = 1;
                contacts.remove(contact);
                break;
            }
        }
        if(flag == 1)
            System.out.println("Contact deleted successfully");
        else
            System.out.println("Contact Not found");

    }


}
