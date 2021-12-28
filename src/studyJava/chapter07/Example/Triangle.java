package studyJava.chapter07.Example;

public class Triangle extends Shape {
	private double side;

	public Triangle(double side) {
		this.side = side;
	}

	@Override
	public double area() {
		return (Math.sqrt(3) / 4) * side * side;
	}

	@Override
	public double perimeter() {
		return side * 3;
	}

	@Override
	public String toString() {
		return "������ ���� : �ﰢ�� , �ѷ� : " + perimeter() + "cm , ���� : " + area() + "cm��";
	}

}
