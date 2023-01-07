package test;

import main.WeightConverter;

public class WeightConverterStub extends WeightConverter{
	@Override
	public double getMultiplier(String fromUnit, String toUnit) {
		return 1000.0;
	}

}
