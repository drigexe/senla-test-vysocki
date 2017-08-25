package ru.senla.fibonacci_numbers;

import java.util.ArrayList;
import java.util.List;

public class FibonacciNumbersGenerator {

	public List<Integer> generate(int n) {
		List<Integer> fibonacciNumbers = new ArrayList<Integer>();
		// Fibonacci numbers begin from 1
		fibonacciNumbers.add(1);
		int firstFibonacciNumber = 1;
		int secondFibonacciNumber = 1;
		int currentFibonacci = 1;
		for (int i = 2; i <= n; i++) {
			firstFibonacciNumber = secondFibonacciNumber;
			secondFibonacciNumber = currentFibonacci;
			currentFibonacci = firstFibonacciNumber + secondFibonacciNumber;
			fibonacciNumbers.add(currentFibonacci);

		}
		return fibonacciNumbers;
	}

}
