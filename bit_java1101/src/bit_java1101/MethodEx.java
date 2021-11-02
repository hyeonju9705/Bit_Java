package bit_java1101;

public class MethodEx {

	public static void main(String[] args) {
		// 메소드라는걸로 모듈화 하면 조금 더 간결해 질 수 있음
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum+=i;
		}
		System.out.printf("1부터 10까지의 합 : %d\n", sum);
		
		sum=0;
		for(int i=10; i<=100; i++) {
			sum+=i;
		}
		System.out.printf("10부터 100까지의 합: %d\n", sum);
	}

}
