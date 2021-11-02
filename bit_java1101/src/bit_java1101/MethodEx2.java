package bit_java1101;

public class MethodEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("합(1~10) : "+sum(1,10)); // 필요한 곳에서 호출함
		//(1부터 10까지의 합을 계산 후 반환해 달라)
		System.out.println("합(10~100) : "+sum(10,100));
	}
	public static int sum(int i1, int i2) { // i1,i2는 매개변수 --> 매소드정의
		int sum=0;
		for(int i = i1; i<=i2; i++)
			sum+=i;
		return sum; // 결과값은 sum에 저장되어있고 sum을 반환
	}

}
//양수 - break,,continue안씀
//