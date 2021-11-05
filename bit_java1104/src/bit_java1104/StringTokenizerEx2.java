package bit_java1104;

public class StringTokenizerEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StringTokenizer st = new StringTokenizer("È«±æµ¿/ÀåÈ­/È«·Ã/ÄáÁã/ÆÏÁã", "/"); //&³ª =·Î ³ª´©´Â°Å°°À½
//		while(st.hasMoreTokens())
//			System.out.println(st.nextToken());
		 
		
		//?????????º¹½À ¤Ð¤Ð
		String[] arr = "È«±æµ¿/ÀåÈ­/È«·Ã/ÄáÁã/ÆÏÁã".split("/");
		//String st= "È«±æµ¿/ÀåÈ­/È«·Ã/ÄáÁã/ÆÏÁã";
		for(int i=0; i<5; i++) {
			System.out.println(arr[i]);
		}
	}

}
