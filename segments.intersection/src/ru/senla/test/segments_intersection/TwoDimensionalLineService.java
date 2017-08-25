package ru.senla.test.segments_intersection;

public class TwoDimensionalLineService {
	private boolean isLineVertical(TwoDimensionalLine line) {
		return line.getBeginningCoordinate().getX() == line.getEndingCoordinate().getX();
	}

	private boolean ifTwoSegmentsOfVerticalLineOverlap(TwoDimensionalLine firstSegment,
			TwoDimensionalLine secondSegment) {
		return (firstSegment.getEndingCoordinate().getY() >= secondSegment.getBeginningCoordinate().getY()
				&& secondSegment.getEndingCoordinate().getY() >= firstSegment.getBeginningCoordinate().getY())
				|| (secondSegment.getEndingCoordinate().getY() >= firstSegment.getBeginningCoordinate().getY()
						&& firstSegment.getEndingCoordinate().getY() >= secondSegment.getBeginningCoordinate().getY());

	}

	public int checkIfTwoLinesIntersect(TwoDimensionalLine firstLine, TwoDimensionalLine secondLine) {
		{
			// 0 - not intersect, 1 - intersect, 2 - overlap
			int result = 0;
			if (this.isLineVertical(firstLine) && this.isLineVertical(firstLine)) {
				if ((firstLine.getBeginningCoordinate().getX() != secondLine.getBeginningCoordinate().getX())) {
					result = 0;
				} else {
					if (this.ifTwoSegmentsOfVerticalLineOverlap(firstLine, secondLine)) {
						result = 2;
					}
				}

			} else {
				// line equation: ax + by - c = 0
				double a1 = (firstLine.getEndingCoordinate().getY() - firstLine.getBeginningCoordinate().getY())
						/ (firstLine.getEndingCoordinate().getX() - firstLine.getBeginningCoordinate().getX());
				double b1 = firstLine.getBeginningCoordinate().getY() - a1 * firstLine.getBeginningCoordinate().getX();
				double a2 = (secondLine.getEndingCoordinate().getY() - secondLine.getBeginningCoordinate().getY())
						/ (secondLine.getEndingCoordinate().getX() - secondLine.getBeginningCoordinate().getX());
				double b2 = secondLine.getBeginningCoordinate().getY()
						- a1 * secondLine.getBeginningCoordinate().getX();
				if (a1 == a2) {
					result = 0;
					if (b1 == b2) {
						result = 2;
					}
				} else {

					int x1 = firstLine.getBeginningCoordinate().getX();
					int y1 = firstLine.getBeginningCoordinate().getY();
					int x2 = firstLine.getEndingCoordinate().getX();
					int y2 = firstLine.getEndingCoordinate().getY();
					int x3 = secondLine.getBeginningCoordinate().getX();
					int y3 = secondLine.getBeginningCoordinate().getY();
					int x4 = secondLine.getEndingCoordinate().getX();
					int y4 = secondLine.getEndingCoordinate().getY();
					// x coordinate of interception
					double x0 = ((x4 * y3 - y4 * x3) / (x4 - x3) - (x2 * y1 - y2 * x1) / (x2 - x1))
							/ ((y2 - y1) / (x2 - x1) - (y4 - y3) / (x4 - x3));

					if ((Math.min(firstLine.getBeginningCoordinate().getX(),
							firstLine.getEndingCoordinate().getX()) <= x0)
							&& (x0 <= Math.max(firstLine.getBeginningCoordinate().getX(),
									firstLine.getEndingCoordinate().getX()))
							&& (Math.min(secondLine.getBeginningCoordinate().getX(),
									secondLine.getEndingCoordinate().getX()) <= x0)
							&& (x0 <= Math.max(secondLine.getBeginningCoordinate().getX(),
									secondLine.getEndingCoordinate().getX()))) {
						result = 1;
					}
				}
			}
			return result;
		}
	}

}
