package Homework;

public interface GeneralBook{
	public int size(String[] names); //저장되어있는 데이터 길이 반환
	public String names();
	public String records();
	public boolean nameExist(String name);
	public void add(String name, String record);
	public void remove(String name, String record);
	public String[] get(String name);
	public String find(String record);
	public void print();
}

class ArrayedGeneralBook implements GeneralBook{
	private String[] names;
	private String[] records;
	
	public ArrayedGeneralBook(String[] names, String[] records) {
		this.names=names;
		this.records=records;
	}
	public int size(String[] names) {
		return names.length;//저장되어있는 데이터 길이 반환
	}
	public String names() { //저자 이름을 저장하고 있는 배열의 내용을 문자열로 연결 후 반환
		String returnName=""; //return할 값이 String이어야하기때문에 새로운 변수 선언해줌..ㅠㅠ
		for(String n : names) { // names의 배열의 갯수를 모르니까 이렇게 설정. 알아서 names의 개수만큼
			//for문 돌려줌
			n+=" ";
			returnName+=n;
		}
		return returnName; //모르게따,,
		}
	@Override
	public String records() { //record도 저장시킴
		String returnRecord="";
		for(String s : records) {
//			s+=" ";
			returnRecord+=s;
		}
		return returnRecord;
	}
	@Override
	public boolean nameExist(String name) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void add(String name, String record) {
		//목록에 없는 이름과 기록을 입력받아 리스트에 추가
		//(같은 이름이 존재하면 추가하지 않고 메시지 출력, 결과는 항상 이름을 기준으로 오름차순으로 추가)
		//int count=names.length-1;
		for(int i=0; i<names.length; i++) {//같은 이름이 있는지 검색해줌
			if(names[i].equals(name)) {
				System.out.println("같은 이름이 이미 존재합니다.");
				break;
			}	
		}
		
		String[] stringTemp=new String[names.length+1]; //names보다 배열의 크기가 1 큰 배열 생성
		//자바는 중간에 배열의 크기를 바꾸는게안된다고 함..ㅋㅋ
		//그래서 우리는 다시 temp에다가 names의 값을 복사해줄것임...ㅜㅜ
		for(int i=0; i<names.length; i++) {
			stringTemp[i]=names[i]; //name의 index까지만 일단 stringTemp에 저장
		}
		stringTemp[stringTemp.length-1]=name; //이름 마지막 인덱스에 넣어줬음.
		
		String[] stringTemp2=new String[records.length+1];
		for(int i=0; i<records.length; i++) { //record의 index까지만 일단 stringTemp에 저장
			stringTemp2[i]=records[i]; //records 복사
		}
		records[records.length-1]=record; //레코드도 마지막 인덱스에 넣어줫고
		//이제 오름차순 해야함...ㅠㅠ
		String temp=null;
		for(int i=0; i<stringTemp.length; i++) { //0~3만큼 도는거구ㅗ = 4번
			for(int j=i; j<stringTemp.length; j++) { //1~3번 도는거지 =3번
			//int compare=names[i].compareTo(names[j]);
			if(names[i].compareTo(names[j])>0) { //i가 j보다 뒤에있어야하면
				temp=names[i];
				names[i]=names[j];
				names[j]=temp; //i랑 j랑 자리를 바꿔준다.
				
				//똑같이 records의 값도 인덱스가 바껴야하므로
				temp=records[i];
				records[i]=records[j];
				records[j]=temp;
			}
			}
		}
	}
	@Override
	public void remove(String name, String record) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String[] get(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String find(String record) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
}
public class GeneralBookEx {

	public static void main(String[] args) {
		// add가 발생하면 이름을 기준으로 오름차순을 해야한다. add가 발생하면 무조건 정렬이됨
		//레코드 중ㄱ복 가능, 이름은 중복 허용 xx
		// record를 가지고 이름 여러개가 발견되면 그걸 그대로 리턴
		//print를 하면 
		// names라는 
		// 배열의 길이는 항상 정확하게 저장되어있는 정보의 수와 일치되어야함
		
		//컬렉션,arrays 함수 쓰지말고 전부 for문 써서하기
		String[] names= {"Sam","Rhee","Kim"};
		String[] records= {"1111","2222","3333"};
		ArrayedGeneralBook gb = new ArrayedGeneralBook(names,records);
		System.out.println(gb.names()); //Sam Rhee Kim 출력
		
		gb.add("Allan", "4444");
		gb.print();
		//Allan4444
		//Kim3333
		//Rhee2222
		//Sam1111
//		System.out.println("현재 저장된 데이터의 크기 : "+gb.size(names));
//		gb.add("Ajex", "5555");
//		System.out.println("현재 저장된 데이터의 크기 : "+gb.size());
//		gb.print();
//		//Allex5555
//		//Allan4444
//		//Kim3333
//		//Rhee2222
//		//Sam1111
//		System.out.println(gb.nameExist("Ajex")); //true
//		gb.remove("Ajex", "5555");
//		gb.remove("Sam", "1111");
//		gb.print();
//		//Allan4444
//		//Kim3333
//		//Rhee2222
//		String foundName = gb.find("4444");
//		System.out.println(foundName); //Allan
	}

}
