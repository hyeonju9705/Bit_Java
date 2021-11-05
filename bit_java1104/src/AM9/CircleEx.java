package AM9;

abstract class Shape{
	abstract double calArea();
}

class Circle extends Shape{
	double radius;
	
	public Circle(double radius){
		this.radius=radius;
	}
	@Override
	public double calArea() {
		//�������ϴ� ����
		return Math.PI *(radius*radius);
	}
	
}

class Rectangle extends Shape{
	double width;
	double height;
	
	public Rectangle(double width, double height){
		this.width= width; // this�� �׻� ���� ������ �̰Ŷ��� 0.0�����ڳ� ���밥�������ư����
		this.height = height;
	}
	@Override
	public double calArea() {
		return width * height;
	}
}
public class CircleEx {

	public static void main(String[] args) {
		
//		Circle c = new Circle(21.);
//		System.out.println(c.calArea());
//		System.out.println(c.radius);
		// TODO Auto-generated method stub
		double sum =0;
		Shape[] sArr = {new Circle(5.0), new Rectangle(3,4), new Circle(1)};
		for(int i=0; i<sArr.length; i++) {
			sum+=(sArr[i].calArea()); 
		}
		System.out.printf("������ ��: %f", sum);
//		System.out.println(sArr[0].calArea());
	}

}
