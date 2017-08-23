package ru.senla.test.prime_numbers;

import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("input your number:");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		PrimeNumbersGenerator myPrimeGenerator = new PrimeNumbersGenerator();
		List<Integer> myPrimeList = myPrimeGenerator.generate(n);
		System.out.println(myPrimeList.toString());
	}

}
