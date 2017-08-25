package ru.senla.test.lcm_and_gcd;

public class LcmCalculator {
	public int lcmCalculate(int firstNumber, int secondNumber) {
		GcdCalculator gcdNumberForLcmCalculation = new GcdCalculator();
		return firstNumber / gcdNumberForLcmCalculation.gcdCalculate(firstNumber, secondNumber) * secondNumber;
	}

}
