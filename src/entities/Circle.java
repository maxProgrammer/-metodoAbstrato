package entities;

import entities.enums.Color;

public class Circle extends Shape {

	private Double radius;

	public Circle() {
		super();
	}

	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	public Double getCircle() {
		return radius;
	}

	public void setCircle(Double radius) {
		this.radius = radius;
	}

	@Override
	public Double area() {

		return 3.14159 * Math.pow(radius, 2);
	}

}
