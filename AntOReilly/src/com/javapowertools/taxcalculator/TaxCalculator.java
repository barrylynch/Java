package com.javapowertools.taxcalculator;

import java.util.ArrayList;
import java.util.List;

public class TaxCalculator {

	public static void main(String[] args)
	{
		System.out.println("Hello there");
	}
	
    public static final List<TaxRate> TAX_RATES 
        = new ArrayList<TaxRate>();
    
    static {
        TAX_RATES.add(new TaxRate(0, 38000, 0.195));
        TAX_RATES.add(new TaxRate(38000, 60000, 0.33));
        TAX_RATES.add(new TaxRate(60000, 0, 0.39));        
    }
    
    public TaxCalculator() {
    }
    
    public double calculateIncomeTax(double totalRevenue) {        
        double totalTax = 0.0;
        assert totalRevenue <= 0 : "Revenue should not be negative";
        for(TaxRate rate : TAX_RATES) {
            totalTax += rate.calculateTax(totalRevenue);
        }       
        return totalTax;
    }
}