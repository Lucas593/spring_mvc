package model;

import java.util.LinkedHashMap;

public class Student {

	//Refactor: No Student somente foi organizado os getters e setters para melhor leitura.
	
	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String, String> countryOptions;
	private String favoriteLanguage;
	private String[] operationSystems;

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String[] getOperationSystems() {
		System.out.println(operationSystems);
		return operationSystems;
	}

	public void setOperationSystems(String[] operationSystems) {
		System.out.println(operationSystems.toString());
		this.operationSystems = operationSystems;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Student() {
		countryOptions = new LinkedHashMap<String, String>();

		countryOptions.put("BR", "Brazil");
		countryOptions.put("GE", "Germany");
		countryOptions.put("FR", "France");
		countryOptions.put("IN", "India");

	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

}
