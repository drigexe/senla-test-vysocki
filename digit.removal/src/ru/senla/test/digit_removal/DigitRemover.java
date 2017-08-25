package ru.senla.test.digit_removal;

public class DigitRemover {
	public String removeDigit(String myText) {
		return myText.replaceAll("\\d", "");
	}

}
