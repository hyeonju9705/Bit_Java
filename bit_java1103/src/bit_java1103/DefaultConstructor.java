package bit_java1103;

public class DefaultConstructor {

	int x;
	public void setX(int x) { this.x=x;}
	public int getX() { return x;}
	public DefaultConstructor(int x) {this.x=x;}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultConstructor p = new DefaultConstructor(100); //��ü ����,
		//�ʵ���� ������ ��� 0���� �ʱ�ȭ
		System.out.println("�� �ϱ� ��"+p.getX());
		
		p.setX(3);
		System.out.println("�� �� ����"+p.getX());
		

}
}
