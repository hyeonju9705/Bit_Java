package DataStructure;

public class SosuEx {

	public static void main(String[] args) {//�˰��� �����ϱ� �ٽ� �ϱ�...
		// TODO Auto-generated method stub
		int count=0;
		int nCount=0; //�������� ������ Ƚ��
		for(int num = 3; num<=1000; num+=2) { //1�� 2�� �Ҽ��ϱ� ���� ���̱����� 3���� �����ѵ�. 
			//�׸��� num+=2���ִ� ������ ¦���� �Ҽ��� �����ϱ� ���� ¦������ ������ �ʿ䰡 ��� Ȧ���� �����ַ���
			//�̷��� ����
			int i;
			
			for(i=2; i<Math.sqrt(num); i++) {
				if(num%i==0) {//������ �������� �Ҽ��� �����ϹǷ� �ݺ��� Ż��
					nCount++;
					break;
				}
			}
			if(num ==i){//�ڽ� �̿ܿ��� ������ �������� �����Ƿ� �Ҽ�
				//count++;
				System.out.printf("%d��° �Ҽ��� %d\n",count,num);
			}
		}
		System.out.println("�������� ������ Ƚ�� "+nCount);
	}

}
