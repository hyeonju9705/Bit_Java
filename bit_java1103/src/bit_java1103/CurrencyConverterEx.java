package bit_java1103;
class CurrencyConverter{ //ȯ�� ��ȯ ���α׷�.. ������ �ʹ������ �����ʿ�
	private static double rate;
	public static double toDallar(double won) { //���� �Է¹޾Ƽ� �޷��κ�ȯ
		//�ѱ� ��ȭ�� �޷��� ��ȯ
		return 
		Math.round((won/rate)*100)/100.0; // �Ҽ��� 2�ڸ� �����ֱ����� math�Լ� �̿�
		//�Է¹��� won�� rate(1180��)�� ������ �ᱹ ��޶� ȯ���� �� ������ ������ ���̴� �װ� return 
	}
	public static double toKWR(double dollar) { //�޷��� �Է¹޾� ������ ��ȯ
		//�޷��� �ѱ� ��ȭ�� ��ȯ
		return 
		Math.round((dollar*rate)*100)/100.0; // ȯ�� ��ü�� 1�޷��� 1180���̶� ���ؼ� return
	}
	public static void setRate(double r) { //r�� ȯ���ε�
		//ȯ�� ���� kwr/$1
		rate=r; //ȯ���� �� �������� ������ ���ؾ���. ���� 1�޶�� 1180.64���̴ϱ�
		//ȯ���� 1180.64�� ����
	}
}
public class CurrencyConverterEx {

	public static void main(String[] args) {
		// ���� �̱� �޷� ȯ�� ����
		CurrencyConverter.setRate(1180.64); //ȯ�� ����
		CurrencyConverter.toDallar(1000000); //���� �޶�� ���
		CurrencyConverter.toKWR(100); //�޶� ������ ��길
		System.out.println("�鸸���� "+CurrencyConverter.toDallar(1000000)+"�޶��Դϴ�.");
		System.out.println("��޷��� "+CurrencyConverter.toKWR(100)+"���Դϴ�.");
	}

}
