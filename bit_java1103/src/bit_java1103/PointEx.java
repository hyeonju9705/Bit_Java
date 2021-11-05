package bit_java1103;

class Point{
	private int x,y;
	void set (int x, int y){
		this.x=x;
		this.y = y;
	}
	void showPoint() {
		System.out.println("("+x+","+y+")"); //(x,y)
	}
}
class ColorPoint extends Point{
	String color;
	void setColor(String color) {
		this.color = color;
	}
	void showColorPoint() { //"color"(x,y) 출력할 것임
		System.out.print(color);
		showPoint();
	}
}

public class PointEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorPoint cp = new ColorPoint(); // null(0,0) 이 만들어짐
		cp.set(3, 4);
		cp.setColor("red");
		cp.showColorPoint(); // private이면 여기서는 사용가능하지만 main method에서 호출하려고하면
		//못함!
		
	}

}
