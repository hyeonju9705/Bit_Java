package bit_java1104;

interface Movable{
	//�������̽��� �ִ°� ���� �߻�޼ҵ�θ����
	abstract void moveUp();
	abstract void moveDown();
	abstract void moveLeft();
	abstract void moveRight();
}

class MovablePoint implements Movable{
	int x;
	int y;
	int xSpeed, ySpeed;
	
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x=x;
		this.y=y;
		this.xSpeed=xSpeed;
		this.ySpeed=ySpeed;
	}
	public void moveUp() {
		this.y-=this.ySpeed;// ����ʹ� ������ ���� ! ������ 0,0�̹Ƿ�
		
	}
	public void moveDown() {
		y=y+ySpeed;
		System.out.println("����Ʈ �Ʒ��� �̵�");
	}
	public void moveLeft() {
		x=x-xSpeed;
	}
	public void moveRight() {
		x+=xSpeed;
		System.out.println("����Ʈ ���������� �̵�");
	}
	public String toString() {
		return String.format("MovablePoint[x=%d, y=%d, xSpeed=%d,"
				+ "ySpeed=%d]\n", x,y,xSpeed,ySpeed);
	}
}

class MovableCircle implements Movable{
	private int radius;
	private MovablePoint center; //point
	
	public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
//		center.x=x;
//		center.y=y;
//		center.xSpeed=xSpeed;
//		center.ySpeed = ySpeed;
		center = new MovablePoint(x, y, xSpeed, ySpeed);
		this.radius = radius;
	}
	public void moveUp() {
		center.y+=center.ySpeed;
		System.out.println("�� ���� �̵�");
	}
	public void moveDown() {
		center.y+=center.ySpeed; //��ǻ�ʹ� �� ���� ���� 0,0 �̾ �������°� ����, �ö󰡴°� ���Ҷ�� ��
		
	}
	public void moveLeft() {
		center.x-=center.xSpeed;
		System.out.println("�� �������� �̵�");
	}
	public void moveRight() {
		center.x+=center.xSpeed;
		
	}
	public String toString() {
		return String.format("MovableCircle[center=%s, radius=%d", 
				center.toString(),radius);
	}
}
public class MovableEx {

	public static void main(String[] args) {
		// �̵��� new
		// movablePoint
		//�� �̵���
		//new movableCircle
		
		System.out.println("����Ʈ �̵� ��");
		MovablePoint mp = new MovablePoint(5,6,10,15);
		System.out.print(mp.toString());
		System.out.println("����Ʈ �������� �̵�");
		mp.moveLeft();
		System.out.print(mp.toString());
		System.out.println("����Ʈ ���� �̵�");
		mp.moveUp(); //�ٽ� ��ġ��,,,,
		System.out.print(mp.toString()); //�̻��ѵ�? y��
		
		System.out.println("�� �̵� ��");
		MovableCircle mc = new MovableCircle(1,2,3,4,20);
		System.out.println(mc.toString());
		System.out.println("�� ���������� �̵�");
		mc.moveRight();
		System.out.println(mc.toString());
		System.out.println("�� �Ʒ��� �̵�");
		mc.moveDown();
		System.out.println(mc.toString());

	}

}
