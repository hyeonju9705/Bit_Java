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
	void showColorPoint() { //"color"(x,y) ����� ����
		System.out.print(color);
		showPoint();
	}
}

public class PointEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorPoint cp = new ColorPoint(); // null(0,0) �� �������
		cp.set(3, 4);
		cp.setColor("red");
		cp.showColorPoint(); // private�̸� ���⼭�� ��밡�������� main method���� ȣ���Ϸ����ϸ�
		//����!
		
	}

}
