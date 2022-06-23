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

public class RegionReader implements IReadable {
	
	@Override
	public  Set<GeographicalArea> dataReader(String filename) {
		
		
		
		Set<GeographicalArea> regionSet = new HashSet();
		
		File file = new File(filename);
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
			
			try {
				while((line = br.readLine())!= null) {
					List<String> arr = Arrays.asList(line.split(","));
					
					Region reg = new Region();
					
					reg.setId(Integer.parseInt(arr.get(0)));
					reg.setRegion(arr.get(1).replace("\'", ""));
					
					regionSet.add(reg);
				
					
//					System.out.println(reg);
				}
			} catch (IOException e) {
				System.out.println("Error");
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Error here");
			e.printStackTrace();
		}
//		System.out.println(regionSet);
		return regionSet;
		
	}

}
