package AM11;

interface GeomericObject{
	public double getPerimeter();
	public double getArea();
}
interface Resizable{
	public void resize(int percent);
}

class Circle implements GeomericObject{
	protected double radius = 1.0;
	
	public Circle() {
		
	}
	public Circle(double radius) {
		this.radius= radius;
	}
	public double getPerimeter() { //둘레
		return 2*this.radius*Math.PI;
	}
	public double getArea() {
		return this.radius*this.radius*Math.PI;
	}
	public String toString() {
		return String.format("Circle[radius=%.1f]의 둘레는 %.1f, 면적은 %.1f",
				this.radius, this.getPerimeter(), this.getArea());
	}
}

class ResizableCircle extends Circle implements Resizable {
	public ResizableCircle(double radius) {
//		this.radius=radius; //super에 저장하는게 더 좋은가봄 밑에가 답
		super(radius);
	}
	public void resize(int percent) { //percent 입력시 크기를 키워줌 공식잘못됨
		System.out.printf("크기를 %d퍼센트 크게 변경 후\n",percent);
		radius=radius+(radius*(double)percent/100); //percent가 정수형인데 정수/100하면 0이나와서
		//percent만큼 증가한 radius가 안나왔던 것..!!!
		// 형변환에 신경을 쓰자
	}
	public String toString() {
		return String.format("ResizableCircle[%s]",
				super.toString()); //radius를 왜 못불러오지??
		//super을 안사용해서 그런거같은데... >> 아님
	}
}
public class ResizableCircleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(1.0);
		System.out.println(c.toString());
		System.out.println("-------------------------------");
		ResizableCircle rc = new ResizableCircle(2.0);
		System.out.println(rc.toString());
		rc.resize(10);
		System.out.println(rc.toString());
		
	}

}
