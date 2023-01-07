package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class testWithStub {

	@Test
	void testDistanceConverter() {
		DistanceConverterStub Dstub = new DistanceConverterStub();
		double expectedResult = 1000.0;
		assertEquals(expectedResult, Dstub.convert(1, "kilometer", "meter"));
	}

	@Test
	void testTemperatureConverter() {
		TemperatureConverterStub Tstub = new TemperatureConverterStub();
		double expectedResult = 33.8;
		assertEquals(expectedResult, Tstub.convert(1, "C", "F"));
	}
	
	@Test
	void testWeightConverter() {
		WeightConverterStub Wstub = new WeightConverterStub();
		double expectedResult = 1000.0;
		assertEquals(expectedResult, Wstub.convert(1, "kilogram", "gram"));
	}

}
