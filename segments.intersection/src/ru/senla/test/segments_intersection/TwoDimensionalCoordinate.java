package ru.senla.test.segments_intersection;

public class TwoDimensionalCoordinate {
	private double xCoordinate;
	private double yCoordinate;
	
	public TwoDimensionalCoordinate(double xCoordinate, double yCoordinate){
		this.setX(xCoordinate);
		this.setY(yCoordinate);
	}

	public double getX() {
		return this.xCoordinate;
	}

	public double getY() {
		return this.yCoordinate;
	}

	public void setX(double xCoordinate) {
		this.xCoordinate = xCoordinate;
	}

	public void setY(double yCoordinate) {
		this.yCoordinate = yCoordinate;
	}

}
