package ru.senla.test.segments_intersection;

public class TwoDimensionalLineService {
	
	public boolean checkIfTwoLinesIntersect(TwoDimensionalLine firstLine, TwoDimensionalLine secondLine){
		// Returns 1 if the lines intersect, otherwise 0. In addition, if the lines 
		// intersect the intersection point may be stored in the floats i_x and i_y.
		//char get_line_intersection(float p0_x, float p0_y, float p1_x, float p1_y, 
		//    float p2_x, float p2_y, float p3_x, float p3_y, float *i_x, float *i_y)
		{
			double sumVectorBeginningCoordinateX = firstLine.getEndingCoordinate().getX() - firstLine.getBeginningCoordinate().getX();
			double sumVectorBeginningCoordinateY = firstLine.getEndingCoordinate().getY() - firstLine.getBeginningCoordinate().getY();
			double sumVectorEndingCoordinateX = secondLine.getEndingCoordinate().getX() - secondLine.getBeginningCoordinate().getX();
			double sumVectorEndingCoordinateY = secondLine.getEndingCoordinate().getY() - secondLine.getBeginningCoordinate().getY();
			
			TwoDimensionalCoordinate sumVectorBeginningCoordinate = new TwoDimensionalCoordinate(sumVectorBeginningCoordinateX, sumVectorBeginningCoordinateY);
			TwoDimensionalCoordinate sumVectorEndingCoordinate = new TwoDimensionalCoordinate(sumVectorEndingCoordinateX, sumVectorBeginningCoordinateY);
	

		    float s, t;
		    s = (-s1_y * (p0_x - p2_x) + s1_x * (p0_y - p2_y)) / (-s2_x * s1_y + s1_x * s2_y);
		    t = ( s2_x * (p0_y - p2_y) - s2_y * (p0_x - p2_x)) / (-s2_x * s1_y + s1_x * s2_y);

		    if (s >= 0 && s <= 1 && t >= 0 && t <= 1)
		    {
		        // Collision detected
		        if (i_x != NULL)
		            *i_x = p0_x + (t * s1_x);
		        if (i_y != NULL)
		            *i_y = p0_y + (t * s1_y);
		        return 1;
		    }

		    return 0; // No collision
		}
	}

}
