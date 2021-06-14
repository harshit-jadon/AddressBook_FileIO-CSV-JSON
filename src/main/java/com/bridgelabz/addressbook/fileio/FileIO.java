package com.bridgelabz.addressbook.fileio;

import com.bridgelabz.addressbook.entity.Person;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileIO {
    public static String ADDRESS_BOOK_FILE_NAME = "C:\\Users\\harshit.jadon\\IdeaProjects\\Address Book FileIO,CSV,JSON";
    public void writeTextFile(List<Person> personList, String fileName){
        StringBuffer contBuffer = new StringBuffer();
        personList.forEach(cont ->{
            String contactDataString = cont.toString().concat("\n");
            contBuffer.append(contactDataString);
        });
        try{
            Files.write(Paths.get(ADDRESS_BOOK_FILE_NAME),contBuffer.toString().getBytes());
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
