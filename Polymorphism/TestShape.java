/*QUESTION 2: SHAPES, MULTI-LEVEL & HIERARCHICAL INHERITANCE */

import java.util.*;

class Shape {
	protected String color = "red";

	Shape() {
		this.color = "Blue";
	}

	Shape(String color) {
		this.color = color;
	}

	public String getColor() {
		String color;
		Scanner c = new Scanner(System.in);
		color = c.next();
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}

class Circle extends Shape {
	protected float radius = 1;

	Circle(float radius) {
		this.radius = radius;
	}

	Circle(float radius, String color) {
		super(color);
		this.radius = radius;
	}

	public float getRadius() {
		return this.radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public double getArea() {
		double area;
		area = 3.14 * this.radius * this.radius;

		return area;
	}

	public double getPerimeter() {
		return 2 * 31.4 * this.radius;
	}

}

class Rectangle extends Shape {
	protected float width = 1, length = 1;

	Rectangle() {
		width = 2;
		length = 4;
	}

	Rectangle(float width, float length) {
		this.width = width;
		this.length = length;
	}

	Rectangle(float length, float width, String color) {
		super(color);
		this.length = length;
		this.width = width;
	}

	public float getWidth() {
		return this.width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getLength() {
		return this.length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public double getArea() {
		double area;
		area = this.length * this.width;

		return area;
	}

	public double getPerimeter() {
		return 2 * (this.length + this.width);
	}

}

class Square extends Rectangle {
	Square() {
		this.length = 5;
		this.width = 5;
	}

	Square(float side) {
		this.length = side;
		this.width = side;
	}

	Square(float side, String color) {
		this.color = color;
		this.length = side;
		this.width = side;
	}

	public float getSide() {
		return this.length;
	}

	public void setSide(float side) {
		this.length = side;
		this.width = side;
	}

}

public class TestShape {
	public static void main(String args[]) {
		double area, perimeter;
		Square s = new Square(10, "Black");
		Rectangle r = new Rectangle(5, 9);
		r.setColor("Pachai");
		Circle c = new Circle(5, "Red");
		c.setRadius(10);
		c.setColor("Gray");
		s.setSide(4);
		r.setLength(12);
		r.setWidth(8);

		System.out.println("The area of the Square(Color:" + s.color + ") is: " + s.getArea()
				+ " and the perimeter of the Square is: " + s.getPerimeter());
		System.out.println("The area of the Rectangle(Color:" + r.color + ") is: " + r.getArea()
				+ " and the perimeter of the Rectangle is: " + r.getPerimeter());
		System.out.println("The area of the Circle(Color:" + c.color + ") is: " + c.getArea()
				+ " and the perimeter of the Circle is: " + c.getPerimeter());
	}
}

/*
 * OUTPUT:
 * 
 * cs1196@u22:~/Desktop/Java/Ex5$ javac TestShape.java
 * cs1196@u22:~/Desktop/Java/Ex5$ java TestShape The area of the
 * Square(Color:Black) is: 16.0 and the perimeter of the Square is: 16.0 The
 * area of the Rectangle(Color:Blue) is: 96.0 and the perimeter of the Rectangle
 * is: 40.0 The area of the Circle(Color:Gray) is: 314.0 and the perimeter of
 * the Circle is: 628.0
 * 
 * 
 * 
 */
