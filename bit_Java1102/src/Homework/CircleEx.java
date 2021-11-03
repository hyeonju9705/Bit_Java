package Homework;

class Circle{
	double radius = 1.0; //반지름
	
	public Circle(double radius) {
		
	}
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius=radius;
	}
	public double getArea() { //면적
		double area = radius * radius * Math.PI;
		return Math.round(area*100)/100.0;
	}
	public double getCircumference() { //둘레
		double circumference = (2*radius)*Math.PI;
		return Math.round(circumference*100)/100.0;
	}
	public String toString() {
		return "Circle[radius="+this.radius+"]";
	}
}

public class CircleEx {

	public static void main(String[] args) {
		// Math.PI 사용
//		double radius = 3.0;
//		double area = radius * radius * Math.PI;
//		System.out.println(area);
		
		//과제: myExp 랑 circle(사진첩)
		
		Circle circle= new Circle();
		circle.setRadius(1.0);
		System.out.println(circle.toString()+"의 둘레는 "+circle.getCircumference()+
				", 면적은 "+circle.getArea());
		circle.setRadius(2.0);
		System.out.println(circle.toString()+"의 둘레는 "+circle.getCircumference()+
				", 면적은 "+circle.getArea());
	}

}
