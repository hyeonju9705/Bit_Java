package ThreePM1029;
import java.util.Scanner; // 임포트문, 클래스 영역 바깥에 있음
//ctrl+shift+o : import 단축키
public class InputEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);//스캐너 타입의 객체를 참조하는 변수 scan
		System.out.print("정수를 입력하세요 >>");
		int num = scan.nextInt(); //입력 장치로부터 정수를 읽어옴
		System.out.printf("입력받은 수는 %d ", num);
		
		scan.nextInt();
		scan.close(); //스캐너를 사용한 다음에 자원을 해제함
	}

}
