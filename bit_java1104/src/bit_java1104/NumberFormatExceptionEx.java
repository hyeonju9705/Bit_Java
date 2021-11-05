package bit_java1104;

import java.util.Scanner;

public class NumberFormatExceptionEx {

	public static void main(String[] args) {
		
		try {
			String[] stringNumber = {"23","12", "998", "3.141592"};
			for(int i=0; i<stringNumber.length; i++) {
				System.out.printf("숫자로 변환된 값은 %d\n", 
						Integer.parseInt(stringNumber[i]));
			}
			}catch(NumberFormatException e) { //왜안되뉴ㅠㅠ
				System.out.println("정수로 변환할 수 없습니다.");
			}
		}
	}


