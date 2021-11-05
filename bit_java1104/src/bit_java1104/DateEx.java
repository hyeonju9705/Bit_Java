package bit_java1104;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		SimpleDateFormat sdf =
				new SimpleDateFormat("yyyy년 MM월 dd hh시 mm분 ss초");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
		
		Calendar today = Calendar.getInstance();
		System.out.println(today.get(Calendar.YEAR));
		System.out.println(today.get(Calendar.MONTH)+1);
		//일, 요일, 시간, 분
		System.out.println(today.get(Calendar.DATE));
		System.out.println(today.get(Calendar.HOUR));
		System.out.println(today.get(Calendar.MINUTE));
		
		int yoil=today.get(Calendar.DAY_OF_WEEK);
		
		switch(yoil) {
		case 1:
			System.out.println("일요일");
			break;
		case 2:
			System.out.println("월요일");
			break;
		case 3:
			System.out.println("화요일");
			break;
		case 4:
			System.out.println("수요일");
			break;
		case 5:
			System.out.println("목요일");
			break;
		case 6:
			System.out.println("금요일");
			break;
		case 7:
			System.out.println("토요일");
			break;
			
		}
		
		today.clear();
		today.set(2019,11,25);
		today.set(Calendar.HOUR_OF_DAY, 20);
		today.set(Calendar.MINUTE, 30);
		System.out.println(today.getTime());
	}

}
