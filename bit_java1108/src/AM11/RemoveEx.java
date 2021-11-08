package AM11;

class Member{
	private String name;
	private String phoneNo;
	private String addr;
	
	public Member(String name, String phoneNo, String addr) {
		this.name=name;
		this.phoneNo=phoneNo;
		this.addr=addr;
	}
	public String toString() {
		return String.format("%s %s %s", getName(), getPhoneNo(),getAddr());
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
	public void remove() {
		
	}
}
public class RemoveEx {

	public static void main(String[] args) {
		Member[] mArr= {
				new Member("conan", "010-1111-1111", "Mirans"),
				new Member("rose", "010-2222-2222", "Browns"),
				new Member("miran", "010-3333-3333", "Mirans")
				};
		System.out.println("3명의 데이터를 저장한 다음 리스트 출력 결과");
		for(Member mem : mArr) // 3명의 멤버를 mem 변수에 저장하고 출력해줌
			System.out.println(mem);
		Member[] tempArr = new Member[mArr.length-1]; //데이터ㅜ 하나 삭제할꺼니까 이렇게만든다
		
		
		int targetIndex = 0; //삭제 위치 , 맨 마지막에 추가하려고 한다면 이동이 발생하지 않으므로 밑의 코드로는 실행못함
		
		
		for(int i=0; i<mArr.length; i++) {
			tempArr[i]=mArr[targetIndex+1]; //삭제한 거 빼고 임시 배열에 복사
		}//여기까지함..
		
		if(targetIndex < mArr.length) { //이동이 발생하는 조건
			for(int i=targetIndex; i<tempArr.length; i++) { //0의 위치에 멤버를 삭제하고 요소들을 앞으로 이동, null 한것은 맨뒤로이동시킴
					tempArr[i]=tempArr[i+1]; //초기화한 곳이 맨 뒤로왔음
				}
		}
		mArr = tempArr; //객체 배열 참조 --> ㅇㅣ건 무슨역할??
		for(int i=0; i<mArr.length; i++) {
			mArr[i]=tempArr[i];
		}
		System.out.println("------------------------------");
		System.out.printf("인덱스 %d의 위치에 카드를 삽입을 한 다음 리스트 출력 결과\n", targetIndex);
		for(Member mem : mArr)
			System.out.println(mem);

	}

}
