package com.aurionpro.model.test;

import java.util.Set;

import com.aurionpro.model.Country;
import com.aurionpro.model.CountryReader;
import com.aurionpro.model.GeographicalArea;
import com.aurionpro.model.IReadable;
import com.aurionpro.model.Region;
import com.aurionpro.model.RegionReader;

public class ReadTestClass {

	public static void main(String[] args) {

		IReadable region = new RegionReader();
		Set<GeographicalArea> regionMainSet = (Set<GeographicalArea>) region.dataReader("./Resource/region.txt");

		IReadable country = new CountryReader();
		Set<GeographicalArea> countryMainSet = country.dataReader("./Resource/country.txt");

		System.out.println(regionMainSet);
		
//		for(Set<GeographicalArea> x : Set<Region> regionMainSet) {
//			
//			
//			System.out.println();
//		}
//		

	}

}
