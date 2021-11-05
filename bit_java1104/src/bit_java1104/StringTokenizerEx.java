package bit_java1104;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer("name=conan&addr=ran's&age=10", "&="); //&나 =로 나누는거같음
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
	}

}
