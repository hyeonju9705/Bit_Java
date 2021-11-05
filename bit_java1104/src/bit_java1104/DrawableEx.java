package bit_java1104;

interface Printable{
	void print();
}
interface Showable{
	void show();
}
class B implements Printable, Showable{
	public void print() {
		System.out.println("Hello");
	}
	public void show() {
		System.out.println("Welcome");
	}
}
public class DrawableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		b.print();
		b.show();
	}

}
