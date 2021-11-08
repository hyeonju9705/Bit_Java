package bit_java1108;

import java.util.Random;
import java.util.Scanner;

class MyStack{
	private int tos = -1; // top of stack�� -1�� �ʱ�ȭ
	private int[] stk; //stack �迭 ����
	private int capa; //������ �뷮 : ���ÿ� ���� �� �ִ� �ִ� ������ ��
	
	public MyStack(int capa) {
		stk= new int[capa]; //�迭�� ����������Ѵ�
		this.capa=capa;
	}
	public void push(int element) {
		//�� �����ϴ°�,,
		stk[++tos]=element; //�迭�� �ε����� �ϳ� ������ָ鼭 ���ο� ���� �־��ش�.
	}
	public int pop() {
		// ���� �������� ���� ���� ����
		// ��Ի�����,,,???????? ������ ��
		return stk[tos--]; //���� �迭�� ����Ǿ��ִ� ������ top of stack�� ���� �ϳ� ���ָ� ���� ����ϸ鼭
		//�� ���� ������ ������ tos�� -1�� �ǹǷ� �����Ǵ� �� ó�� ����
	}
	public int peek() {
		//stack ���� ���������� ����� ��Ҹ� Ȯ��
		return stk[tos];
	}
	public void clear() {
		//stack�� ��� ��ҵ��� ������, tos�� �ʱⰪ����
		tos=-1;
	}
	public int capacity() {
		//stack�� �뷮�� ��ȯ
		return tos;
	}
	public boolean isEmpty() {
		if(tos == -1) //tos = -1�� �ʱⰪ�̱� ������ -1�̶�� �ƹ��͵� �ȵ� ���̹Ƿ� true����
			return true;
		else
			return false;
	}
	public boolean isFull() {
		if(tos ==capa-1) { //capa�� �迭�� length�� ����� �����̴ϱ� top of stack�� �� ������ �ε������?? true
			return true;
		}else 
			return false;
	}
	public int size() {
		//���ÿ� ����� ����� ���� ��ȯ
		return tos+1; //tos�� ó���� -1�̴ϱ� +1���ش�
	}
	public void dump() {
		//���ÿ� �׿��ִ� �����͸� ����� ������� ���
		//stk[n] : nn�� ���·� ���
		for(int i=0; i<tos+1; i++) {//tos +1�� �ؾ� �� ��µǹǷ�
		System.out.printf("stk[%d] : %d\n",i,stk[i] ); //stk[i]�� �´� ������ �ƹ��͵� �ȵ���������� -1�̹Ƿ� ������
		}
	}
}
public class StackEx {

	public static void main(String[] args) {
		// stk = new int[capa];
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("������ ũ�⸦ �Է��ϼ��� >> ");
		int capa = scan.nextInt();
		MyStack mystk = new MyStack(capa); //���� ���� - MyStack Ŭ������ ������ �ʱ�ȭ
		do { // ������ ������ ������ ���ÿ� �����͸� Ǫ��
			mystk.push(rand.nextInt(100)+1); // �������� �־���
		} while(!mystk.isFull()); //full�� �ƴҶ����� �����͸� �־��ش�
		
		mystk.dump(); //������ ��ҵ��� ���� �Էµ� ������� ���
		for(int i=0; i<capa; i++) { //capa�� �迭�� length��� �����
			System.out.printf("%d��° ���� �� : %d\n", i+1, mystk.pop()); //i+1�� ���� ������ ó���� tos�� -1�̾
		}
	}

}
