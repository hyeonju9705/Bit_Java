package bit_java1101;

public class MethodEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��(1~10) : "+sum(1,10)); // �ʿ��� ������ ȣ����
		//(1���� 10������ ���� ��� �� ��ȯ�� �޶�)
		System.out.println("��(10~100) : "+sum(10,100));
	}
	public static int sum(int i1, int i2) { // i1,i2�� �Ű����� --> �żҵ�����
		int sum=0;
		for(int i = i1; i<=i2; i++)
			sum+=i;
		return sum; // ������� sum�� ����Ǿ��ְ� sum�� ��ȯ
	}

}
//��� - break,,continue�Ⱦ�
//