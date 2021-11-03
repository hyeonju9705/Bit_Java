package bit_Java1102;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] scores1= {11, 22, 33, 44, 55, 66, 77 , 88}; //목록으로 생성가능
		
//		System.out.println(scores1[0]);
//		scores1[0] = 100;
//		System.out.println(scores1[0]);
		
		int [] scores2 = new int[100]; //크기가 5인 정수를 저장할 수 있는 배열 객체 생성 값은 모두 0이들감
		
		double[] dArray = new double[10]; // 0.0으로 초기화됨
		char[] cArray = new char[3]; //' '(공백, ''안에 space들어있는 값)으로 초기화됨
		boolean[] bArray = new boolean[3]; //false가 기본값이므로 false로 초기화됨
		String[] strArray = new String[3]; //null로 초기화 됨
		
		for(int i=0; i<strArray.length; i++ )
			System.out.println(strArray[i]); //배열 명 바꿔가며 출력해보기!-> 초기화되어있는 값 출력됨
		
//		System.out.println("배열 생성 직후");
//		for(int i=0; i<scores2.length;i++) {
//			System.out.println(scores2[i]); // 길이가 100개인 배열생성 
//		}
//		for(int i=0; i<scores2.length; i++)
//		scores2[i] =i+1; //1부터 100까지 저장
//		System.out.println("새로운 값 저장 후 ");
//		for(int i=0; i<scores2.length; i++) {
//			System.out.println(scores2[i]); // 저장한 배열의 값을 출력
//		}
		
//		System.out.println(scores2[0]);
//		scores2[0] = 200;
//		System.out.println(scores2[0]);
//		System.out.println("배열의 크기 : "+scores2.length);
	}

}
