package bit_java1108;
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
public class MemberEx {

	public static void main(String[] args) {
		Member[] mArr= {
				new Member("conan", "010-1111-1111", "Mirans"),
				new Member("rose", "010-2222-2222", "Browns"),
				new Member("miran", "010-3333-3333", "Mirans")
				};
		System.out.println("3명의 데이터를 저장한 다음 리스트 출력 결과");
		for(Member mem : mArr) // 3명의 멤버를 mem 변수에 저장하고 출력해줌
			System.out.println(mem);
		Member[] tempArr = new Member[mArr.length+1]; //삽입을 하기 위해서는 mArr보다 1 큰 배열이 필요
		for(int i=0; i<mArr.length; i++) {
			tempArr[i]=mArr[i]; //임시 배열에 복사
		}
		int targetIndex = 0; //삽입 위치 , 맨 마지막에 추가하려고 한다면 이동이 발생하지 않으므로 밑의 코드로는 실행못함
		if(targetIndex < mArr.length) { //이동이 발생하는 조건
			for(int i=mArr.length; i>=0; i--) { //0의 위치에 멤버를 삽입하기 위해서 요소들을 뒤로 이동
				if(i==targetIndex-1) continue; //삽입하고 싶은 위치(targetIndex)가 i보다 1작다면 계속 진행
				else if(i>targetIndex) tempArr[i]=mArr[i-1]; //삽입의 위치 뒤에 있는 요소들을 뒤로 이동 (tempArr의 길이를 한칸을 늘려놨으니까
				// 앞에 삭제할 자리를 추가해야하기때문에 targetIndex보다 뒤에잇는 놈들을 한칸씩 뒤로 이동시킴
				else tempArr[i]=mArr[i]; //삽입의 위치 앞에 있는 요소들을 그대로 복사
			}
			//삽입하고 싶은 인덱스 자리는 null이 되고 나머지는 다 차있을것임
			tempArr[targetIndex] = new Member("kid", "010-4444-4444", "unkown");
		}
		mArr = tempArr; //객체 배열 참조
		System.out.println("------------------------------");
		System.out.printf("인덱스 %d의 위치에 카드를 삽입을 한 다음 리스트 출력 결과\n", targetIndex);
		for(Member mem : mArr)
			System.out.println(mem);
		}
	

}
