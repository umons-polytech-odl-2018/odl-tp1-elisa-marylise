package exercise3;

public class ConvexPolygon {
	private Point[] vertices;

	public double perimeter(){
		float perimeter = 0;
		for (int i = 0; i<= vertices.length-1;i++) {
			int x1 = vertices[i].getX();
			int y1 = vertices[i].getY();
			int x2 = vertices[i].getX();
			int y2 = vertices[i].getY();
			perimeter += Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		}
		return perimeter;
	}

	public double area(){
		return 0;
	}

	public Point[] getVertices() {
		return vertices;
	}

	public ConvexPolygon(Point[] vertices) {
		this.vertices = vertices;
	}
}
