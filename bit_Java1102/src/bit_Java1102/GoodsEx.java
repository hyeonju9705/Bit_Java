package bit_Java1102;

class Goods{  //field�� ����
	public String name; //�����߸� goods.java �ּ��ȵǾ��־ Ŭ���� �ΰ���� �ߴ°�
	public int price;
	public int numberOfStock;
	public int sold;
}

public class GoodsEx {

	public static void main(String[] args) {
		// goods.java�� ����..
		Goods shampoo = new Goods(); // ����, new�� �Բ� ������ ȣ��
		//�����ڰ� ���ǵǾ� ���� ���� ���
		//�����Ϸ��� �⺻ �����ڸ� ���� ȣ��
		shampoo.name="����ƾ";
		shampoo.price=13000;
		shampoo.numberOfStock=30;
		shampoo.sold=50;
		System.out.printf("��ǰ �̸� : %s\n", shampoo.name);
		System.out.println("��ǰ ���� : "+shampoo.price);
		System.out.println("��� ���� : "+shampoo.numberOfStock);
		System.out.println("�ȸ� ���� : "+shampoo.sold);

	}

}
