package bit_java1108;

class Node{//이게무슨말이니??? 복습 ,,,
	int data;
	Node next;
	Node(int data){
		this.data = data;
		this.next = null;
	}
}
class MyLinkedList{
	private Node head; // 노드라는 객체를 참조하는 head
	public void add(int data) {
		Node newNode = new Node(data);
		if(head == null) { //현재의 head가 null이면 새로운 노드를 추가
			head = newNode;
			return;
		}
		Node current = head; // 현재의 노드가 head부터 시작해서
		while(current.next!=null) { //다음이 없을 때까지 이동
			current = current.next;
		}
		current.next = newNode; // 마지막 노드에 새롭게 생성한 노드 추가
		
	}
	public boolean remove(int data) { // 리스트에 저장된 data 제거하기
		// 중복된 경우, 첫번째 data 제거하기
		Node current = head; // head = node가 갖고있는 값
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
		System.out.println(ll); // ll.toString()한거랑 같음
		//remove한 다음에 다시 출력하기
		ll.remove(2);
		System.out.println(ll);
	}

}
