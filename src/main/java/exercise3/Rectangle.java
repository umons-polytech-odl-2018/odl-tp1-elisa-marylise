package exercise3;

public class Rectangle extends ConvexPolygon{
	private Point upperLeft;
	private Point lowerRight;
		
	public Rectangle(Point upperLeft,Point lowerRight){
		super (new Point[]{
			upperLeft, 
			new Point(lowerRight.getX(),upperLeft.getY()),
			lowerRight,
			new Point(upperLeft.getX(), lowerRight.getY())
		});
		this.upperLeft = upperLeft;
		this.lowerRight = lowerRight;
	}

	public Rectangle(Point[] vertices) {
		super(vertices);
	}

	public Point getLowerRight() {
		return lowerRight;
	}

	public Point getUpperLeft() {
		return upperLeft;
	}

}
