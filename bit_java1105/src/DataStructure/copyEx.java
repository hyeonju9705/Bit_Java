package DataStructure;

public class copyEx {

	public static void main(String[] args) {
		// for�� ������.. 
		int a[] = new int [5];
		int b[] = new int [5];
		//int reverseA[] = new int [5];
		System.out.println("������� ������ ���� ���");
		
		copy(a,b);
		System.out.println("�������� ������ ���� ���");
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
		//a[i]�� b[������]���� ��������
		int reverseA[] = new int [5];
		for(int i=0, j=b.length-1 ; j>=0; j--,i++) { //arr�迭�� ������ �ε���(arr.length-1)
			// -1���ϸ� �츮�� ������ ũ�⺸�� 1Ŀ���� ���� �� -1�ؾ��Ѵ�
			reverseA[i]=a[j];
			System.out.printf("a[%d] = %d, b[%d]=%d\n", i, a[i], i, reverseA[i]);
		}
	}

}
