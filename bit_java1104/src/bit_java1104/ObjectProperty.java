package bit_java1104;

import PM3.Point;

class Point{
	int x,y;
	public Point(int x, int y) {
		this.x = x;
		this.y=y;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Point(%d, %d)", x,y);
	}
	
}
public class ObjectProperty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point(2,3);
		System.out.println(p.getClass().getName());
		System.out.println(p.hashCode()); //������
		System.out.println(p.toString()); //16���� (Ŭ���� �̸��� ���� �ּ��� ��ġ�� �˷��ְ� �ִ�)
		System.out.println(p); //p.toString()�� ������ ���
	}

}
