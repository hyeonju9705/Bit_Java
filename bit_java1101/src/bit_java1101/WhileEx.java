package bit_java1101;

public class WhileEx {

	public static void main(String[] args) {
//		int i=1;
//		while(i<=10) {
//			System.out.println(i);
//			i++;
//		}
		
		int sum=0;
		int i=1;
		while(i<=10) {
			sum+=i;
			i++;
		}
		System.out.println("1부터 10까지의 합은 "+sum);
		
	}

}
