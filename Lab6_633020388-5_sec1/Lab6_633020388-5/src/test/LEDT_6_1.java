package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import main.TVPlan;
import main.TVPlan.TVPackage;

class LEDT_6_1 {

	
	
	@ParameterizedTest
	@ValueSource(strings = {"true,true,true,550","true,true,false,600","true,false,true,350","false,true,true,400",
			"true,false,false,400","false,true,false,450","false,false,true,200","false,false,false,250"})
	void testScenario1(String input) {
		String[] text = input.split(",");
		TVPackage pack = TVPackage.BASIC;
		boolean family_sharing = Boolean.parseBoolean(text[0]);
		boolean intlregion = Boolean.parseBoolean(text[1]);
		boolean discount = Boolean.parseBoolean(text[2]);
		int expected = Integer.parseInt(text[3]);
		TVPlan TVplan = new TVPlan(family_sharing,intlregion,discount);
		double result = TVplan.pricePerMonth(pack);
		assertEquals(expected, result);
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"true,true,true,650","true,true,false,700","true,false,true,450","false,true,true,500",
			"true,false,false,500","false,true,false,550","false,false,true,300","false,false,false,350"})
	void testScenario2(String input) {
		String[] text = input.split(",");
		TVPackage pack = TVPackage.STANDARD;
		boolean family_sharing = Boolean.parseBoolean(text[0]);
		boolean intlregion = Boolean.parseBoolean(text[1]);
		boolean discount = Boolean.parseBoolean(text[2]);
		int expected = Integer.parseInt(text[3]);
		TVPlan TVplan = new TVPlan(family_sharing,intlregion,discount);
		double result = TVplan.pricePerMonth(pack);
		assertEquals(expected, result);
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"true,true,true,750","true,true,false,800","true,false,true,550","false,true,true,600",
			"true,false,false,600","false,true,false,650","false,false,true,400","false,false,false,450"})
	void testScenario3(String input) {
		String[] text = input.split(",");
		TVPackage pack = TVPackage.PREMIUM;
		boolean family_sharing = Boolean.parseBoolean(text[0]);
		boolean intlregion = Boolean.parseBoolean(text[1]);
		boolean discount = Boolean.parseBoolean(text[2]);
		int expected = Integer.parseInt(text[3]);
		TVPlan TVplan = new TVPlan(family_sharing,intlregion,discount);
		double result = TVplan.pricePerMonth(pack);
		assertEquals(expected, result);
	}
}

