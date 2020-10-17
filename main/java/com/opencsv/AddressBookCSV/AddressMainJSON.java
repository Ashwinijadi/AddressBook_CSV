package com.opencsv.AddressBookCSV;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.google.gson.Gson;

public class AddressMainJSON {
	private static final String JSON_FILE = "/Users/Dell/Documents/eclipse-workspace/AddressBookCSV/src/main/java/AddressBookJSON.json";

	public static void main(String[] args) throws Exception {
		AddressMainJSON addressmainJSON = new AddressMainJSON();
	
			addressmainJSON.writeDataJson();
			addressmainJSON.readDataJson();
		
	}

	// reading data
	private void readDataJson() throws IOException {
		List<Contacts> personsList = new ArrayList<Contacts>();
		try {
			Reader reader = Files.newBufferedReader(Paths.get(JSON_FILE));
			System.out.println(personsList.addAll(Arrays.asList(new Gson().fromJson(reader, Contacts[].class))));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// writing data into file
	private void writeDataJson() throws IOException {
		Writer writer = Files.newBufferedWriter(Paths.get(JSON_FILE));
		List<Contacts> contacts = new ArrayList<>();
		contacts.add(new Contacts("Ashwini", "Jadi", "kukatpally", "Hyderabad", "TS", 965531635, "aish@gmail.com", 541652));
		contacts.add(new Contacts("sweety", "Jadi", "DSK", "Hyd", "TS", 986004509, "sweety@gmail.com", 545216));
		new Gson().toJson(contacts, writer);
		writer.close();
	}

}
