package bit_java1104;

import java.util.Scanner;

public class NumberFormatExceptionEx {

	public static void main(String[] args) {
		
		try {
			String[] stringNumber = {"23","12", "998", "3.141592"};
			for(int i=0; i<stringNumber.length; i++) {
				System.out.printf("���ڷ� ��ȯ�� ���� %d\n", 
						Integer.parseInt(stringNumber[i]));
			}
			}catch(NumberFormatException e) { //�־ȵǴ��Ф�
				System.out.println("������ ��ȯ�� �� �����ϴ�.");
			}
		}
	}


