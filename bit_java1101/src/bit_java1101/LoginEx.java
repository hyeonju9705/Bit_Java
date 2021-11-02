package bit_java1101;

import java.util.Scanner;

public class LoginEx {

	public static void main(String[] args) {
		// 회원 등록 시 사용한 아이디와 패스워드는 각각 conan과 1111임
		//소스코드 내부에 적절한 변수에 저장하여 조건식에 사용할 것
		//프로그램이 실행되면 사용자가 입력한 아이디와 패스워드를 입력
		//등록된 아이디와 패스워드와 비교한 다음 조건에 맞춰 로그인 성공 또는 로그인
		//실패를 다음과 같은 메시지로 출력하기
		// 문자열의 내용을 비교하는데 사용하는 메소드는 equals()임
		
		Scanner scan = new Scanner(System.in);
		System.out.print("사용자의 아이디 입력: ");
		String id = scan.next();
		System.out.print("사용자의 패스워드 입력: ");
		String pw = scan.next();
		if(id.equals("conan")) {
			if(pw.equals("1111")) {
				System.out.println("로그인에 성공하셨습니다.");
			} else {
				System.out.println("비밀번호에 틀렸습니다.");
			}
		} else {
			System.out.println("등록된 사용자가 아닙니다. 회원 정보를 확인하세요");
		}

	}

}
