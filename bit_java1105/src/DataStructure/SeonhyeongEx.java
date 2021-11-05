package DataStructure;

import java.util.Scanner;

public class SeonhyeongEx { //내가 만든 방법은 너무 복잡하니 이거 진짜 꼭 외우기 ㅜㅜ

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int iArr[] = new int[5];
		for(int i=0; i<iArr.length; i++) {
			iArr[i]=(int)(Math.random()*100)+1;
			System.out.println(iArr[i]);
		}
		System.out.print("검색할 값을 입력하세요 >> ");
		int num = scan.nextInt();
		seqSearch(iArr,num);
		if(seqSearch(iArr,num)==-1) {
			System.out.printf("%d는 배열에 존재하지 않음",num); 
		} else {
			System.out.printf("%d는 인덱스 %d에 위치함", num,seqSearch(iArr,num));
		}
		
		
	}
	public static int seqSearch(int[] iArray, int key) { //return 이 굉장히 중요함
		//int count=0;
//		for (int i=0; i<iArray.length; i++) {
//			if(iArray[i]==key) {
//				System.out.printf("%d는 인덱스 %d에 위치함", key,i);
//				count++;
//			} 
//		}
//		if(count==0) {
//			System.out.printf("%d는 배열에 존재하지 않음",key);
//		}
		for (int i=0; i<iArray.length; i++) {
			if(iArray[i]==key) {
				//System.out.printf("%d는 인덱스 %d에 위치함", key,i);
				//count++; 카운트 쓸 필요 없음...! 찾자마자 바로 return 해주면됨...
				return i;
			} 
		}
//		if(count==0) {
//			System.out.printf("%d는 배열에 존재하지 않음",key);
//			return -1;
//		}
		return -1;
	}
}
