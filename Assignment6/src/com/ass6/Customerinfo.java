package com.ass6;

import java.util.HashMap;
import java.util.Map;

public class Customerinfo {
	
	public static void main(String[] args) {
		
	    String[] customers = {"Customer1", "Customer2", "Customer3", "Customer4", "Customer5"};
        String[] districts = {"DistrictA", "DistrictB", "DistrictA", "DistrictB", "DistrictC"};
        
        Map<String, Integer> districtCustomerCount = new HashMap<>();

     
        for (int i = 0; i < customers.length; i++) {
            String district = districts[i];
            districtCustomerCount.put(district, districtCustomerCount.getOrDefault(district, 0) + 1);
        }

       
        for (Map.Entry<String, Integer> entry : districtCustomerCount.entrySet()) {
            System.out.println("District: " + entry.getKey() + ", Customer Count: " + entry.getValue());
        }
        String[] customer = {"Customer1", "Customer2", "Customer3", "Customer4", "Customer5"};
        String[] district = {"DistrictA", "Districtc", "Districtc", "DistrictB", "DistrictC"};
        String[] state =    {"stateA", "stateB", "stateA", "stateB", "stateC"};
        
        Map<String, Integer> stateCustomerCount = new HashMap<>();
        
        
           
        for (int i = 0; i < customers.length; i++) {
            String states = state[i];
           stateCustomerCount.put(states, stateCustomerCount.getOrDefault( states, 0)+ 1);

        }

       
        for (Map.Entry<String, Integer> entry : stateCustomerCount.entrySet()) {
            System.out.println("state: " + entry.getKey() + ", Customer Count: " + entry.getValue());
        }
        String[] Customer = {"Customer1", "Customer2", "Customer3", "Customer4", "Customer5"};
        String[] District = {"DistrictA", "DistrictB", "DistrictA", "DistrictB", "DistrictC"};
        String[] State =    {"stateA", "stateB", "stateA", "stateB", "stateC"};
        String[] Country = {"countryA", "countryB","countryA","countryB","countryC"};
        
        
        Map<String, Integer> countryCustomerCount = new HashMap<>();
        
        
        for (int i = 0; i < customers.length; i++) {
            String country = Country[i];
           countryCustomerCount.put(country,countryCustomerCount.getOrDefault(country,0)+ 1);
        }


        for (Map.Entry<String, Integer> entry : countryCustomerCount.entrySet()) {
            System.out.println("country: " + entry.getKey() + ", Customer Count: " + entry.getValue());
        }
        
}
}

