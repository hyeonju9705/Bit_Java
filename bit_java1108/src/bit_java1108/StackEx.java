package bit_java1108;

import java.util.Random;
import java.util.Scanner;

class MyStack{
	private int tos = -1; // top of stack을 -1로 초기화
	private int[] stk; //stack 배열 생성
	private int capa; //스택의 용량 : 스택에 쌓을 수 있는 최대 데이터 수
	
	public MyStack(int capa) {
		stk= new int[capa]; //배열을 생성해줘야한다
		this.capa=capa;
	}
	public void push(int element) {
		//값 삽입하는것,,
		stk[++tos]=element; //배열의 인덱스를 하나 만들어주면서 새로운 값을 넣어준다.
	}
	public int pop() {
		// 가장 마지막에 들어온 값을 빼줌
		// 어떻게빼주지,,,???????? 밑줄이 답
		return stk[tos--]; //스택 배열에 저장되어있는 마지막 top of stack의 값을 하나 빼주면 값을 출력하면서
		//이 행이 실행이 끝나면 tos가 -1이 되므로 삭제되는 것 처럼 보임
	}
	public int peek() {
		//stack 에서 마지막으로 저장된 요소를 확인
		return stk[tos];
	}
	public void clear() {
		//stack의 모든 요소들을 제거함, tos는 초기값으로
		tos=-1;
	}
	public int capacity() {
		//stack의 용량을 반환
		return tos;
	}
	public boolean isEmpty() {
		if(tos == -1) //tos = -1이 초기값이기 때문에 -1이라면 아무것도 안들어간 것이므로 true리턴
			return true;
		else
			return false;
	}
	public boolean isFull() {
		if(tos ==capa-1) { //capa가 배열의 length랑 비슷한 개념이니까 top of stack이 맨 마지막 인덱스라면?? true
			return true;
		}else 
			return false;
	}
	public int size() {
		//스택에 저장된 요소의 개수 반환
		return tos+1; //tos가 처음에 -1이니까 +1해준다
	}
	public void dump() {
		//스택에 쌓여있는 데이터를 저장된 순서대로 출력
		//stk[n] : nn의 형태로 출력
		for(int i=0; i<tos+1; i++) {//tos +1을 해야 다 출력되므로
		System.out.printf("stk[%d] : %d\n",i,stk[i] ); //stk[i]가 맞는 이유는 아무것도 안들어있을때만 -1이므로 ㅇㅋ임
		}
	}
}
public class StackEx {

	public static void main(String[] args) {
		// stk = new int[capa];
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("스택의 크기를 입력하세요 >> ");
		int capa = scan.nextInt();
		MyStack mystk = new MyStack(capa); //스택 생성 - MyStack 클래스의 생성자 초기화
		do { // 스택이 가득찰 때까지 스택에 데이터를 푸쉬
			mystk.push(rand.nextInt(100)+1); // 랜덤으로 넣어줌
		} while(!mystk.isFull()); //full이 아닐때까지 데이터를 넣어준다
		
		mystk.dump(); //스택의 요소들을 먼저 입력된 순서대로 출력
		for(int i=0; i<capa; i++) { //capa는 배열의 length라고 보면됨
			System.out.printf("%d번째 팝한 값 : %d\n", i+1, mystk.pop()); //i+1을 해준 이유는 처음에 tos가 -1이어서
		}
	}

}
