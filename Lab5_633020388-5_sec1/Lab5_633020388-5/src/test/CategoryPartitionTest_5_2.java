package test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import main.ShippingPackage;

class CategoryPartitionTest_5_2 {

	
	ShippingPackage Package = new ShippingPackage();
	
	@ParameterizedTest
	@ValueSource(strings = {"1,1,1,-1","1,1,5,-1","1,1,6,2","1,1,7,2"})
	void TS01(String input) {
		String[] text = input.split(",");
		int smallSize = Integer.parseInt(text[0]);
		int largeSize = Integer.parseInt(text[1]);
		int total = Integer.parseInt(text[2]);
		int expected = Integer.parseInt(text[3]);
		int result = Package.calculate(smallSize, largeSize, total);
		assertEquals(expected, result);
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"0,1,1,1","1,0,5,1","1,1,0,-1","4,0,4,4"})
	void TS02(String input) {
		String[] text = input.split(",");
		int smallSize = Integer.parseInt(text[0]);
		int largeSize = Integer.parseInt(text[1]);
		int total = Integer.parseInt(text[2]);
		int expected = Integer.parseInt(text[3]);
		int result = Package.calculate(smallSize, largeSize, total);
		assertEquals(expected, result);
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"-1,1,1,-1", "1,-1,5,-1","1,1,-6,-1"})
	void TS03(String input) {
		String[] text = input.split(",");
		int smallSize = Integer.parseInt(text[0]);
		int largeSize = Integer.parseInt(text[1]);
		int total = Integer.parseInt(text[2]);
		int expected = Integer.parseInt(text[3]);
		int result = Package.calculate(smallSize, largeSize, total);
		assertEquals(expected, result);
	}
	
}



