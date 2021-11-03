package bit_Java1102;

public class ArrayEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<args.length; i++)
			System.out.println(args[i]);
		
		for(String str : args) {
			System.out.println(str);
		}
		
		Random rand = new Random();
		int [] iArray = new int [10];
		for(int i=0; i<iArray.length; i++)
			iArray[i]= rand.nextInt(100)+1;
		
//		for(int i=0; i<i)
			
//		for(int i=0; i<Integer.parseInt(args[i]); i++) {
//			System.out.println(args[0]); //왜 난 안되지
//		}
	}

}
