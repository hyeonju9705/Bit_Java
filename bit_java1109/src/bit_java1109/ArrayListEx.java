package bit_java1109;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("one");
		al.add("two");
		al.add("three");//�׻� ������ �ε����� �߰���
		System.out.println(al.size());
		al.add(2,"stupid"); //insert���� ����
		
		System.out.println(al.get(2));
		
		al.add(5, "stupid");
		
		System.out.println("2�� ��ġ�� �����ϱ� ����");
		System.out.println(al.get(2));
		al.add(2,"stupid");
		
		System.out.println("1�� ��ġ �����ϱ� ����");
		System.out.println(al.get(1));
		al.remove(1);
		System.out.println("1�� ��ġ ������ ���� ");
		System.out.println(al.get(1));
		
		al.remove(10); //�����߻�
	}

}
