package ThreePM1029;
import java.util.Scanner; // ����Ʈ��, Ŭ���� ���� �ٱ��� ����
//ctrl+shift+o : import ����Ű
public class InputEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);//��ĳ�� Ÿ���� ��ü�� �����ϴ� ���� scan
		System.out.print("������ �Է��ϼ��� >>");
		int num = scan.nextInt(); //�Է� ��ġ�κ��� ������ �о��
		System.out.printf("�Է¹��� ���� %d ", num);
		
		scan.nextInt();
		scan.close(); //��ĳ�ʸ� ����� ������ �ڿ��� ������
	}

}
