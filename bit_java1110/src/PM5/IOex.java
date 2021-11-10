package PM5;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class IOex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		PrintWriter pw = null;
		String line = null; //입력된 한 라인을 참조할 변수 선언
		try {
			br=new BufferedReader(new InputStreamReader(System.in)); //콘솔 입력
			pw = new PrintWriter(new FileWriter("c:/temp/test4.txt"));
			while((line=br.readLine())!= null) {
				System.out.println(line); //콘솔 출력
				pw.println(line); //파일에 출력
			}
			pw.close();
		} catch(IOException e) {}
	}

}
