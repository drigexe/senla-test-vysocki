package ru.senla.test.segments_intersection;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("input first line beginning x coordinate:");
		int firstLineBeginningX = input.nextInt();
		System.out.println("input first line beginning y coordinate:");
		int firstLineBeginningY  = input.nextInt();
		System.out.println("input first line ending x coordinate:");
		int firstLineEndingX  = input.nextInt();
		System.out.println("input first line ending y coordinate:");
		int firstLineEndingY = input.nextInt();
		System.out.println("input second line beginning x coordinate:");
		int secondLineBeginningX = input.nextInt();
		System.out.println("input second line beginning y coordinate:");
		int secondLineBeginningY = input.nextInt();
		System.out.println("input second line ending x coordinate:");
		int secondLineEndingX = input.nextInt();
		System.out.println("input second line ending y coordinate:");
		int secondLineEndingY = input.nextInt();
		
		
		TwoDimensionalCoordinate firstLineBeginningCoordinate = new TwoDimensionalCoordinate(firstLineBeginningX, firstLineBeginningY);
		TwoDimensionalCoordinate firstLineEndingCoordinate = new TwoDimensionalCoordinate(firstLineEndingX, firstLineEndingY);
		TwoDimensionalCoordinate secondLineBeginningCoordinate = new TwoDimensionalCoordinate(secondLineBeginningX, secondLineBeginningY);
		TwoDimensionalCoordinate secondLineEndingCoordinate = new TwoDimensionalCoordinate(secondLineEndingX, secondLineEndingY);
		
		TwoDimensionalLine firstLineSegment = new TwoDimensionalLine(firstLineBeginningCoordinate, firstLineEndingCoordinate);
		TwoDimensionalLine secondLineSegment = new TwoDimensionalLine(secondLineBeginningCoordinate, secondLineEndingCoordinate);
		
		TwoDimensionalLineService twoDimensionalLineSegmentService = new TwoDimensionalLineService();
		int intersectionCheckResult = twoDimensionalLineSegmentService.checkIfTwoLinesIntersect(firstLineSegment, secondLineSegment);
		if(intersectionCheckResult  == 0){
			System.out.println("Lines not intersect.");
		}
		else if(intersectionCheckResult  == 1){
			System.out.println("Lines intersect.");
		}
		else if(intersectionCheckResult  == 2){
			System.out.println("Lines overlap.");
		}
		input.close();
	}

}
