package DataStructure;

import java.util.Scanner;

public class TwoJinEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("데이터를 오름차순으로 입력하시오 >>");
		int iArr[]= new int[11]; 
		
		for(int i=0; i<iArr.length; i++) {
		iArr[i]=scan.nextInt();
		System.out.printf("iArray[%d]=%d\n",i,iArr[i]); //입력받은걸 배열에 순서대로 저장
		}
		
		System.out.print("검색할 값을 입력하세요 >> ");
		int num = scan.nextInt(); //검색할 값 저장할 변수 num
		binSearch(iArr,num); // num과 배열로 binSearch호출
		
		if(binSearch(iArr,num)==-1) { //-1이 리턴된다면? 없는것이므로 없다고 출력
			System.out.printf("%d는 배열에 존재하지 않음",num); 
		} else { // -1을 리턴하지 않았다면 존재했다는 뜻이므로 return받은 인덱스값과 숫자를 출력해줌
			System.out.printf("%d는 인덱스 %d에 위치함", num,binSearch(iArr,num));
		}
	}
	public static int binSearch(int [] iArray, int key) {
		for (int i=0; i<iArray.length; i++) {
			if(iArray[i]==key) { //for문이 일단 배열의 크기만큼 돌아가는데 여기서 입력한 값이 배열[i]값과 일치한다면?
				return i; //인덱스값 리턴
			} 
		}
		return -1; //for문이 끝났는데 못찾은거면 return을 못해준거니 자동으로 return -1
	}
}
