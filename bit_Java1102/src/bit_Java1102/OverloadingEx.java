package bit_Java1102;

public class OverloadingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(1,2));
		System.out.println(add(1,2,3));
		System.out.println(add(1.0, 2.0));
		System.out.println(add("aaa","bbb"));
	}
	
	public static int add(int x, int y, int z) {
		return x+y+z; //밑에 add처럼 *갯수가 다르거나 타입이 달라야* 구분이됨. 이것을 overloading이라함
		// return타입이 다른것은 의미가 없음!
	}
	
	public static int add(int x, int y) {
		return x+y;
	}
	public static double add(double x, double y) {
		return x+y;
	}
	public static String add(String x, String y) {
		return x+y;
	}
}
