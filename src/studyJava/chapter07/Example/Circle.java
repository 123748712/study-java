package studyJava.chapter07.Example;

public class Circle extends Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return radius * radius * Math.PI;
	}

	@Override
	public double perimeter() {
		return radius * 2 * Math.PI;
	}

	@Override
	public String toString() {
		return "도형의 종류 : 삼각형 , 둘레 : " + perimeter() + "cm , 넓이 : " + area() + "cm²";
	}

}
