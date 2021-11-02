package bit_java1101;

public class LabelEx {

	public static void main(String[] args) {
		Loops: //loop는 반복문 위에 바로 붙어있어야함
			for(int i=2; i<=9; i++) {
				for(int j=1; j<=9; j++) {
					if(j==5)
						break Loops;// 아예 탈출
					//continue Loops; // i를 증가시키러감
					//continue; // 다음턴으로 이동 j=6으로!
					
					System.out.println(i+"*"+j+"="+i*j);
				}
			}

	}

}
