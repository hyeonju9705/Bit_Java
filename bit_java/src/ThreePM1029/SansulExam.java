package ThreePM1029;

import java.util.Scanner;

public class SansulExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������(kg): ");
		int kg =scan.nextInt();
		System.out.print("����(m): ");
		double height = scan.nextDouble();
		double BMI = (double)kg/(height*height);
		int BMI2 = (int) BMI;
		System.out.print("BMI: "+BMI2);
		
		
	}

}
