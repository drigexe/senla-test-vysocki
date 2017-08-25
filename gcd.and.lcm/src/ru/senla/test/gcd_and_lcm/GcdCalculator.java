package ru.senla.test.gcd_and_lcm;

public class GcdCalculator {
	public int gcdCalculate(int firstNumber, int secondNumber) {
		if (secondNumber == 0) {
			return firstNumber;
		} else {
			return gcdCalculate(secondNumber, firstNumber % secondNumber);
		}
	}

}
