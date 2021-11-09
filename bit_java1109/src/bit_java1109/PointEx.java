package bit_java1109;

import java.util.ArrayList;

class Point{
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public String toString() {
		return String.format("Point(x=%d, y=%d)",x,y);
	}
}
public class PointEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Point> al =new ArrayList<Point>(); //<> = Á¦³×¸¯
		al.add(new Point(2,3));
		al.add(new Point(3,4));
		al.add(new Point(1,-6));
		
		for(Point p : al)
			System.out.println(p);
		
	}

}
