package PM3;

class Rect{
	int width;
	int height;
	
	public Rect(int width, int height) {
		this.width=width;
		this.height=height;
	}
	public boolean equals(Rect r) { //�簢������ �񱳸� �ؾ��ϴϱ� Rect r�� �Է¹���, (Rect �� width�� height�� �ڵ����� ���Ƿ�)
		int area=width*height; //���Ⱑ �̻��ؼ��ȵǴ°Ű�����
		return area==(r.height*r.width); 
		//
	}
}
public class RectEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect r1 = new Rect(2,6);
		Rect r2 = new Rect(3,4);
		Rect r3 = new Rect(2,4);
		if(r1.equals(r2))
			System.out.println("r1�� r2�� ���� �����ϴ� �� �簢���� ������ ����");
		else
			System.out.println("r1�� r2�� ���� �����ϴ� �� �簢���� ������ �ٸ�");
		if(r1.equals(r3))
			System.out.println("r1�� r3�� ���� �����ϴ� �� �簢���� ������ ����");
		else
			System.out.println("r1�� r3�� ���� �����ϴ� �� �簢���� ������ �ٸ�");
	} //�־ȵ�,,,

}
