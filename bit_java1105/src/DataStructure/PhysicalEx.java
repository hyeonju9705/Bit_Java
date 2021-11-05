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
public class PhysicalEx { //같은 시력이 있는애가 누적되도록.....,...
	static final int VMAX = 21; //시력분포 0.0에서 0.1단위로 21개
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		PhysicalInfo[] pArr=new PhysicalInfo[6];
		int[] dist = new int [VMAX];
		
		for(int i=0; i<pArr.length; i++) {
			pArr[i]=new PhysicalInfo(scan.next(), scan.nextInt(), scan.nextDouble()); //배열에 저장
		}
		System.out.printf("평균키 : %.1fcm\n", avgHeight(pArr));
		System.out.println("시력 분포");
		
		distVision(pArr,dist); //호출할 때는 정말 배열을 호출하라고 static void에다가 만들어줬으니까 이렇게 호출한다
//		for(double i=0; i<=VMAX; i++) {
//			
//			
//		} 
		//일단 시력을 저장을 하는데 일치하면 count를 ++해준다...
	}
	public static double avgHeight(PhysicalInfo[] info) {
		//평균 키를 구하여 반환
		double sum=0;
		for(int i=0; i<info.length; i++) {
			sum+=info[i].height;
		}
		return sum/info.length;
	}
	public static void distVision(PhysicalInfo[] dat, int[] dist) {
		//dist는 해당 영역에 시력이 분포된 사람 수를 저장하는 배열
		int i=0;
		dist[i]=0;
		for(i=0; i<dat.length; i++) {
			if(dat[i].vision>=0.0 && dat[i].vision<=VMAX/10.0) { //시력이 0.0~2.0이어야지만 저장
				dist[(int)(dat[i].vision*10)]++; //이게 무슨말이냐면
				//만약에 dat[i]의 vision이 0.6이라치면 0.0부터 시력이있으니까 0.6은 6번째배열이라 배열의 수를 ++해준다는거야
				//그니까 dist배열에는 정말 사람의 수!만 들어있는거지
			}
		}
		for(i=0; i<VMAX; i++) {
		System.out.printf("%.1f~ : %d명\n", i/10.0, dist[i]);
		}
	}

}
