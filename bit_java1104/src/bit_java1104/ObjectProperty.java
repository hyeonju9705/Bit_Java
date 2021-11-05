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
		System.out.println(p.hashCode()); //십진수
		System.out.println(p.toString()); //16진수 (클래스 이름과 같이 주소의 위치를 알려주고 있다)
		System.out.println(p); //p.toString()과 동일한 결과
	}

}
