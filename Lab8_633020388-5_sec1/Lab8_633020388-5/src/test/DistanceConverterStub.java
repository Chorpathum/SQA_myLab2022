package test;

import main.DistanceConverter;

public class DistanceConverterStub extends DistanceConverter{
	@Override
	public double getMultiplier(String fromUnit, String toUnit) {
		return 1000.0;
	}
}
