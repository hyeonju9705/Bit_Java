package Homework;

class Circle{
	double radius = 1.0; //������
	
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
	public double getArea() { //����
		double area = radius * radius * Math.PI;
		return Math.round(area*100)/100.0;
	}
	public double getCircumference() { //�ѷ�
		double circumference = (2*radius)*Math.PI;
		return Math.round(circumference*100)/100.0;
	}
	public String toString() {
		return "Circle[radius="+this.radius+"]";
	}
}

public class CircleEx {

	public static void main(String[] args) {
		// Math.PI ���
//		double radius = 3.0;
//		double area = radius * radius * Math.PI;
//		System.out.println(area);
		
		//����: myExp �� circle(����ø)
		
		Circle circle= new Circle();
		circle.setRadius(1.0);
		System.out.println(circle.toString()+"�� �ѷ��� "+circle.getCircumference()+
				", ������ "+circle.getArea());
		circle.setRadius(2.0);
		System.out.println(circle.toString()+"�� �ѷ��� "+circle.getCircumference()+
				", ������ "+circle.getArea());
	}

}
