package bit_java1101;

public class SwitchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 4;
		
		switch(num) {
		case 1: //num ==1 인지 판단
			System.out.println("숫자는 일임");
			break;
		case 2: //num == 2인지 판단
			System.out.println("숫자는 이임");
			break;
		case 3: 
			System.out.println("숫자는 삼임");
			break;
		default :
			System.out.println("숫자는 일도 아니고 이도 아니고 삼도 아님");	
		}
	}

}
