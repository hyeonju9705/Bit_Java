package bit_java1101;

public class LabelEx {

	public static void main(String[] args) {
		Loops: //loop�� �ݺ��� ���� �ٷ� �پ��־����
			for(int i=2; i<=9; i++) {
				for(int j=1; j<=9; j++) {
					if(j==5)
						break Loops;// �ƿ� Ż��
					//continue Loops; // i�� ������Ű����
					//continue; // ���������� �̵� j=6����!
					
					System.out.println(i+"*"+j+"="+i*j);
				}
			}

	}

}
