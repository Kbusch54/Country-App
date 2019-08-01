package co.grandcircus;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import co.grandcircus.Country;



public class CountriesApp {

	public static void main(String[] args) {
		CountriesTextFile.createDir();
		CountriesTextFile.createOurFile();
		
		
		
		Scanner scan = new Scanner(System.in);
		boolean cont = true;
		ArrayList<Country> countryList = new ArrayList<>();
		while(cont) {
		System.out.println("Welcome to the Countries Maintence Application!");
		menu();
		int choice = scan.nextInt();
		scan.nextLine();
		if(choice ==1) {
		System.out.println("1 - See a list of Countries");
		// list from countriesTextFile
		CountriesTextFile.readFromFile();
		}else if (choice ==2) {
		System.out.println("2 - Add Country");
		
		//Add country to country java
		//add method to add
		String userCountry = Country.getName();
		int userPop = Country.getPop();
		System.out.println("Country name: ");
		userCountry = scan.nextLine();
		System.out.println("Population: ");
		userPop = scan.nextInt();

		Country.addCountry(userCountry, userPop, countryList);
		
		CountriesTextFile.writeToFile(countryList);
		System.out.println(countryList);
		}else if(choice==3) {
		System.out.println("3 - Exit");
		cont =false;
		//exit loop
		}else {
			System.out.println("Something went wrong please type in a number 1 - 3");
		}
		}
		
		
		System.out.println("Thank you for listing with us");
		scan.close();
	}
	
	public static void menu() {
		System.out.println("1 - See a list of Countries");
		System.out.println("2 - Add Country");
		System.out.println("3 - Exit");

	}
	public static void choice(Scanner scan, int userNum) {
		if(userNum==1) {
			System.out.println("1 - See a list of Countries");
		}else if (userNum == 2){
			System.out.println("2 - Add Country");
			
		}
	}
	

}
