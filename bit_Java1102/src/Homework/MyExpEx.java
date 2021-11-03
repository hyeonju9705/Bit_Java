package Homework;

class MyExp{
	int base; //밑
	int exp; //지수
	
	public int getValue() {
		//거듭제곱을 계산한 다음 반환하는 메소드
		int result=(int) Math.pow(base,exp);
		return result;
	}
}

public class MyExpEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyExp aMyExp; 
		aMyExp = new MyExp();
		
		aMyExp.base=2;
		aMyExp.exp=3;
		System.out.printf("%d의 %d승 = %d\n",aMyExp.base,aMyExp.exp,aMyExp.getValue());
		aMyExp.base=3;
		aMyExp.exp=4;
		System.out.printf("%d의 %d승 = %d",aMyExp.base,aMyExp.exp,aMyExp.getValue());
		
		
		
		
	}

}
