package exercise3;

public class Exercise3 {
	static ConvexPolygon buildConvexPolygon(Point[] vertices) {
		// TODO build a ConvexPolygon
		return new ConvexPolygon(vertices);
	}

	static ConvexPolygon buildRectangle(Point upperLeft, Point lowerRight) {
		// TODO build a Rectangle
		return new Rectangle(upperLeft,lowerRight);
	}

	static ConvexPolygon buildSquare(Point upperLeft, int sideLength) {
		// TODO build a square
		return new Square(upperLeft,sideLength);
	}

	static Ellipsis buildEllipsis(Point center, int xAxisLength, int yAxisLength) {
		// TODO build an ellipsis
		return null;
	}

	static Ellipsis buildCircle(Point center, int radius) {
		// TODO build a circle
		return null;
	}

	static double computePerimeter(ConvexPolygon convexPolygon) {
		// TODO ask the convexPolygon to compute its perimeter
		return 0.0;
	}

	static double computeArea(ConvexPolygon convexPolygon) {
		// TODO ask the convexPolygon to compute its area
		return 0.0;
	}

	static double computePerimeter(Ellipsis ellipsis) {
		// TODO ask the ellipsis to compute its perimeter
		return 0.0;
	}

	static double computeArea(Ellipsis ellipsis) {
		// TODO ask the ellipsis to compute its area
		return 0.0;
	}
}
