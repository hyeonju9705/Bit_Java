package DataStructure;

import java.util.Scanner;

class PhysicalInfo{
	String name;
	int height;
	double vision;
	
	public PhysicalInfo() {
		
	}
	public PhysicalInfo(String name, int height, double vision) {
		this.name=name;
		this.height=height;
		this.vision=vision;
	}
}
public class PhysicalEx { //���� �÷��� �ִ¾ְ� �����ǵ���.....,...
	static final int VMAX = 21; //�÷º��� 0.0���� 0.1������ 21��
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		PhysicalInfo[] pArr=new PhysicalInfo[6];
		int[] dist = new int [VMAX];
		
		for(int i=0; i<pArr.length; i++) {
			pArr[i]=new PhysicalInfo(scan.next(), scan.nextInt(), scan.nextDouble()); //�迭�� ����
		}
		System.out.printf("���Ű : %.1fcm\n", avgHeight(pArr));
		System.out.println("�÷� ����");
		
		distVision(pArr,dist); //ȣ���� ���� ���� �迭�� ȣ���϶�� static void���ٰ� ����������ϱ� �̷��� ȣ���Ѵ�
//		for(double i=0; i<=VMAX; i++) {
//			
//			
//		} 
		//�ϴ� �÷��� ������ �ϴµ� ��ġ�ϸ� count�� ++���ش�...
	}
	public static double avgHeight(PhysicalInfo[] info) {
		//��� Ű�� ���Ͽ� ��ȯ
		double sum=0;
		for(int i=0; i<info.length; i++) {
			sum+=info[i].height;
		}
		return sum/info.length;
	}
	public static void distVision(PhysicalInfo[] dat, int[] dist) {
		//dist�� �ش� ������ �÷��� ������ ��� ���� �����ϴ� �迭
		int i=0;
		dist[i]=0;
		for(i=0; i<dat.length; i++) {
			if(dat[i].vision>=0.0 && dat[i].vision<=VMAX/10.0) { //�÷��� 0.0~2.0�̾������ ����
				dist[(int)(dat[i].vision*10)]++; //�̰� �������̳ĸ�
				//���࿡ dat[i]�� vision�� 0.6�̶�ġ�� 0.0���� �÷��������ϱ� 0.6�� 6��°�迭�̶� �迭�� ���� ++���شٴ°ž�
				//�״ϱ� dist�迭���� ���� ����� ��!�� ����ִ°���
			}
		}
		for(i=0; i<VMAX; i++) {
		System.out.printf("%.1f~ : %d��\n", i/10.0, dist[i]);
		}
	}

}
