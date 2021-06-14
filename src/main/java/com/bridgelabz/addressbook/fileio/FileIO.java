package com.bridgelabz.addressbook.fileio;

import com.bridgelabz.addressbook.entity.Person;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

import static java.nio.file.Files.readAllLines;

public class FileIO {
    public static String ADDRESS_BOOK_FILE_NAME = "C:\\Users\\harshit.jadon\\Desktop";
    public void writeTextFile(List<Person> personList, String fileName){
        StringBuffer contBuffer = new StringBuffer();
        personList.forEach(cont ->{
            String contactDataString = cont.toString().concat("\n");
            contBuffer.append(contactDataString);
        });
        try{
            Files.write(Paths.get(ADDRESS_BOOK_FILE_NAME+ fileName + ".txt"),contBuffer.toString().getBytes());
        } catch(IOException e){
            e.printStackTrace();
        }
    }
    public void readTextFile(String fileName){
        List<String> readFile = Collections.emptyList();
        try{
            readFile= readAllLines(Paths.get(ADDRESS_BOOK_FILE_NAME + fileName + ".txt"), StandardCharsets.UTF_8);
        } catch (IOException e){
            e.printStackTrace();
        }
        readFile.forEach((System.out::println));
    }
}
