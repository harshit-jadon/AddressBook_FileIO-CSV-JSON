package com.bridgelabz.addressbook.services;

public interface IMultiOperations {
    void newAddressBook(String name);

    void showAllAddressBook();

    void openAddressBook(String name);


    void searchCity(String city);

    void searchState(String state);
}
