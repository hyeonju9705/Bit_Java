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
		String line = null; //�Էµ� �� ������ ������ ���� ����
		try {
			br=new BufferedReader(new InputStreamReader(System.in)); //�ܼ� �Է�
			pw = new PrintWriter(new FileWriter("c:/temp/test4.txt"));
			while((line=br.readLine())!= null) {
				System.out.println(line); //�ܼ� ���
				pw.println(line); //���Ͽ� ���
			}
			pw.close();
		} catch(IOException e) {}
	}

}
