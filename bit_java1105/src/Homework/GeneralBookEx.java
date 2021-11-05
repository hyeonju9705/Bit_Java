package Homework;

public interface GeneralBook{
	public int size(String[] names); //����Ǿ��ִ� ������ ���� ��ȯ
	public String names();
	public String records();
	public boolean nameExist(String name);
	public void add(String name, String record);
	public void remove(String name, String record);
	public String[] get(String name);
	public String find(String record);
	public void print();
}

class ArrayedGeneralBook implements GeneralBook{
	private String[] names;
	private String[] records;
	
	public ArrayedGeneralBook(String[] names, String[] records) {
		this.names=names;
		this.records=records;
	}
	public int size(String[] names) {
		return names.length;//����Ǿ��ִ� ������ ���� ��ȯ
	}
	public String names() { //���� �̸��� �����ϰ� �ִ� �迭�� ������ ���ڿ��� ���� �� ��ȯ
		String returnName=""; //return�� ���� String�̾���ϱ⶧���� ���ο� ���� ��������..�Ф�
		for(String n : names) { // names�� �迭�� ������ �𸣴ϱ� �̷��� ����. �˾Ƽ� names�� ������ŭ
			//for�� ������
			n+=" ";
			returnName+=n;
		}
		return returnName; //�𸣰Ե�,,
		}
	@Override
	public String records() { //record�� �����Ŵ
		String returnRecord="";
		for(String s : records) {
//			s+=" ";
			returnRecord+=s;
		}
		return returnRecord;
	}
	@Override
	public boolean nameExist(String name) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void add(String name, String record) {
		//��Ͽ� ���� �̸��� ����� �Է¹޾� ����Ʈ�� �߰�
		//(���� �̸��� �����ϸ� �߰����� �ʰ� �޽��� ���, ����� �׻� �̸��� �������� ������������ �߰�)
		//int count=names.length-1;
		for(int i=0; i<names.length; i++) {//���� �̸��� �ִ��� �˻�����
			if(names[i].equals(name)) {
				System.out.println("���� �̸��� �̹� �����մϴ�.");
				break;
			}	
		}
		
		String[] stringTemp=new String[names.length+1]; //names���� �迭�� ũ�Ⱑ 1 ū �迭 ����
		//�ڹٴ� �߰��� �迭�� ũ�⸦ �ٲٴ°Ծȵȴٰ� ��..����
		//�׷��� �츮�� �ٽ� temp���ٰ� names�� ���� �������ٰ���...�̤�
		for(int i=0; i<names.length; i++) {
			stringTemp[i]=names[i]; //name�� index������ �ϴ� stringTemp�� ����
		}
		stringTemp[stringTemp.length-1]=name; //�̸� ������ �ε����� �־�����.
		
		String[] stringTemp2=new String[records.length+1];
		for(int i=0; i<records.length; i++) { //record�� index������ �ϴ� stringTemp�� ����
			stringTemp2[i]=records[i]; //records ����
		}
		records[records.length-1]=record; //���ڵ嵵 ������ �ε����� �־�Z��
		//���� �������� �ؾ���...�Ф�
		String temp=null;
		for(int i=0; i<stringTemp.length; i++) { //0~3��ŭ ���°ű��� = 4��
			for(int j=i; j<stringTemp.length; j++) { //1~3�� ���°��� =3��
			//int compare=names[i].compareTo(names[j]);
			if(names[i].compareTo(names[j])>0) { //i�� j���� �ڿ��־���ϸ�
				temp=names[i];
				names[i]=names[j];
				names[j]=temp; //i�� j�� �ڸ��� �ٲ��ش�.
				
				//�Ȱ��� records�� ���� �ε����� �ٲ����ϹǷ�
				temp=records[i];
				records[i]=records[j];
				records[j]=temp;
			}
			}
		}
	}
	@Override
	public void remove(String name, String record) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String[] get(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String find(String record) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
}
public class GeneralBookEx {

	public static void main(String[] args) {
		// add�� �߻��ϸ� �̸��� �������� ���������� �ؾ��Ѵ�. add�� �߻��ϸ� ������ �����̵�
		//���ڵ� �ߤ��� ����, �̸��� �ߺ� ��� xx
		// record�� ������ �̸� �������� �߰ߵǸ� �װ� �״�� ����
		//print�� �ϸ� 
		// names��� 
		// �迭�� ���̴� �׻� ��Ȯ�ϰ� ����Ǿ��ִ� ������ ���� ��ġ�Ǿ����
		
		//�÷���,arrays �Լ� �������� ���� for�� �Ἥ�ϱ�
		String[] names= {"Sam","Rhee","Kim"};
		String[] records= {"1111","2222","3333"};
		ArrayedGeneralBook gb = new ArrayedGeneralBook(names,records);
		System.out.println(gb.names()); //Sam Rhee Kim ���
		
		gb.add("Allan", "4444");
		gb.print();
		//Allan4444
		//Kim3333
		//Rhee2222
		//Sam1111
//		System.out.println("���� ����� �������� ũ�� : "+gb.size(names));
//		gb.add("Ajex", "5555");
//		System.out.println("���� ����� �������� ũ�� : "+gb.size());
//		gb.print();
//		//Allex5555
//		//Allan4444
//		//Kim3333
//		//Rhee2222
//		//Sam1111
//		System.out.println(gb.nameExist("Ajex")); //true
//		gb.remove("Ajex", "5555");
//		gb.remove("Sam", "1111");
//		gb.print();
//		//Allan4444
//		//Kim3333
//		//Rhee2222
//		String foundName = gb.find("4444");
//		System.out.println(foundName); //Allan
	}

}
