package ru.senla.fibonacci_numbers;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("input your number:");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		FibonacciNumbersGenerator myFibonacciGenerator = new FibonacciNumbersGenerator();
		List<Integer> myFibonacciList = myFibonacciGenerator.generate(n);
		System.out.println(myFibonacciList.toString());
	}

}
