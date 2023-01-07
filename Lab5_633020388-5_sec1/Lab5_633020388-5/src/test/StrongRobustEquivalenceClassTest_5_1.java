package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import main.Commission;

class StrongRobustEquivalenceClassTest_5_1 {

	Commission commission = new Commission();
	
	@ParameterizedTest
	@ValueSource(strings = {"-1,-1,-1,0", "-1,-1,1,0", "-1,-1,45,0", "-1,-1,91,0",
			"-1,1,-1,0", "-1,1,1,0", "-1,1,45,0", "-1,1,91,0",
			"-1,40,-1,0", "-1,40,1,0", "-1,40,45,0", "-1,40,91,0",
			"-1,81,-1,0", "-1,81,1,0", "-1,81,45,0", "-1,81,91,0"})
	void TS01(String input) {
		String[] text = input.split(",");
		int lock = Integer.parseInt(text[0]);
		int stock = Integer.parseInt(text[1]);
		int barrel = Integer.parseInt(text[2]);
		double expected = Integer.parseInt(text[3]);
		Double result = commission.checkCommission(lock, stock, barrel);
		assertEquals(expected, result);
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"1,-1,-1,0", "1,-1,1,0", "1,-1,45,0", "1,-1,91,0",
			"1,1,-1,0", "1,1,1,1000", "1,1,45,20500", "1,1,91,43500",
			"1,40,-1,0", "1,40,1,21900", "1,40,45,43900", "1,40,91,66900",
			"1,81,-1,0", "1,81,1,46500", "1,81,45,68500", "1,81,91,91500"})
	void TS02(String input) {
		String[] text = input.split(",");
		int lock = Integer.parseInt(text[0]);
		int stock = Integer.parseInt(text[1]);
		int barrel = Integer.parseInt(text[2]);
		double expected = Integer.parseInt(text[3]);
		Double result = commission.checkCommission(lock, stock, barrel);
		assertEquals(expected, result);
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"35,-1,-1,0", "35,-1,1,0", "35,-1,45,0", "35,-1,91,0",
			"35,1,-1,0", "35,1,1,29100", "35,1,45,51100", "35,1,91,74100",
			"35,40,-1,0", "35,40,1,52500", "35,40,45,74500", "35,40,91,97500",
			"35,81,-1,0", "35,81,1,77100", "35,81,45,99100", "35,81,91,122100"})
	void TS03(String input) {
		String[] text = input.split(",");
		int lock = Integer.parseInt(text[0]);
		int stock = Integer.parseInt(text[1]);
		int barrel = Integer.parseInt(text[2]);
		double expected = Integer.parseInt(text[3]);
		Double result = commission.checkCommission(lock, stock, barrel);
		assertEquals(expected, result);
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"71,-1,-1,0", "71,-1,1,0", "71,-1,45,0", "71,-1,91,0",
			"71,1,-1,0", "71,1,1,61500", "71,1,45,83500", "71,1,91,106500",
			"71,40,-1,0", "71,40,1,84900", "71,40,45,106900", "71,40,91,129900",
			"71,81,-1,0", "71,81,1,109500", "71,81,45,131500", "71,81,91,154500"})
	void TS04(String input) {
		String[] text = input.split(",");
		int lock = Integer.parseInt(text[0]);
		int stock = Integer.parseInt(text[1]);
		int barrel = Integer.parseInt(text[2]);
		double expected = Integer.parseInt(text[3]);
		Double result = commission.checkCommission(lock, stock, barrel);
		assertEquals(expected, result);
	}
	
	
	
	

}
