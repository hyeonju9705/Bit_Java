package bit_java1103;

public class DefaultConstructor {

	int x;
	public void setX(int x) { this.x=x;}
	public int getX() { return x;}
	public DefaultConstructor(int x) {this.x=x;}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultConstructor p = new DefaultConstructor(100); //객체 생성,
		//필드들이 정수인 경우 0으로 초기화
		System.out.println("셋 하기 전"+p.getX());
		
		p.setX(3);
		System.out.println("셋 한 다음"+p.getX());
		

}
}
