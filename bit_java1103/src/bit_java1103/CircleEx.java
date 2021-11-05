package bit_java1103;

import Exam.Circle;

class Circle{

	int radius;
	String color;
	static int numberOfCircles; //0 static이라는 키워드가있을때에만 계속이용되므로 1,3이출력되지만
	//static 키워드를 제거하면 1,2가 출력된다. static이 다른객체가 참조하더라도
	//계속 이용하게 해주는 역할을 한다고 보면됨 (모든객체들이 공유할 수 있는 키워드 = static)
	// int만 있으면 각각의 객체(c1,c2)에 numberOfCircles를 생성하기때문에 1,2가 출력되는 것
	//static = 클래스 멤버, 정적멤버 <--> 인스턴스멤버 (자기 객체 안에서만 사용가능)
	Circle(int radius, String color){
		this.radius = radius;
		this.color = color;
	}
}
public class CircleEx{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(100, "red");
		Circle c2 = new Circle(50,"yellow");
		c1.numberOfCircles++; //1
		System.out.println(c1.numberOfCircles); //1
		c2.numberOfCircles++; //2
		c2.numberOfCircles++; //3
		System.out.println(c2.numberOfCircles); //3
	}

}
