package com.bridgelabz.addressbook.thirdpartylibraries;

import com.bridgelabz.addressbook.entity.Person;
import com.google.gson.Gson;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class JSONLibrary {
    public static  String File_PATH = "C:\\Users\\harshit.jadon\\Desktop";
    public void writeJSOn(List<Person> personList, String fileName) throws IOException{
        Path filePath = Paths.get(File_PATH + fileName + ".json");
        Gson gson = new Gson();
        String json = gson.toJson(personList);
        FileWriter writer = new FileWriter(String.valueOf(filePath));
        writer.write(json);
        writer.close();
    }

    public void readJSON(String fileName) throws FileNotFoundException {
        Gson gson = new Gson();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(File_PATH + fileName + ".json"));
        Person[] contacts = gson.fromJson(bufferedReader, Person[].class);
        List<Person> contactList = Arrays.asList(contacts);
        for (Person contact : contactList) {
            System.out.println(contact.getFirst_name());
            System.out.println(contact.getLast_name());
            System.out.println(contact.getAddress());
            System.out.println(contact.getCity());
            System.out.println(contact.getState());
            System.out.println(contact.getZip());
            System.out.println(contact.getPhone_number());
            System.out.println(contact.getEmail());
        }
    }

}
