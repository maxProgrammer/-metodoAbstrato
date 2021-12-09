package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Shape> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of shapes: ");
		int qtd = sc.nextInt();

		for (int i = 0; i < qtd; i++) {
			System.out.print("Rectangle or Circle (r/c)? ");
			char ch = sc.next().charAt(0);
			Double width, height, radius;
			Color color;

			switch (ch) {
			case 'r':
				System.out.print("Color (BLACK / BLUE / RED): ");
				color = Color.valueOf(sc.next());
				System.out.println("Width: ");
				width = sc.nextDouble();
				System.out.println("Height: ");
				height = sc.nextDouble();
				list.add(new Rectangle(color, width, height));
				break;

			case 'c':
				System.out.print("Color (BLACK / BLUE / RED): ");
				color = Color.valueOf(sc.next());
				System.out.println("Radius: ");
				radius = sc.nextDouble();
				list.add(new Circle(color, radius));
				break;

			}
		}

		System.out.println("\nSHAPE AREAS:");
		for (Shape e : list) {
			System.out.println(e.toString());
		}
		
		sc.close();
	}

}
