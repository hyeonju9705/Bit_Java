package bit_java1104;

public class WrapperClassEx {

	public static void main(String[] args) {
		// �����ʼ�!!!!!!!!!!!!!!!!!!!!
//		Integer i = new integer(10); //������ ���������� ��ȯ�Ϸ����ؼ� �ȵǰ�...
		char c='4';
//		Double d = new Double(3.1234566);
		System.out.println(Character.toLowerCase('A'));
		if(Character.isDigit(c))
			System.out.println(Character.getNumericValue(c));
		System.out.println(Integer.parseInt(".123"));
		System.out.println(Integer.parseInt("10",16));
		System.out.println(Integer.toBinaryString(28));
		System.out.println(Integer.bitCount(28));
		System.out.println(Integer.toHexString(28));
//		System.out.println(i.doubleValue());
//		System.out.println(d.toString());
		System.out.println(Double.parseDouble("44.13e-6"));
		}

}
