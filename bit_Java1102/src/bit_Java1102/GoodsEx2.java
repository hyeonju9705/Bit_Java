package bit_Java1102;

import java.util.Scanner;

class Goods2{  //field�� ����
	public String name; //�����߸� goods.java �ּ��ȵǾ��־ Ŭ���� �ΰ���� �ߴ°�
	public int price;
	public int numberOfStock;
	public int sold;
}

public class GoodsEx2 {

	public static void main(String[] args) {
		//�����ڰ� ���ǵǾ� ���� ���� ���
		//�����Ϸ��� �⺻ �����ڸ� ���� ȣ��
		//��� = �Է�, �Ͼ�= ���
		
		Scanner scan = new Scanner(System.in);
		Goods2[] gArray = new Goods2[3];
		for(int i=0; i<gArray.length; i++) {
			gArray[i]= new Goods2(); //goods2 ��ü ������ ����
			gArray[i].name = scan.next();
			gArray[i].price = scan.nextInt();
			gArray[i].numberOfStock = scan.nextInt();
			gArray[i].sold = scan.nextInt();
		}
		System.out.println("��ǰ�� ���� ��� �Ǹŷ�");
		for(int i=0; i<gArray.length; i++)
		System.out.printf("%s %d %d %d\n",
				gArray[i].name,
				gArray[i].price,
				gArray[i].numberOfStock,
				gArray[i].sold);
		

	}

}
