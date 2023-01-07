package test;

import main.UniversalConverter;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Distance
		double originalValue1 = 10.0;
		double convertedValue1 = 0.0;	//results of the universal converter
		String selectedChoice1 = "Distance";
		String fromUnit1 = "kilometer";
		String toUnit1 = "meter";
		
		UniversalConverter converter1 = new UniversalConverter();
		
		convertedValue1 = converter1.convert(originalValue1, selectedChoice1, fromUnit1, toUnit1);
		System.out.println(originalValue1 + " " + fromUnit1 + " = " + convertedValue1 + " " + toUnit1);
		
		//Temperature
		double originalValue2 = 1.0;
		double convertedValue2 = 0.0;	//results of the universal converter
		String selectedChoice2 = "Temperature";
		String fromUnit2 = "C";
		String toUnit2 = "F";
		
		UniversalConverter converter2 = new UniversalConverter();
		
		convertedValue2 = converter2.convert(originalValue2, selectedChoice2, fromUnit2, toUnit2);
		System.out.println(originalValue2 + " " + fromUnit2 + " = " + convertedValue2 + " " + toUnit2);
		
		//Weight
		double originalValue3 = 20.0;
		double convertedValue3 = 0.0;	//results of the universal converter
		String selectedChoice3 = "Weight";
		String fromUnit3 = "kilogram";
		String toUnit3 = "gram";
				
		UniversalConverter converter3 = new UniversalConverter();
				
		convertedValue3 = converter3.convert(originalValue3, selectedChoice3, fromUnit3, toUnit3);
		System.out.println(originalValue3 + " " + fromUnit3 + " = " + convertedValue3 + " " + toUnit3);
				
				

	}

}
