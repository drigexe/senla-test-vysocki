package ru.senla.test.segments_intersection;

public class TwoDimensionalCoordinate {
	private int xCoordinate;
	private int yCoordinate;
	
	public TwoDimensionalCoordinate(int xCoordinate, int yCoordinate){
		this.setX(xCoordinate);
		this.setY(yCoordinate);
	}

	public int getX() {
		return this.xCoordinate;
	}

	public int getY() {
		return this.yCoordinate;
	}

	public void setX(int xCoordinate) {
		this.xCoordinate = xCoordinate;
	}

	public void setY(int yCoordinate) {
		this.yCoordinate = yCoordinate;
	}

}
