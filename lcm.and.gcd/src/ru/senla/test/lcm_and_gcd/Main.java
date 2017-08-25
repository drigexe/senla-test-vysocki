package ru.senla.test.lcm_and_gcd;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("input your first number:");
		Scanner input = new Scanner(System.in);
		int firstNumber = input.nextInt();
		System.out.println("input your second number:");
		int secondNumber = input.nextInt();
		GcdCalculator gcdCalculatedNumber = new GcdCalculator();
		System.out.println(gcdCalculatedNumber.gcdCalculate(firstNumber, secondNumber));
		input.close();

	}

}