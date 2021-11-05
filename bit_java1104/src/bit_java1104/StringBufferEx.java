package bit_java1104;

public class StringBufferEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb.hashCode());
		sb.append(" is pencil");
		System.out.println(sb);
		
		sb.insert(7, "my"); //This ismypencil
		System.out.println(sb);
		
		sb.replace(8,10, "your");
		System.out.println(sb);
		
		sb.setLength(5);
		
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
		String[] strArray="This is my pencil".split(" ");
		for(int i=0; i<strArray.length; i++) {
			System.out.println(strArray[i]);
		}
	}

}
