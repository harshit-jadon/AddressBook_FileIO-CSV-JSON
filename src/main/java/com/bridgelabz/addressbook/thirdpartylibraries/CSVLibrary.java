package com.bridgelabz.addressbook.thirdpartylibraries;

import com.bridgelabz.addressbook.entity.Person;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvValidationException;

public class CSVLibrary {
    public static String ADDRESS_BOOK_FILE_NAME = "C:\\Users\\harshit.jadon\\Desktop";
    public void writeCSV(List<Person> personList, String fileName) throws IOException,
            CsvDataTypeMismatchException,
             CsvRequiredFieldEmptyException {
        try
                (
                        Writer writer = Files.newBufferedWriter(Paths.get(ADDRESS_BOOK_FILE_NAME + fileName + ".csv"));
                ) {
            StatefulBeanToCsv<Person> beanToCsv = new StatefulBeanToCsvBuilder<Person>(writer)
                    .withQuotechar(CSVWriter.NO_QUOTE_CHARACTER)
                    .build();
            beanToCsv.write(personList);
        }
    }

    public void readFromCSV(String fileName) {
        try {
            CSVReader csvReader = new CSVReader(new FileReader(ADDRESS_BOOK_FILE_NAME + fileName + ".csv"));
            String[] nextRecord;
            while ((nextRecord = csvReader.readNext()) != null) {
                System.out.println("FirstName : " + nextRecord[0]);
                System.out.println("LastName : " + nextRecord[1]);
                System.out.println("City : " + nextRecord[2]);
                System.out.println("State : " + nextRecord[3]);
                System.out.println("PinCode: " + nextRecord[4]);
                System.out.println("MobileNo : " + nextRecord[5]);
                System.out.println("Email : " + nextRecord[6]);
                System.out.println("*************");

            }
        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
    }

}

