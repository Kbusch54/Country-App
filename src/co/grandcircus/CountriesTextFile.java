 package co.grandcircus;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Collection;
import co.grandcircus.Country;

public class CountriesTextFile {
	
	
	public static void readFromFile() {
		String fileName = "countries.txt";
		Path path = Paths.get("country", fileName);
		
		File file = path.toFile();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			String line = br.readLine();
			
			while(line !=null) {
				System.out.println(line);
				line = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
		
			System.out.println("Something happened with the file");
		} catch (IOException e) {
			
			System.out.println("Something happened when attempting to read the file");
		}
		
	}
	

	public static void writeToFile(ArrayList<Country> countryList) {
		String fileName = "countries.txt";

		Path path = Paths.get("country", fileName);

		File file = path.toFile();
		PrintWriter output = null;

		try {
			output = new PrintWriter(new FileOutputStream(file, true));
			output.println(countryList);
		} catch (FileNotFoundException e) {
			// e.printStackTrace();
			System.out.println("Hey, contact customer service");

		} finally {
			output.close();
		}

	}

	public static void createOurFile() {
		String fileName = "countries.txt";

		Path path = Paths.get("country", fileName);

		if (Files.notExists(path)) {

			try {
				Files.createFile(path);
				System.out.println("The file was created succesfully!");
			} catch (IOException e) {

				// e.printStackTrace();

				System.out.println("Oops something went terribly worng!");
			}
		} else {
			System.out.println("The file already exists");
		}

	}

	public static void createDir() {
		String dirPath = "country";

		Path folder = Paths.get(dirPath);

		if (Files.notExists(folder)) {

			try {
				Files.createDirectories(folder);
				System.out.println("The file was created succesfully");
			} catch (IOException e) {

				// e.printStackTrace();
				System.out.println("Something went wrong with the folder creation");
			}

		} else {
			System.out.println("The folder already exists");
		}
	}
	public static ArrayList<Country> readFromFile(String fileName) {
		ArrayList<Country> countryList = new ArrayList<>();
		Path path = Paths.get("country.txt", fileName);

		File file = path.toFile();

		try {
			BufferedReader br = new BufferedReader(new FileReader(file));

			String line = br.readLine();

			while (line != null) {
				// 1.
				String[] countryValues = line.split(",");
				// 2.
				Country a = new Country(countryValues[0], 
						Integer.parseInt(countryValues[1]));
				// 3.
				countryList.add(a);
				line = br.readLine();
			}
			br.close();

		} catch (FileNotFoundException e) {
			System.out.println("Something happened with the file...");
		} catch (IOException e) {
			System.out.println("Something happened when attempting to read from the file...");
		}
		return countryList;
	}

}
