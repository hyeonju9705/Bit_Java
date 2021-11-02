package ThreePM1029;

import java.util.Scanner;

public class SansulExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("몸무게(kg): ");
		int kg =scan.nextInt();
		System.out.print("신장(m): ");
		double height = scan.nextDouble();
		double BMI = (double)kg/(height*height);
		int BMI2 = (int) BMI;
		System.out.print("BMI: "+BMI2);
		
		
	}

}
