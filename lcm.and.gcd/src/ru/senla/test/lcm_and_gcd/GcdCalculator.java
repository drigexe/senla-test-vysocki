package ru.senla.test.lcm_and_gcd;

public class GcdCalculator {
	public int gcdCalculate(int firstNumber, int secondNumber) {
		if (secondNumber == 0) {
			return firstNumber;
		} else {
			return gcdCalculate(secondNumber, firstNumber % secondNumber);
		}
	}

}