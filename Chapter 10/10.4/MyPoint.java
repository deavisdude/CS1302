/*
 * Davis Odom
 * 8/25/15
 * Stores a point using the Point2D class set up for floats
 * the book conveniently doesn't ask for any special features
 */

import java.awt.geom.Point2D;

public class MyPoint extends Point2D.Float{

	public MyPoint(float x, float y) {
		super(x,y);
	}

	public MyPoint() {
		super();
	}

}
