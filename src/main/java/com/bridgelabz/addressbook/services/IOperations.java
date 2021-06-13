package com.bridgelabz.addressbook.services;


import com.bridgelabz.addressbook.entity.Person;

import java.util.List;

public interface IOperations {
    void addContact(List<Person> contacts);

    void displayContact(List<Person> contacts);

    void editContact(String first_name, String last_name,List<Person> contacts);

    void deleteContact(String first_name, String last_name,List<Person> contacts);



}
