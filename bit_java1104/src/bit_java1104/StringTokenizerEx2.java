package bit_java1104;

public class StringTokenizerEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StringTokenizer st = new StringTokenizer("ȫ�浿/��ȭ/ȫ��/����/����", "/"); //&�� =�� �����°Ű���
//		while(st.hasMoreTokens())
//			System.out.println(st.nextToken());
		 
		
		//?????????���� �Ф�
		String[] arr = "ȫ�浿/��ȭ/ȫ��/����/����".split("/");
		//String st= "ȫ�浿/��ȭ/ȫ��/����/����";
		for(int i=0; i<5; i++) {
			System.out.println(arr[i]);
		}
	}

}
