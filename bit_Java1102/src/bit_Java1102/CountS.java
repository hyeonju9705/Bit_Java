package bit_Java1102;

public class CountS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		String a = "class";
		for(int i=0; i<a.length(); i++) { //length인 5만큼 5번 돌아감
			if(a.charAt(i)=='s') //인덱스 i가 s여야지만 count한다.
				count++; 
		}
		System.out.println(count);
	}

}
