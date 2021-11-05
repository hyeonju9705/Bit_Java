package bit_java1104;

interface Movable{
	//인터페이스에 있는거 전부 추상메소드로만들기
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
		this.y-=this.ySpeed;// 모니터는 위쪽이 음수 ! 원점이 0,0이므로
		
	}
	public void moveDown() {
		y=y+ySpeed;
		System.out.println("포인트 아래로 이동");
	}
	public void moveLeft() {
		x=x-xSpeed;
	}
	public void moveRight() {
		x+=xSpeed;
		System.out.println("포인트 오른쪽으로 이동");
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
		System.out.println("원 위로 이동");
	}
	public void moveDown() {
		center.y+=center.ySpeed; //컴퓨터는 맨 왼쪽 끝이 0,0 이어서 내려가는걸 증가, 올라가는걸 감소라고 봄
		
	}
	public void moveLeft() {
		center.x-=center.xSpeed;
		System.out.println("원 왼쪽으로 이동");
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
		// 이동전 new
		// movablePoint
		//왼 이동전
		//new movableCircle
		
		System.out.println("포인트 이동 전");
		MovablePoint mp = new MovablePoint(5,6,10,15);
		System.out.print(mp.toString());
		System.out.println("포인트 왼쪽으로 이동");
		mp.moveLeft();
		System.out.print(mp.toString());
		System.out.println("포인트 위로 이동");
		mp.moveUp(); //다시 고치기,,,,
		System.out.print(mp.toString()); //이상한데? y가
		
		System.out.println("원 이동 전");
		MovableCircle mc = new MovableCircle(1,2,3,4,20);
		System.out.println(mc.toString());
		System.out.println("원 오른쪽으로 이동");
		mc.moveRight();
		System.out.println(mc.toString());
		System.out.println("원 아래로 이동");
		mc.moveDown();
		System.out.println(mc.toString());

	}

}
