package ru.senla.test.palindrome_word;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("input your word: ");
		Scanner input = new Scanner(System.in);
		String myWord = input.next();
		PalindromeDetector palindromeResult = new PalindromeDetector();
		System.out.println(palindromeResult.detectPalindrome(myWord));

	}

}
