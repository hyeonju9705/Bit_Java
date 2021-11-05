package DataStructure;

public class SosuEx {

	public static void main(String[] args) {//알고리즘 개선하기 다시 하기...
		// TODO Auto-generated method stub
		int count=0;
		int nCount=0; //나눗셈을 실행한 횟수
		for(int num = 3; num<=1000; num+=2) { //1과 2는 소수니까 수를 줄이기위해 3부터 시작한듯. 
			//그리고 num+=2해주는 이유는 짝수는 소수가 없으니까 굳이 짝수까지 나눠줄 필요가 없어서 홀수만 나눠주려고
			//이렇게 설정
			int i;
			
			for(i=2; i<Math.sqrt(num); i++) {
				if(num%i==0) {//나누어 떨어지면 소수가 ㅇㅏ니므로 반복문 탈출
					nCount++;
					break;
				}
			}
			if(num ==i){//자신 이외에는 나누어 떨어지지 않으므로 소수
				//count++;
				System.out.printf("%d번째 소수는 %d\n",count,num);
			}
		}
		System.out.println("나눗셈을 실행한 횟수 "+nCount);
	}

}
