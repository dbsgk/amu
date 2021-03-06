package thread;

import java.awt.Color;

public class ShapeDTO {
	private int x1, y1, x2, y2;
	private String shape;
	private Color color;
	
	public ShapeDTO(String shape, Color color, int x1, int y1, int x2, int y2) {
		this.shape = shape;
		this.color = color;
		this.x1 = x1; this.y1 = y1;
		this.x2 = x2; this.y2 = y2;
	}
	public String getShape() {
		return shape;
	}
	public Color getColor() {
		return color;
	}
	public int getX1() {
		return x1;
	}
	public int getY1() {
		return y1;
	}
	public int getX2() {
		return x2;
	}
	public int getY2() {
		return y2;
	}
}
