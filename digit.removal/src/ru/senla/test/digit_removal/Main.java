package ru.senla.test.digit_removal;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("input your text here: ");
		Scanner input = new Scanner(System.in);
		String myText = input.nextLine();
		DigitRemover cleanText = new DigitRemover();
		System.out.println("Your clean text is:");
		System.out.println(cleanText.removeDigit(myText));
	}

}
