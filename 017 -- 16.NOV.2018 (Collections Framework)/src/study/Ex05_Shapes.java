package study;

// add this file to 14 Nov. 2018 (7�� ��������)

class Ex05_Shapes {
	// �־��� �迭�� ��� �������� ���̸� ��� ���ؼ� ��ȯ�Ѵ�.
	static double sumArea(Shape[] arr) {
		double sum = 0;
		for(Shape s : arr) {
			sum += s.calcArea();
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Shape[] arr = { new Circle(5.0), new Rectangle(3,4), new Circle(1) };
		System.out.println("������ ��: " + sumArea(arr));
	}
}

abstract class Shape {
	Point p;
	
	Shape() {
		this(new Point(0,0));
	}
	
	Shape(Point p) {
		this.p = p;
	}
	
	// ������ ������ ����ؼ� ��ȯ�ϴ� �޼���
	abstract double calcArea();
	
	Point getPosition() {
		return p;
	}
	
	void setPosition(Point p) {
		this.p = p;
	}
} // �߻�Ŭ���� Shape ��.

class Point {
	int x;
	int y;
	
	Point() {
		this(0,0);
	}
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "[" + x + "," + y + "]";
	}
} // Point Ŭ���� ��.

class Circle extends Shape {
	double r;
	
	Circle() {
		this(1);
	}
	
	Circle(double x) {
		this.r = x;
	}
	
	double calcArea() {
		return Math.PI * r * r;
	}
} // Circle Ŭ���� ��.

class Rectangle extends Shape {
	double width, height;
	
	Rectangle() {
		this(1, 1);
	}
	
	Rectangle(int x, int y) {
		this.width = x;
		this.height = y;
	}
	
	double calcArea() {
		return width * height;
	}
	
	boolean isSquare() {
		return width == height;
	}
} // Rectangle Ŭ���� ��.