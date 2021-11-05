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
	public double getPerimeter() { //�ѷ�
		return 2*this.radius*Math.PI;
	}
	public double getArea() {
		return this.radius*this.radius*Math.PI;
	}
	public String toString() {
		return String.format("Circle[radius=%.1f]�� �ѷ��� %.1f, ������ %.1f",
				this.radius, this.getPerimeter(), this.getArea());
	}
}

class ResizableCircle extends Circle implements Resizable {
	public ResizableCircle(double radius) {
//		this.radius=radius; //super�� �����ϴ°� �� �������� �ؿ��� ��
		super(radius);
	}
	public void resize(int percent) { //percent �Է½� ũ�⸦ Ű���� �����߸���
		System.out.printf("ũ�⸦ %d�ۼ�Ʈ ũ�� ���� ��\n",percent);
		radius=radius+(radius*(double)percent/100); //percent�� �������ε� ����/100�ϸ� 0�̳��ͼ�
		//percent��ŭ ������ radius�� �ȳ��Դ� ��..!!!
		// ����ȯ�� �Ű��� ����
	}
	public String toString() {
		return String.format("ResizableCircle[%s]",
				super.toString()); //radius�� �� ���ҷ�����??
		//super�� �Ȼ���ؼ� �׷��Ű�����... >> �ƴ�
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
