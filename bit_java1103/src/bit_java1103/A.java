package bit_java1103;

public class A {
	static int a =40;
	public static int add(int x, int y) {
		return this.a+y; // static 메소드 내에서는 this 키워드 사용 불가
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A aa = new A();
		System.out.println(aa.a); // 생성자 없이는 static이 아닌 것을 참조할 수 없다
		//static달고있다면 생성자없어도됨 ㅎ(함수에 ~.으로 참조하지않고 단독사용가능)
		add(1,2);
	}

}
