package ru.senla.test.segments_intersection;

public class TwoDimensionalLine {

	private TwoDimensionalCoordinate beginningCoordinate;
	private TwoDimensionalCoordinate endingCoordinate;

	public TwoDimensionalLine(TwoDimensionalCoordinate beginningCoordinate, TwoDimensionalCoordinate endingCoordinate) {
		this.setBeginningCoordinate(beginningCoordinate);
		this.setEndingCoordinate(endingCoordinate);
	}

	public TwoDimensionalCoordinate getBeginningCoordinate() {
		return this.beginningCoordinate;
	}

	public TwoDimensionalCoordinate getEndingCoordinate() {
		return this.endingCoordinate;
	}

	public void setBeginningCoordinate(TwoDimensionalCoordinate beginningCoordinate) {
		this.beginningCoordinate = beginningCoordinate;
	}

	public void setEndingCoordinate(TwoDimensionalCoordinate endingCoordinate) {
		this.endingCoordinate = endingCoordinate;
	}

}
