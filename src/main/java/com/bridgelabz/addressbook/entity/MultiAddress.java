package com.bridgelabz.addressbook.entity;

import java.util.ArrayList;
import java.util.List;

public class MultiAddress {
    List<Person> contacts = new ArrayList<>();

    public List<Person> getContacts() {
        return contacts;
    }

    public void setContacts(List<Person> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "MultiAddress{" +
                "contacts=" + contacts +
                '}';
    }
}
