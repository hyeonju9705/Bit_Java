package bit_java1110;

import java.io.File;

public class FileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("c:/temp/test2.txt");
		
		File file2 = new File("c:/windows/system.ini");
		String res;
		if(file2.isFile())
			res = "파일";
		else
			res = "디렉터리";
		System.out.println(file2.getPath()+"은"+res+"입니다.");
		
		File file3 = new File("c:/windows");
		File[] fs = file3.listFiles(); //file 리스트를 전부 반환하는 것 = listFiles()
		for(File f : fs)
			if(f.isDirectory()) //디렉토리면 dir : 로 출력, 아니면 file : 로 출력
				System.out.printf("dir : %s\n", f);
			else
				System.out.printf("file : %s(%d bytes)\n", f, f.length());
	}

}
