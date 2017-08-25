package ru.senla.test.gcd_and_lcm;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		PrintWriter output = new PrintWriter(System.out);
		int firstNumber = input.nextInt();
		int secondNumber = input.nextInt();
		GcdCalculator gcdCalculatedNumber = new GcdCalculator();
		output.println(gcdCalculatedNumber.gcdCalculate(firstNumber, secondNumber));
		// output.println(мой метод lcm с входными параметрами);
		input.close();
		output.close();

	}

}
