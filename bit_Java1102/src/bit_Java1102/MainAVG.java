package bit_Java1102;

public class MainAVG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float sum=0;
		
		for(String str : args) {
			System.out.println(str);
			sum+=Double.parseDouble(str);
		}
		System.out.printf("입력 받은 인자들의 평균 : %.15f",(float)sum/4);
		
//		for(int i=0; i<4; i++) {
//			sum+=Integer.parseInt(args[i]);
//			System.out.println(sum/4);
//		}
	}

}
