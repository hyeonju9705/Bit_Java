package bit_Java1102;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] scores1= {11, 22, 33, 44, 55, 66, 77 , 88}; //������� ��������
		
//		System.out.println(scores1[0]);
//		scores1[0] = 100;
//		System.out.println(scores1[0]);
		
		int [] scores2 = new int[100]; //ũ�Ⱑ 5�� ������ ������ �� �ִ� �迭 ��ü ���� ���� ��� 0�̵鰨
		
		double[] dArray = new double[10]; // 0.0���� �ʱ�ȭ��
		char[] cArray = new char[3]; //' '(����, ''�ȿ� space����ִ� ��)���� �ʱ�ȭ��
		boolean[] bArray = new boolean[3]; //false�� �⺻���̹Ƿ� false�� �ʱ�ȭ��
		String[] strArray = new String[3]; //null�� �ʱ�ȭ ��
		
		for(int i=0; i<strArray.length; i++ )
			System.out.println(strArray[i]); //�迭 �� �ٲ㰡�� ����غ���!-> �ʱ�ȭ�Ǿ��ִ� �� ��µ�
		
//		System.out.println("�迭 ���� ����");
//		for(int i=0; i<scores2.length;i++) {
//			System.out.println(scores2[i]); // ���̰� 100���� �迭���� 
//		}
//		for(int i=0; i<scores2.length; i++)
//		scores2[i] =i+1; //1���� 100���� ����
//		System.out.println("���ο� �� ���� �� ");
//		for(int i=0; i<scores2.length; i++) {
//			System.out.println(scores2[i]); // ������ �迭�� ���� ���
//		}
		
//		System.out.println(scores2[0]);
//		scores2[0] = 200;
//		System.out.println(scores2[0]);
//		System.out.println("�迭�� ũ�� : "+scores2.length);
	}

}
