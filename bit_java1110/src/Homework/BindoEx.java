package Homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BindoEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader word = null; //����ڰ� ã����� �ܾ� �ʱ�ȭ
		File src = new File("c:/temp/dorian.txt"); //�츮�� �ܾ ã�� ����
		String line = null; //�Էµ� �� ������ ������ ���� ����
		
		while(true) {
			System.out.print("ã����� �ܾ�� �����Դϱ�?");
			
			try {
				int count=0; //��� ���ƴ��� �� �� �ִ� ����
				word=new BufferedReader(new InputStreamReader(System.in)); //�ܼ� �Է��Ѱ� �д� ������ ��������.
				BufferedReader fr = new BufferedReader(new FileReader(src)); //������ �о�´�
				String find=word.readLine(); // find�� word�� �������� ��¥ �д°��� �̰� ��¥ �д°�.
				
				while((line=fr.readLine())!= null) { //fr�� ������ ������������ while�� ������
					line=line.toLowerCase(); //�ϴ� fr�� ���� �� �� ��ü�� �ҹ��ڷ� ������
					String[] splited = line.split(",|\\.|'|\"| "); //�ɰ��� �迭�� ���� , . ' " ����� �� �ɰ�
					for(int i=0; i<splited.length; i++) { //�迭�� ���̸�ŭ for�� ������
						if(find.toLowerCase().equals(splited[i])) {//find�� word�� �������� ���� �� �� �̴ϱ� �̰͵� �ҹ��ڷ�
							//���� ������ �� �ҹ��ڿ� �ҹ��ڷ� �ɰ����ִ� splited[i]�� �� �񱳸� �ؼ� �̰Ŷ� ������?
						count++; //Ƚ���� ++�ض�
						}
					}
				}
				
				if(count==0)
					System.out.println("�ѹ��� ����� �� ����");
				else
					System.out.printf("%d�� ����\n",count);
					
			} catch(IOException e) {}
		}
	}

}
