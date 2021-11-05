package PM3;

public class ClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("abc"); //String으로 객체를 만들었기 때문에
		//원래 class가 java.lang에 만들어지므로 이렇게 출력이되는것
		Class clazz = str.getClass();
		System.out.println(clazz);
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
//		
//		try {
//			Class clazz = Class.forName("java.lang.Object");
//			System.out.println(clazz);
//			System.out.println(clazz.getName());
//			System.out.println(clazz.getSimpleName());
//		} catch(ClassNotFoundException e) {
//			e.printStackTrace();
//		}
	}

}
