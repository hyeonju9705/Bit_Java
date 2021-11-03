package Homework;

//import bit_Java1102.Person;

class Rectangle{
	public double length=1.0;
	public double width = 1.0;
	
	public Rectangle() {
		
	}
	public Rectangle(double length, double width) {
		this.length=length;
		this.width=width;
	}
	public double getLength() { //���� ��������
		return length;
	}
	public void setLength(double length) {
		this.length=length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width=width;
	}
	public double getArea() {
		return width*length;
	}
	public double getPerimeter() {
		return (length+width)*2;
	}
	public String toString() {
		return "Rectangle[length="+getLength()+",width="+getWidth()+"]";
	}
}
public class RectangleEx {

	public static void main(String[] args) {
		// getParimeter() = �ѷ�, getArea() = ����
		// getLength() ���ٰ��� return length�ϼ�
		//getWidth() = double�� ��ȯŸ������ �ϰ� return width
		//SetLength()
		
		// +�� �Ǿ������� public -�� �ǹ̰������� �ϴ��� public���ѷ� �����Ұ�
		Rectangle aRectangle; 
		aRectangle = new Rectangle(1.0,1.0);
		System.out.println(aRectangle.toString()+"�� �ѷ��� "+aRectangle.getPerimeter()+
				", ������ "+aRectangle.getArea());
		aRectangle.setWidth(3.0);
		aRectangle.setLength(4.0);
		System.out.println(aRectangle.toString()+"�� �ѷ��� "+aRectangle.getPerimeter()+
				", ������ "+aRectangle.getArea());
	}

}
