package bit_java1101;

public class ScoreEx {

	public static void main(String[] args) {
		// 요구사항에 맞는 프로그램 만들기
//		점수가 90점 이상이면 A출력
//		점수가 80점이상~90점미만이면 B출력
//		점수가 70점이상~80점미만이면 C출력
//		점수가 60점이상 ~ 70점 미만이면 D출력
//		점수가 60점 미만이면 F출력
		
		int score = 90;
		if(score>=90)
			System.out.println("A");
		else if(score>=80)
			System.out.println("B");
		else if(score>=70)
			System.out.println("C");
		else if(score>=600)
			System.out.println("D");
		else 
			System.out.println("F");

	}

}
