package test;

import main.TemperatureConverter;

public class TemperatureConverterStub extends TemperatureConverter{
	@Override
	public double convert(double tempValue, String fromUnit, String toUnit) {
		return 33.8;
		
	}

}
