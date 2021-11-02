package bit_java1101;

public class DoWhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int sum = 0;
		do {
			sum+=i;
			i++;
		} while(i<=10);
		System.out.println("1부터 10까지의 합은"+sum);
	}

}
