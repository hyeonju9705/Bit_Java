package bit_java1108;

class Node{//�̰Թ������̴�??? ���� ,,,
	int data;
	Node next;
	Node(int data){
		this.data = data;
		this.next = null;
	}
}
class MyLinkedList{
	private Node head; // ����� ��ü�� �����ϴ� head
	public void add(int data) {
		Node newNode = new Node(data);
		if(head == null) { //������ head�� null�̸� ���ο� ��带 �߰�
			head = newNode;
			return;
		}
		Node current = head; // ������ ��尡 head���� �����ؼ�
		while(current.next!=null) { //������ ���� ������ �̵�
			current = current.next;
		}
		current.next = newNode; // ������ ��忡 ���Ӱ� ������ ��� �߰�
		
	}
	public boolean remove(int data) { // ����Ʈ�� ����� data �����ϱ�
		// �ߺ��� ���, ù��° data �����ϱ�
		Node current = head; // head = node�� �����ִ� ��
		if(current.data == data) {
			head = head.next;
			return true;
		}
		while(current.next!=null) {
			if(current.next.data == data) {
				current.next= current.next.next;
				return true;
			}
			current = current.next;
		}
		return false;
	}
	public void insert(Node prev, int data) {
		
	}
	public Node search(int data) {
		return head;
		
	}
	public String toString() {
		if(head == null) {
			return "[]";
		}
		Node temp = head;
		String str = "[";
		while(temp.next!=null) {
			str +=temp.data+",";
			temp = temp.next;
		}
		str+= temp.data;
		return str+"]";
	}
}
public class MyLinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList ll = new MyLinkedList();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		System.out.println(ll); // ll.toString()�ѰŶ� ����
		//remove�� ������ �ٽ� ����ϱ�
		ll.remove(2);
		System.out.println(ll);
	}

}
