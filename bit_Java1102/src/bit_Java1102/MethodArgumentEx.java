package bit_Java1102;

public class MethodArgumentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {0};
		System.out.println("호출 전의 x[0] ="+ x[0]);
		increment(x);
		System.out.println("호출 후의 x[0] = "+ x[0]); //n이 참조하던 배열의 값을 변경했기때문에 1
	}

	public static void increment(int[] n) {
		System.out.print("increment() 메소드 내부임");;
		System.out.print(" n[0] =" +n[0]+"--->");
		n[0]++;
		System.out.println("n[0]= "+n[0]); 
	}
}
