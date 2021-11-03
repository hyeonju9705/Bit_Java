package bit_Java1102;

import java.util.Scanner;

class Goods2{  //field만 잇음
	public String name; //오류뜨면 goods.java 주석안되어있어서 클래스 두개라고 뜨는것
	public int price;
	public int numberOfStock;
	public int sold;
}

public class GoodsEx2 {

	public static void main(String[] args) {
		//생성자가 정의되어 있지 않은 경우
		//컴파일러가 기본 생성자를 만들어서 호출
		//노랑 = 입력, 하양= 출력
		
		Scanner scan = new Scanner(System.in);
		Goods2[] gArray = new Goods2[3];
		for(int i=0; i<gArray.length; i++) {
			gArray[i]= new Goods2(); //goods2 객체 생성후 참조
			gArray[i].name = scan.next();
			gArray[i].price = scan.nextInt();
			gArray[i].numberOfStock = scan.nextInt();
			gArray[i].sold = scan.nextInt();
		}
		System.out.println("상품명 가격 재고량 판매량");
		for(int i=0; i<gArray.length; i++)
		System.out.printf("%s %d %d %d\n",
				gArray[i].name,
				gArray[i].price,
				gArray[i].numberOfStock,
				gArray[i].sold);
		

	}

}
