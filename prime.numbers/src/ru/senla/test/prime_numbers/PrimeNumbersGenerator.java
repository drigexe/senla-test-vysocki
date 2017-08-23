package ru.senla.test.prime_numbers;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbersGenerator {

	public List<Integer> generate(int n) {
		List<Integer> primeNumbers = new ArrayList<Integer>();
		// true - prime number
		boolean[] primeNumbersPositions = new boolean[n + 1];
		for (int i = 0; i <= n; i++) {
			primeNumbersPositions[i] = true;
		}
		// 0 and 1 are not prime numbers
		primeNumbersPositions[0] = false;
		primeNumbersPositions[1] = false;
		for (int i = 2; i < primeNumbersPositions.length; i++) {
			if (primeNumbersPositions[i] == true) {
				for (int p = 2; i * p < primeNumbersPositions.length; p++) {
					primeNumbersPositions[i * p] = false;
				}
			}
		}
		// cycle to get printable list of primes
		for (int i = 0; i < primeNumbersPositions.length; i++) {
			if (primeNumbersPositions[i] == true) {
				primeNumbers.add(i);
			}

		}
		return primeNumbers;

	}

}
