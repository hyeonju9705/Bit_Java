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
	public double getLength() { //길이 가져오기
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
		// getParimeter() = 둘레, getArea() = 면적
		// getLength() 에다가는 return length하셈
		//getWidth() = double을 반환타입으로 하고 return width
		//SetLength()
		
		// +로 되어있으면 public -도 의미가있지만 일단은 public으ㅡ로 생성할것
		Rectangle aRectangle; 
		aRectangle = new Rectangle(1.0,1.0);
		System.out.println(aRectangle.toString()+"의 둘레는 "+aRectangle.getPerimeter()+
				", 면적은 "+aRectangle.getArea());
		aRectangle.setWidth(3.0);
		aRectangle.setLength(4.0);
		System.out.println(aRectangle.toString()+"의 둘레는 "+aRectangle.getPerimeter()+
				", 면적은 "+aRectangle.getArea());
	}

}
