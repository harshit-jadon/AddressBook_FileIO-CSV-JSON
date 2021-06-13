package com.bridgelabz.addressbook.services;

import com.bridgelabz.addressbook.controller.PersonMain;
import com.bridgelabz.addressbook.entity.Person;

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
}
