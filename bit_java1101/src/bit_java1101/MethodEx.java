package bit_java1101;

public class MethodEx {

	public static void main(String[] args) {
		// �޼ҵ��°ɷ� ���ȭ �ϸ� ���� �� ������ �� �� ����
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum+=i;
		}
		System.out.printf("1���� 10������ �� : %d\n", sum);
		
		sum=0;
		for(int i=10; i<=100; i++) {
			sum+=i;
		}
		System.out.printf("10���� 100������ ��: %d\n", sum);
	}

}
