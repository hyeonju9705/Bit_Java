package bit_Java1102;

public class ArrayEx2 {

	public static void main(String[] args) { //main method에 데이터를 넣고싶다면 args를 이용할수있음
		// run configuration 에다가 인자를 넣어서!
		
//		System.out.println(args.length);
//		System.out.println(args);
		for(int i=0; i<args.length; i++)
			System.out.println(args[i]);
		
		for(int i=0; i<Integer.parseInt(args[i]); i++) {
			System.out.println(args[0]); //왜 난 안되지
		}
//		String strArray[] = new String[4];
//		System.out.println("배열 객체 생성 후");
//		for(int i=0; i<strArray.length; i++)
//			System.out.println(strArray[i]);
//		
//		System.out.println("저장 후");
//		strArray[0]="Hello";
//		strArray[1]="java";
//		for(int i=0; i<strArray.length; i++)
//			System.out.println(strArray[i]);
//		System.out.
	}

}
