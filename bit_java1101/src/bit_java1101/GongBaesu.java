package bit_java1101;

public class GongBaesu {

	public static void main(String[] args) {
		// 3�� 8�� ����� = 3���ε� �������� 8�ε� ����������°�
		// �ּҰ���� = �� �߿��� �������� ��
		int num=1;
		int minNum=0;
		while(num<=100) {
			if(num%3==0 && num%8==0) { // 3�� 8�� ���� ������ �������� 0�̾����
				System.out.println("����� : "+num);
				if(minNum==0)
					minNum = num; //����� ���� �ּڰ��̹Ƿ� ���� ������ ������� �ּ� �������
			}
			num++;
		}
		System.out.println("�ּҰ���� : "+minNum);
	}

}
