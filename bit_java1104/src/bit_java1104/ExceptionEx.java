package bit_java1104;

public class ExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			System.out.println(4/0); // ���ܹ߻� ���ɼ�����
		} 
		catch(ArithmeticException e) {
			System.out.println("���� �߻�����");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
//		catch(NumberFormatException e) {
//			System.out.println("���� �߻�����");
//			System.out.println(e.getMessage());
//		}
		
	}

}
