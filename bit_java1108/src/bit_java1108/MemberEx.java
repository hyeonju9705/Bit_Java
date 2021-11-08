package bit_java1108;
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
public class MemberEx {

	public static void main(String[] args) {
		Member[] mArr= {
				new Member("conan", "010-1111-1111", "Mirans"),
				new Member("rose", "010-2222-2222", "Browns"),
				new Member("miran", "010-3333-3333", "Mirans")
				};
		System.out.println("3���� �����͸� ������ ���� ����Ʈ ��� ���");
		for(Member mem : mArr) // 3���� ����� mem ������ �����ϰ� �������
			System.out.println(mem);
		Member[] tempArr = new Member[mArr.length+1]; //������ �ϱ� ���ؼ��� mArr���� 1 ū �迭�� �ʿ�
		for(int i=0; i<mArr.length; i++) {
			tempArr[i]=mArr[i]; //�ӽ� �迭�� ����
		}
		int targetIndex = 0; //���� ��ġ , �� �������� �߰��Ϸ��� �Ѵٸ� �̵��� �߻����� �����Ƿ� ���� �ڵ�δ� �������
		if(targetIndex < mArr.length) { //�̵��� �߻��ϴ� ����
			for(int i=mArr.length; i>=0; i--) { //0�� ��ġ�� ����� �����ϱ� ���ؼ� ��ҵ��� �ڷ� �̵�
				if(i==targetIndex-1) continue; //�����ϰ� ���� ��ġ(targetIndex)�� i���� 1�۴ٸ� ��� ����
				else if(i>targetIndex) tempArr[i]=mArr[i-1]; //������ ��ġ �ڿ� �ִ� ��ҵ��� �ڷ� �̵� (tempArr�� ���̸� ��ĭ�� �÷������ϱ�
				// �տ� ������ �ڸ��� �߰��ؾ��ϱ⶧���� targetIndex���� �ڿ��մ� ����� ��ĭ�� �ڷ� �̵���Ŵ
				else tempArr[i]=mArr[i]; //������ ��ġ �տ� �ִ� ��ҵ��� �״�� ����
			}
			//�����ϰ� ���� �ε��� �ڸ��� null�� �ǰ� �������� �� ����������
			tempArr[targetIndex] = new Member("kid", "010-4444-4444", "unkown");
		}
		mArr = tempArr; //��ü �迭 ����
		System.out.println("------------------------------");
		System.out.printf("�ε��� %d�� ��ġ�� ī�带 ������ �� ���� ����Ʈ ��� ���\n", targetIndex);
		for(Member mem : mArr)
			System.out.println(mem);
		}
	

}
