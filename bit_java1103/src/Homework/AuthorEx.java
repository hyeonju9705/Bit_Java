package Homework;

import java.util.Scanner;

class Author{
	private String name;
	private String email;
	private String gender;
	
	public Author(String name, String email, String gender) {
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public String getName() {
		return name; //저자의 이름을 가져온다
	}
	public String getEmail() {
		return email; //이메일을 가져온다
	}
	public void setEmail(String email) {
		this.email=email; //이메일을 세팅해준다
	}
	public String getGender() {
		return gender; //성별을 가져온다
	}
	public String toString() {
		return String.format("Author[name=%s, email=%s, gender=%s]", getName(),
				getEmail(), getGender()); //author 필드 전부 출력
	}
}

class Book{
	private String title;
	private Author author; //author이라는 클래스를 참조하는것임 여기서 참조해주므로 우리는 걍 객체를 author.~로 쓸 수 있음
	private double price;
	private int qty; //수량
	
	public Book(String title, Author author, double price, int qty) {
		this.title=title;
		this.author=author; 
		this.price = price;
		this.qty = qty;
	}
	public String getTitle() {
		return title; //책 제목 가져오기
	}
	public Author getAuthor() {
		return author; //author class 가져오기
	}
	public double getPrice() {
		return price; //가격 가져오기
	}
	public void setPrice(double price) {
		this.price=price; //가격 세팅하기
	}
	public int getQty() {
		return Math.round(qty*10)/10; //수량 가져오기
	}
	public void setQty(int qty) { //수량 세팅하기
		this.qty=qty;
	}
	public String toString() { //book정보 출력
		return "Book[name="+getTitle()+", "+author.toString()+
				" price="+getPrice()+ ", qty="+getQty()+ "]";
	}
}
public class AuthorEx {

	public static void main(String[] args) {
		// 전체 도서 수량 qty
		// 실행시키면 메뉴가 뜬다.
		// 5개의 메뉴 구현 필수
		// 1. 도서정보 입력(작가에대한정보)
		// 2. 
		// 3. 책이있는지없는지 확인 ,있다면 출력 (제목 입력받음)
		// 4. 수량 정보를 확인하는데 (여성작가수량/보유도서수량) 형태로 출력
		// 5. 프로그램 종료
		
		//while문 안에 메뉴띄워주는걸 너허야할듯
		// 메뉴선택은 switch문
		// class 2개 가지고 만들어야함

		
//		int index=0;
//		Book[] bArray = new Book[20];
		
		Scanner scan = new Scanner(System.in); //스캐너 생성
		int menu =0; //사용자가 누르는 메뉴 버튼
		int count =0; //계속 while문이 돎으로 while문 안에서 1번을 눌러서 배열을 생성할 때마다 count를 i처럼 사용해서 배열에 넣어주는것임. 
		// count가 결국 배열의 length로도 사용가능함
		Book[] bookArr=new Book[20];
		
		BREAK: // 프로그램 종료시 무한루프 탈출 : 라벨
		while(true) {
			System.out.println("1. 도서 정보 입력 | 2. 도서 목록 보기 | 3. 검색하기(제목) |"
					+ "4. 수량정보(여성작가수량/보유도서수량) | 5. 프로그램 종료");
			menu = scan.nextInt(); //메뉴 숫자로 입력받음
			
			switch(menu) {
			case 1: //도서정보입력
				System.out.println("책제목, 저자, 이메일, 성별, 가격, 수량 순으로 입력하시오 -->>");
				//배열에 저장
				bookArr[count]= new Book(scan.next(), 
							new Author(scan.next(),scan.next(),scan.next()),
							scan.nextDouble(),scan.nextInt()); // 책제목은 book 클래스 필드에있어서 입력받지만, 저자,이메일,성별은 author클래스에 있어서
				//author을 new로 해줌. 그리고 가격,수량을 입력받음
				count++; // 1 누를때 딱 한번만 입력받기때문에 count++하자마자 바로 break 돌아간다
				break;
			case 2:	 // 도서 목록 보기 --> 저장된 내용 불러와서 출력
				for(int i =0; i<count; i++) { //count가 배열의 length처럼됐기때문에 count로 사용
				System.out.println(bookArr[i].toString()); //배열 i부터 쫙 반복적으로 출력해줌 (도서목록을 봐야되므로)
				}
				break;
			case 3:	// 검색하기
				System.out.println("제목을 입력하세요 -->> ");
				String titleInput = scan.next(); //검색한 값이랑 원래 있는 책의 제목이랑 비교해야되므로 검색한 값을 입력받을 변수 생성
				for(int i=0; i<count; i++) {
					if (titleInput.equals(bookArr[i].getTitle())) { //문자열을 비교해야되니까 equals사용, 입력받은 변수랑 전체도서중에서 책 이름을 다 비교해줘야하므로
						//bookArr[i].getTitle()사용
					System.out.println(bookArr[i].toString()); //titleInput과 원래 배열안에있는 책이름이 일치한다면 책 정보를 출력해준다!
					}
				}
				break;
			case 4:	 //수량정보(여성건수/전체건수)
				int numberOfFemale=0; //여성 건수를 일단 만들어주고 0으로 초기화함
				for(int i=0; i<count; i++) {
					if (bookArr[i].getAuthor().getGender().equals("f")) { //author당 gender가 다 다르기때문에 bookArr의 저자를 가져와주는데 gender는 author class에만 있으므로
						//getGender()도 필요함. 이후에 equals로 여성임을 표시하는 f를 비교!
						numberOfFemale++; // 동등하다면 ++해줘서 수 늘려줌
					}
				}
				System.out.println("여성작가도서/총보유도서 : ("+numberOfFemale+"/"+
				count+")"); //for문이 끝난 후에 여성 건수를 가져와줌.
				break;
			case 5:	//프로그램 종료
				break BREAK;
			}
		}
	}

}
