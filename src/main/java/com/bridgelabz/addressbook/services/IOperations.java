package com.bridgelabz.addressbook.services;


public interface IOperations {
    void addContact();

    void displayContact();

    void editContact(String first_name, String last_name);

    void deleteContact(String first_name, String last_name);


}
