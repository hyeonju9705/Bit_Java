package Homework;

class MyExp{
	int base; //��
	int exp; //����
	
	public int getValue() {
		//�ŵ������� ����� ���� ��ȯ�ϴ� �޼ҵ�
		int result=(int) Math.pow(base,exp);
		return result;
	}
}

public class MyExpEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyExp aMyExp; 
		aMyExp = new MyExp();
		
		aMyExp.base=2;
		aMyExp.exp=3;
		System.out.printf("%d�� %d�� = %d\n",aMyExp.base,aMyExp.exp,aMyExp.getValue());
		aMyExp.base=3;
		aMyExp.exp=4;
		System.out.printf("%d�� %d�� = %d",aMyExp.base,aMyExp.exp,aMyExp.getValue());
		
		
		
		
	}

}
