package DataStructure;

public class MaxEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[5];
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		
		max(arr);
		
		System.out.printf("�ִ밪 : %d",max(arr));
		
		
		
		
		
	}
	//static �޼ҵ�� main�޼ҵ� �ۿ� �ٰ� �ۼ�,,,
	
	public static int max(int[] arr ) {
		int max=0;
//		System.out.printf("�迭�� ����� ���� intArray[%d]=%d\n", i,arr[i]);
		for(int i = 0; i<arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}

}
