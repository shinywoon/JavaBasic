package z10.JavaOutPrac;

import java.util.Scanner;

class Point {
	private int x, y;

	public Point() {}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void showPoint() {
		System.out.println("(" + x + ", " + y + ")");
	}
}

class ColorPoint extends Point {
	private String color;
	
	public ColorPoint(int x, int y, String c) {
		super(x, y);
		this.color = c;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void showPoint() {
		System.out.print(color);
		super.showPoint();
	}
}

public class JavaOutPac {

	public static void main(String[] args) {

		Point p = new Point(1, 2);
		ColorPoint cp = new ColorPoint(2, 3, "red");
		p.showPoint();
		cp.showPoint();

	}
}
