package com.javapowertools.taxcalculator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String jvm = System.getProperty("java.version");
        String osName = System.getProperty("os.name"); 
        String osVersion = System.getProperty("os.version"); 
        
        System.out.println("Running Java " + jvm 
                           + " on " + osName
                           + " (version " + osVersion + ")");

	}

}
