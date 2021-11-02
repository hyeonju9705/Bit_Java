package bit_java1101;

public class GongBaesu {

	public static void main(String[] args) {
		// 3과 8의 공배수 = 3으로도 떨어지고 8로도 나누어떨어지는것
		// 최소공배수 = 그 중에서 제일작은 수
		int num=1;
		int minNum=0;
		while(num<=100) {
			if(num%3==0 && num%8==0) { // 3과 8로 각각 나누어 나머지가 0이어야함
				System.out.println("공배수 : "+num);
				if(minNum==0)
					minNum = num; //공배수 중의 최솟값이므로 최초 출현한 공배수가 최소 공배수임
			}
			num++;
		}
		System.out.println("최소공배수 : "+minNum);
	}

}
