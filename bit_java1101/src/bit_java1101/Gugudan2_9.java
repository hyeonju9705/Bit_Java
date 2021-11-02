package bit_java1101;

public class Gugudan2_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int dan=2; dan<10; dan++) {
//			for(int i=1; i<10; i++) {
//				System.out.printf("%d * %d = %d\n", dan,i,dan*i);
//			}
//		}
		
		for(int dan = 2; dan<10; dan++, System.out.println()) {
			for(int i=1; i<10; i++) {
				System.out.printf("%d * %d = %2d\t", dan,i,dan*i);
			}
		}
	}

}
