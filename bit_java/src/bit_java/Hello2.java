package bit_java;
//식별자 명명 규칙과 관례
public class Hello2 {
	//class 이름하고 생성되는 소스코드의 이름은 동일( 모든 경우에 해당하는 것은 아님) : 클래스 이름 바꿀때 문제날 수 있다는뜻,,
	public int getAge1() { return 0; } //getAge()라는 이름의 메소드 선언, 다른 메소드 내부에는 메소드 선언 불가
	
	public static void main(String[] args) {// 메인메소드 시작
		// TODO Auto-generated method stub
		
		boolean isEmptyTrue;
		boolean isEmpty;
		String strName; //strName이라는 이름의 변수를 문자열(String type)로 선언
		
		final int NUMBER_ONE = 1; // 프로그램 영역 내에서 바뀌지 않음 , 상수
		final double PI = 3.141592;
		
	}
	public int getAge2() { return 0; } //getAge()라는 이름의 메소드 선언, 다른 메소드 내부에는 메소드 선언 불가
	public int getAge3() {return 0; } //다른 메소드 영역 바깥, 클래스 내부에 선언 가능
}
