package Homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BindoEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader word = null; //사용자가 찾고싶은 단어 초기화
		File src = new File("c:/temp/dorian.txt"); //우리가 단어를 찾을 파일
		String line = null; //입력된 한 라인을 참조할 변수 선언
		
		while(true) {
			System.out.print("찾고싶은 단어는 무엇입니까?");
			
			try {
				int count=0; //몇번 사용됐는지 알 수 있는 변수
				word=new BufferedReader(new InputStreamReader(System.in)); //콘솔 입력한거 읽는 도구를 지정해줌.
				BufferedReader fr = new BufferedReader(new FileReader(src)); //파일을 읽어온다
				String find=word.readLine(); // find가 word를 라인으로 진짜 읽는거임 이게 진짜 읽는것.
				
				while((line=fr.readLine())!= null) { //fr의 라인이 없어질때까지 while문 돌려라
					line=line.toLowerCase(); //일단 fr을 읽은 한 줄 자체를 소문자로 만들어라
					String[] splited = line.split(",|\\.|'|\"| "); //쪼개서 배열에 저장 , . ' " 띄어쓰기로 다 쪼개
					for(int i=0; i<splited.length; i++) { //배열의 길이만큼 for문 돌리고
						if(find.toLowerCase().equals(splited[i])) {//find가 word를 라인으로 읽은 한 줄 이니까 이것도 소문자로
							//만든 다음에 이 소문자와 소문자로 쪼개져있는 splited[i]랑 다 비교를 해서 이거랑 같으면?
						count++; //횟수를 ++해라
						}
					}
				}
				
				if(count==0)
					System.out.println("한번도 사용한 적 없음");
				else
					System.out.printf("%d번 사용됨\n",count);
					
			} catch(IOException e) {}
		}
	}

}
