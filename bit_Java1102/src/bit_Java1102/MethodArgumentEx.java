package bit_Java1102;

public class MethodArgumentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {0};
		System.out.println("ȣ�� ���� x[0] ="+ x[0]);
		increment(x);
		System.out.println("ȣ�� ���� x[0] = "+ x[0]); //n�� �����ϴ� �迭�� ���� �����߱⶧���� 1
	}

	public static void increment(int[] n) {
		System.out.print("increment() �޼ҵ� ������");;
		System.out.print(" n[0] =" +n[0]+"--->");
		n[0]++;
		System.out.println("n[0]= "+n[0]); 
	}
}
