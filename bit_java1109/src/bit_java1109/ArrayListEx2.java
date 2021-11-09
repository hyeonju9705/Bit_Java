package bit_java1109;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		ArrayList<String> al = new ArrayList<String>();
		
		String name=null;
		for(int i=0; i<4; i++) {
		System.out.print("이름을 입력하세요 >>");
		name=scan.next();
		al.add(name);
		}
		
		Object[] a = al.toArray();
		for(int i=0; i<a.length; i++) {
		System.out.print(a[i]+ " ");
		}
		//get(int index) 저장된 인덱스의 요소 반환
		int longestIndex =0;
		for(int i=0; i<a.length; i++) {
			if(al.get(longestIndex).length()<al.get(i).length()) //index 제일긴 인덱스 0에 저장된 것의 length보다 int 0에 저장된 것의 length이 크다면
				longestIndex=i; //i가 더 큰거니까 i가 longestIndex가 되고
		}
		
		System.out.print("가장 긴 이름은 : "+al.get(longestIndex)); //인덱스 번호가 반환되기 땜에 get(인덱스번호)로 가져와서 보여줌
	}

}
