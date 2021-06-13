package com.bridgelabz.addressbook.services;


import com.bridgelabz.addressbook.entity.Person;

import java.util.List;

public interface IOperations {
    void addContact();

    void displayContact();

    void editContact(String first_name, String last_name);

    void deleteContact(String first_name, String last_name);


}
