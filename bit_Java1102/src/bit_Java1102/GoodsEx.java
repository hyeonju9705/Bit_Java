package bit_Java1102;

class Goods{  //field만 잇음
	public String name; //오류뜨면 goods.java 주석안되어있어서 클래스 두개라고 뜨는것
	public int price;
	public int numberOfStock;
	public int sold;
}

public class GoodsEx {

	public static void main(String[] args) {
		// goods.java의 정답..
		Goods shampoo = new Goods(); // 생성, new와 함께 생성자 호출
		//생성자가 정의되어 있지 않은 경우
		//컴파일러가 기본 생성자를 만들어서 호출
		shampoo.name="엘라스틴";
		shampoo.price=13000;
		shampoo.numberOfStock=30;
		shampoo.sold=50;
		System.out.printf("상품 이름 : %s\n", shampoo.name);
		System.out.println("상품 가격 : "+shampoo.price);
		System.out.println("재고 수량 : "+shampoo.numberOfStock);
		System.out.println("팔린 수량 : "+shampoo.sold);

	}

}
