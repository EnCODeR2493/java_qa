package ru.stqa.pft.sandbox;

public class HelloWorld {
	public static void main (String[] args) {
		hello("World");
		hello("Guest");
		hello("User 1");

		Square s = new Square(5);
		System.out.println("Площадь квадрата со стороной " + s.l + " = " + area(s));

		Rectangle r = new Rectangle(4, 6);
		System.out.println("Площадь прямоугольника со сторонами a = " + r.a + " и b = " + r.b + " = " + area(r));
	}

	public static void hello(String somebody) {
		System.out.println ("Hey, " + somebody + "!");
	}

	public static double area (Square s) {
		return s.l * s.l;
	}

	public static double area (Rectangle r){
		return r.a * r.b;
	}
}