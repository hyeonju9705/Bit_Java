package bit_java1104;

public class ExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			System.out.println(4/0); // 예외발생 가능성있음
		} 
		catch(ArithmeticException e) {
			System.out.println("예외 발생했음");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
//		catch(NumberFormatException e) {
//			System.out.println("예외 발생했음");
//			System.out.println(e.getMessage());
//		}
		
	}

}
