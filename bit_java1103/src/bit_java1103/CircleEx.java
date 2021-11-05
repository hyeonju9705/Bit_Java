package bit_java1103;

import Exam.Circle;

class Circle{

	int radius;
	String color;
	static int numberOfCircles; //0 static�̶�� Ű���尡���������� ����̿�ǹǷ� 1,3����µ�����
	//static Ű���带 �����ϸ� 1,2�� ��µȴ�. static�� �ٸ���ü�� �����ϴ���
	//��� �̿��ϰ� ���ִ� ������ �Ѵٰ� ����� (��簴ü���� ������ �� �ִ� Ű���� = static)
	// int�� ������ ������ ��ü(c1,c2)�� numberOfCircles�� �����ϱ⶧���� 1,2�� ��µǴ� ��
	//static = Ŭ���� ���, ������� <--> �ν��Ͻ���� (�ڱ� ��ü �ȿ����� ��밡��)
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
