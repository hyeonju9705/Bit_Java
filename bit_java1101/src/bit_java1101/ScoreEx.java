package bit_java1101;

public class ScoreEx {

	public static void main(String[] args) {
		// �䱸���׿� �´� ���α׷� �����
//		������ 90�� �̻��̸� A���
//		������ 80���̻�~90���̸��̸� B���
//		������ 70���̻�~80���̸��̸� C���
//		������ 60���̻� ~ 70�� �̸��̸� D���
//		������ 60�� �̸��̸� F���
		
		int score = 90;
		if(score>=90)
			System.out.println("A");
		else if(score>=80)
			System.out.println("B");
		else if(score>=70)
			System.out.println("C");
		else if(score>=600)
			System.out.println("D");
		else 
			System.out.println("F");

	}

}
