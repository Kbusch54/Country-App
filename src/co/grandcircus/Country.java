package co.grandcircus;

import java.util.ArrayList;

import java.util.Collection;
public class Country {
	private static String name;
	private Integer population;
	public static String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPopulation() {
		return population;
	}
	public void setPopulation(Integer population) {
		this.population = population;
	}
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Country(String name, Integer population) {
		super();
		this.name = name;
		this.population = population;
	}
	@Override
	public String toString() {
		return name + " (pop " +population;
	}
	public static void addCountry(String s,int population,ArrayList<Country> a) {
		a.add(new Country(s, population));
		
	}
	public static int getPop() {
		// TODO Auto-generated method stub
		return 0;
	}

}
