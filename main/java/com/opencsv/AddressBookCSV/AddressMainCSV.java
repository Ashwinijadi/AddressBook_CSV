package com.opencsv.AddressBookCSV;

import com.opencsv.CSVReader;
import com.opencsv.bean.*;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import java.util.List;

public class AddressMainCSV {
	private static final String CSV_FILE = "/Users/Dell/Documents/eclipse-workspace/AddressBookCSV/src/main/java/AddressBookCSV.csv";

	public static void main(String[] args) throws Exception {
		AddressMainCSV addressmainCSV = new AddressMainCSV();
		try {
			addressmainCSV.writeCSVData();
			addressmainCSV.readCSVData();
		} catch (IOException e) {
			System.out.println("Exception is - " + e);
		}
	}

	public void writeCSVData() throws IOException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException {
		try (Writer writer = Files.newBufferedWriter(Paths.get(CSV_FILE));) {
			StatefulBeanToCsvBuilder<Contacts> builder = new StatefulBeanToCsvBuilder<>(writer);
			StatefulBeanToCsv<Contacts> beanWriter = builder.build();
			List<Contacts> contacts = new ArrayList<>();
			contacts.add(new Contacts("Ashwini", "Jadi", "kukatpally", "Hyderabad", "TS", 965531635, "aish@gmail.com",
					541652));
			contacts.add(new Contacts("sweety", "Jadi", "DSK", "Hyd", "TS", 986004509, "sweety@gmail.com", 545216));

			beanWriter.write(contacts);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void readCSVData() throws Exception {
		try (Reader reader = Files.newBufferedReader(Paths.get(CSV_FILE));
				CSVReader csvReader = new CSVReader(reader);) {
			String[] nextRecord;
			while ((nextRecord = csvReader.readNext()) != null) {
				System.out.println("Address - " + nextRecord[0]);
				System.out.println("city - " + nextRecord[1]);
				System.out.println("Email - " + nextRecord[2]);
				System.out.println("firstName - " + nextRecord[3]);
				System.out.println("lastName- " + nextRecord[4]);
				System.out.println("Phone - " + nextRecord[5]);
				System.out.println("State - " + nextRecord[6]);
				System.out.println("Zip - " + nextRecord[7]);
			}
		}
	}
}
