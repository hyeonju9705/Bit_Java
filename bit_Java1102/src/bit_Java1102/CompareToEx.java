package bit_Java1102;

public class CompareToEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  a= "java"; // v가 s보다 뒤에있음
		String b = "jasa";
		int res = a.compareTo(b); //a를 기준으로 b를 비교함
		if(res == 0)
			System.out.println("the same");
		else if(res<0)
			System.out.println(a+"<"+b);
		else
			System.out.println(a+">"+b);
	}

}
