package com.valuelabs.JUnitTesting;

public class MathApplication implements CalculatorService {

	private CalculatorService calcService;
	
	public void setCalculatorService(CalculatorService calcService) {
		this.calcService = calcService;
	}
	
	@Override
	public double add(double input1, double input2) {
		return calcService.add(input1, input2);
	}

	@Override
	public double subtract(double input1, double input2) {
		return calcService.subtract(input1, input2);
	}

	@Override
	public double multiply(double input1, double input2) {
		return calcService.multiply(input1, input2);
	}

	@Override
	public double divide(double input1, double input2) {
		return calcService.divide(input1, input2);
	}

}
