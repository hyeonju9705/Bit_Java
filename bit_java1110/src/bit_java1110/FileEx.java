package bit_java1110;

import java.io.File;

public class FileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("c:/temp/test2.txt");
		
		File file2 = new File("c:/windows/system.ini");
		String res;
		if(file2.isFile())
			res = "����";
		else
			res = "���͸�";
		System.out.println(file2.getPath()+"��"+res+"�Դϴ�.");
		
		File file3 = new File("c:/windows");
		File[] fs = file3.listFiles(); //file ����Ʈ�� ���� ��ȯ�ϴ� �� = listFiles()
		for(File f : fs)
			if(f.isDirectory()) //���丮�� dir : �� ���, �ƴϸ� file : �� ���
				System.out.printf("dir : %s\n", f);
			else
				System.out.printf("file : %s(%d bytes)\n", f, f.length());
	}

}
