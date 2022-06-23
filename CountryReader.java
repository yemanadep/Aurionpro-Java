package com.aurionpro.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountryReader implements IReadable {
	
	@Override
	public Set<GeographicalArea> dataReader(String filename) {
		
		Set<GeographicalArea> countrySet = new HashSet();
		
		File file = new File(filename);
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
			
			try {
				while((line = br.readLine())!= null) {
					List<String> arr = Arrays.asList(line.split(","));
					
					Country country = new Country();
					
					country.setCountryCode(arr.get(0).replace("\'", ""));
					country.setName(arr.get(1).replace("\'", ""));
					country.setRegionId(Integer.parseInt(arr.get(2)));
				
					countrySet.add(country);

				}
			} catch (IOException e) {
				System.out.println("Error");
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Error here");
			e.printStackTrace();
		}
//		System.out.println(countrySet);
		return countrySet;
	}

}
