package com.york.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.york.model.Country;

@Component
public class Code {
	private List<String> interestList=new ArrayList<String>();
	private List<String> sexOptions=new ArrayList<String>();
	private List<Country> countryList=new ArrayList<Country>();
	private List<String> skills=new ArrayList<String>();
	
	public Code(){
		interestList.add("Hocky");
		interestList.add("Swimming");
		interestList.add("Tennis");
		interestList.add("Basketball");
		interestList.add("Socker");

		sexOptions.add("M");
		sexOptions.add("F");

		skills.add("Java");
		skills.add("C++");
		skills.add("SQL");
		skills.add("Oracle");
		skills.add("Tomcat");
	
		countryList.add(new Country("CN", "China"));
		countryList.add(new Country("CA", "Canada"));
		countryList.add(new Country("JP", "Japan"));
		countryList.add(new Country("US", "USA"));
		countryList.add(new Country("KR", "KOREA"));
	}

	public List<String> getInterestList() {
		return interestList;
	}

	public void setInterestList(List<String> interestList) {
		this.interestList = interestList;
	}

	public List<String> getSexOptions() {
		return sexOptions;
	}

	public void setSexOptions(List<String> sexOptions) {
		this.sexOptions = sexOptions;
	}

	public List<Country> getCountryList() {
		return countryList;
	}

	public void setCountryList(List<Country> countryList) {
		this.countryList = countryList;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	
}
