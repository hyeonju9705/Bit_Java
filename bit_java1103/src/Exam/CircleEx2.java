package Exam;

class Circle{
	private double radius = 1.0;
	private String color = "red"; // 보호차원, 안전하고 검증된 접근만 허용
	
	public Circle() {}
	public Circle(double r) {
		this.radius =r;
	}
	public double getRadius() { //getter
		return radius;
	}
	public void setRadius(double radius) { //setter
		this.radius = radius;
	}
}
public class CircleEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
//		c.radius = 2.0;
		c.getRadius();
	}

}
