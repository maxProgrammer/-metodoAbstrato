package entities;

import entities.enums.Color;

public abstract class Shape {
	Color color;

	public Shape() {
		super();
	}

	public Shape(Color color) {
		super();
		this.color = color;
	}
	
	public abstract Double area();
	
	public String toString() {
		StringBuilder std = new StringBuilder();
		std.append(String.format("%.2f", area()));
		
		return std.toString();
	}

}
