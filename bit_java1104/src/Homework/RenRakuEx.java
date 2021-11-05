package Homework;

import java.util.Scanner;

class Member{
	private String name;
	private String phoneNo;
	private String addr;
	
	public Member(String name,String phoneNo, String addr) {
		this.name=name;
		this.phoneNo=phoneNo;
		this.addr = addr;
	}
	public String toString() { //이름, 폰번호, 주소 보여줌
		return String.format("%s %s %s", name,phoneNo,addr);
	}
	public String getName() {
		return name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public String getAddr() {
		return addr;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo=phoneNo;
	}
	public void setAddr(String addr) {
		this.addr=addr;
	}
}
public class RenRakuEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		Member[] memberArr=new Member[20]; //배열생성
		int selectCount=0; //검색횟수(누적시킬것임)
		int count=0; //배열의 length가 될 것임(계속 누적하여 사용할 것)
		String selectName=null; //검색할 이름 초기화
		int deleteCount=0; //삭제하려했으나 일치하지 않아서 삭제못한 횟수
		
		BREAK:
		while(true) {
			System.out.println("===========================================");
			System.out.println("1.전화번호 추가 2.전화번호 조회 3.전화번호 삭제 4.전화번호 목록 5.프로그램 종료");
			System.out.println("===========================================");
			System.out.println("메뉴를 선택하세요>>");
			
			int menu = scan.nextInt(); //메뉴 숫자로 입력받음
			
			switch(menu) {
			case 1:
				System.out.println("이름, 전화번호, 주소 순으로 입력하세요");
				memberArr[count]= new Member(scan.next(), 
						scan.next(),scan.next()); //이름, 전화번호, 주소 순으로 입력받음
				count++;
				break;
			case 2:
				System.out.print("조회할 회원의 이름을 입력하세요>> ");
				selectName = scan.next(); //검색할 회원의이름을 selectName에 입력받음
				for(int i=0; i<count; i++) {
					if(selectName.equals(memberArr[i].getName())) {
						System.out.println(memberArr[i].toString());
						selectCount++; //검색할 회원의 이름이 memberArr[i]의 이름과 같다면 
						//그 멤버의 정보를 보여주고
						//selectCount++을 해줌.(검색한 회원이 일치한 횟수)
					} //못찾으면 어떻게출력하지..
				}
				if(selectCount==0) { //못찾았을 때 = 찾은 횟수가 0일때 (위에서 for문으로 다 찾았는데도
					//찾은횟수가 0인거니까
					System.out.println("존재하지 않는 회원입니다.");
				}
				break;
				
			case 3:
				System.out.println("삭제 회원의 이름을 입력하세요>> ");
				String deleteName=scan.next(); //삭제할 회원의 이름
				int checkCount = count; // count를 임시로 저장해둘 변수(왜 만들었냐면 밑에서 count를 --할거라
				//온전히 원래 만든 배열의 크기를 기억해놔야하기 때문
				for(int i=0; i<count; i++) { //count를 --하기 전이니까 memberArr.length만큼 돌아가는것
					if(deleteName.equals(memberArr[i].getName())) {
						//memberArr.remove(i); //특정 배열 요소값 삭제(?) ->이건 리스트에서만 사용가능하대 ㅠㅠ
						//memberArr.splice(i,1);
						count--; //만약에 찾으면 삭제하기보다는 count를 줄여서 검색범위를 좁힐 것임.
						for(int j=i; j<count; j++) {//삭제가 아니라 덮어씌우는 것이기 때문에
							memberArr[j]=memberArr[j+1]; //찾아진 데를 찾아진 index+1의 값으로 덮어씌운다
							//이게 무슨말이냐면 index가 0이라 치면 0번째 거를 1번째값으로 덮어씌우는것.
							//뒤에꺼를 앞에껄로 다 1칸씩 앞으로 한칸 이동시키는것임
							//그럼 n[j]번째 애는 결국 for문이 다 돌아간 후 맨 뒤로 이동이 되겠지??
							//근데 위에서 count--를 했기 때문에 맨 뒤 인덱스-1 까지만 앞으로 배열에 이용할것임
						}
						System.out.println("해당 멤버를 삭제하였습니다"); //사실 삭제된게 아니라 count로
						//삭제할배열꺼 바로 전까지만 읽는거 ㅋ
					}else
					deleteCount++; //삭제하려했으나 일치하지 않아서 삭제못한 횟수
					}
				if(deleteCount==checkCount) { //배열 끝까지 돈다고 생각을 하므로 삭제못한 횟수와 배열length가
					//같다면 존재하지 않는 회원입니다 출력
					//왜 count안썼냐면 위의 for문에서 --를 계속해줘서 count값이 원래 배열의 길이보다 작아져 
					//있기 땜에 checkCount라는 변수를 만들어서 사용해준 것
					System.out.println("존재하지 않는 회원입니다.");
				}
				break;
			case 4:
				System.out.printf("목록에 저장된 회원 수는 %d명입니다\n",count); //count수를 위에 case 3
				//애서 줄여놨으니 저장된 회원수를 count로 출력함
				for(int i=0; i<count; i++) { //이제 저장된 배열의 값을 보여준다
					System.out.println(memberArr[i].toString());
				}
				break;
			case 5:
				break BREAK; //라벨로 break된다
				
		}
	}

	}
}	
