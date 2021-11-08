package AM11;

class Member{
	private String name;
	private String phoneNo;
	private String addr;
	
	public Member(String name, String phoneNo, String addr) {
		this.name=name;
		this.phoneNo=phoneNo;
		this.addr=addr;
	}
	public String toString() {
		return String.format("%s %s %s", getName(), getPhoneNo(),getAddr());
	}
	public String getName() {
		return name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public String getAddr() {
		return addr;
	}
	public void remove() {
		
	}
}
public class RemoveEx {

	public static void main(String[] args) {
		Member[] mArr= {
				new Member("conan", "010-1111-1111", "Mirans"),
				new Member("rose", "010-2222-2222", "Browns"),
				new Member("miran", "010-3333-3333", "Mirans")
				};
		System.out.println("3���� �����͸� ������ ���� ����Ʈ ��� ���");
		for(Member mem : mArr) // 3���� ����� mem ������ �����ϰ� �������
			System.out.println(mem);
		Member[] tempArr = new Member[mArr.length-1]; //�����ͤ� �ϳ� �����Ҳ��ϱ� �̷��Ը����
		
		
		int targetIndex = 0; //���� ��ġ , �� �������� �߰��Ϸ��� �Ѵٸ� �̵��� �߻����� �����Ƿ� ���� �ڵ�δ� �������
		
		
		for(int i=0; i<mArr.length; i++) {
			tempArr[i]=mArr[targetIndex+1]; //������ �� ���� �ӽ� �迭�� ����
		}//���������..
		
		if(targetIndex < mArr.length) { //�̵��� �߻��ϴ� ����
			for(int i=targetIndex; i<tempArr.length; i++) { //0�� ��ġ�� ����� �����ϰ� ��ҵ��� ������ �̵�, null �Ѱ��� �ǵڷ��̵���Ŵ
					tempArr[i]=tempArr[i+1]; //�ʱ�ȭ�� ���� �� �ڷο���
				}
		}
		mArr = tempArr; //��ü �迭 ���� --> ���Ӱ� ��������??
		for(int i=0; i<mArr.length; i++) {
			mArr[i]=tempArr[i];
		}
		System.out.println("------------------------------");
		System.out.printf("�ε��� %d�� ��ġ�� ī�带 ������ �� ���� ����Ʈ ��� ���\n", targetIndex);
		for(Member mem : mArr)
			System.out.println(mem);

	}

}
