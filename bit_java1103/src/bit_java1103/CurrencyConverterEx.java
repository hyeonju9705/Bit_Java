package bit_java1103;
class CurrencyConverter{ //환율 변환 프로그램.. 원리가 너무어려움 복습필요
	private static double rate;
	public static double toDallar(double won) { //원을 입력받아서 달러로변환
		//한국 원화를 달러로 반환
		return 
		Math.round((won/rate)*100)/100.0; // 소수점 2자리 보여주기위해 math함수 이용
		//입력받은 won을 rate(1180원)로 나누면 결국 몇달라를 환율할 수 있을지 나오는 것이니 그걸 return 
	}
	public static double toKWR(double dollar) { //달러를 입력받아 원으로 변환
		//달러를 한국 원화로 변환
		return 
		Math.round((dollar*rate)*100)/100.0; // 환율 자체가 1달러당 1180원이라 곱해서 return
	}
	public static void setRate(double r) { //r이 환율인듯
		//환율 설정 kwr/$1
		rate=r; //환율을 뭘 기준으로 잡을지 정해야함. 나는 1달라당 1180.64원이니까
		//환율을 1180.64로 설정
	}
}
public class CurrencyConverterEx {

	public static void main(String[] args) {
		// 오늘 미국 달러 환율 적용
		CurrencyConverter.setRate(1180.64); //환율 설정
		CurrencyConverter.toDallar(1000000); //원을 달라로 계산
		CurrencyConverter.toKWR(100); //달라를 원으로 계산만
		System.out.println("백만원은 "+CurrencyConverter.toDallar(1000000)+"달라입니다.");
		System.out.println("백달러는 "+CurrencyConverter.toKWR(100)+"원입니다.");
	}

}
