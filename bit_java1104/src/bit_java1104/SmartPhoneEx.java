package bit_java1104;

public class SmartPhoneEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyButton btnCall = new MyButton() {
			public void click() {
				System.out.println("통화버튼이 눌렸음");
			}
		}; //통화용 익명 구현 객체생성
		btnCall.click();
		
		MyButton btnStop = new MyButton() {
			public void click() {
				System.out.println("통화종료버튼이 눌렸음");
			}
		}; //통화 종료용 익명 구현객체 생성
		btnStop.click();
	}

}
