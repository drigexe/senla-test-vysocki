package ru.senla.test.palindrome_word;

public class PalindromeDetector {

	public boolean detectPalindrome(String myWord) {
		int charactersNumber = myWord.length();
		for (int i = 0; i < (charactersNumber / 2); ++i) {
			if (myWord.charAt(i) != myWord.charAt(charactersNumber - i - 1)) {
				return false;
			}
		}
		return true;
	}

}
