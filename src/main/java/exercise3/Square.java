package exercise3;

public class Square extends Rectangle {
	private Point upperLeft;
	private int sideLength;

	public int getSideLength() {
		return sideLength;
	}

	public Point getUpperLeft() {
		return upperLeft;
	}

	public Square(Point upperLeft, int sideLength){
		super (new Point[]{
			upperLeft,
			new Point(upperLeft.getX() + sideLength, upperLeft.getY()),
			new Point(upperLeft.getX() + sideLength, upperLeft.getY() - sideLength),
			new Point(upperLeft.getX(), upperLeft.getY() - sideLength)
		});
		this.upperLeft = upperLeft;
		this.sideLength = sideLength;
	}
}
