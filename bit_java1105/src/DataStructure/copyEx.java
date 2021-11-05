package DataStructure;

public class copyEx {

	public static void main(String[] args) {
		// for문 돌리기.. 
		int a[] = new int [5];
		int b[] = new int [5];
		//int reverseA[] = new int [5];
		System.out.println("순서대로 복사한 후의 결과");
		
		copy(a,b);
		System.out.println("역순으로 복사한 후의 결과");
		rcopy(a,b);
	}
	
	public static void copy(int[] a, int b[]) {
		for(int i=0; i<a.length; i++) {
			a[i]=(int)(Math.random()*100)+1;
			b[i]=a[i];
			System.out.printf("a[%d] = %d, b[%d]=%d\n", i, a[i], i, b[i]);
		}
	}
	public static void rcopy(int[]a, int b[]) {
		//a[i]를 b[마지막]으로 보내야해
		int reverseA[] = new int [5];
		for(int i=0, j=b.length-1 ; j>=0; j--,i++) { //arr배열의 마지막 인덱스(arr.length-1)
			// -1안하면 우리가 생각한 크기보다 1커지기 땜에 꼭 -1해야한다
			reverseA[i]=a[j];
			System.out.printf("a[%d] = %d, b[%d]=%d\n", i, a[i], i, reverseA[i]);
		}
	}

}
