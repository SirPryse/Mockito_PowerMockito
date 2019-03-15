package com.valuelabs.JUnitTesting;


public class Calculator implements CalculatorInterface
{
	
	@Override
	public int addcalc(int a ,int b) {
		return a+b;
	}

	@Override
	public int subcalc(int a,int b) {
		return a-b;
		
	}

	@Override
	public int dividecalc(int a,int b) {
		return a/b;
		
	}

	@Override
	public int multicalc(int a ,int b) {
		return a*b;
		
	}

	
}
