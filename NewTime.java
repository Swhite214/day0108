package time;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

public class NewTime {
	//newTime
	LocalDateTime date1; //자바 8버전부터 제공하는 라이브러리 자동으로 지역을 선정 후 시간을 지정
	ZonedDateTime date2; //타임존 혹은 시차개념
	//이전 
	Date date; //조만간 없어질꺼니 쓰지마십시오
	public static void main(String [] args) {
		Calendar calendar = Calendar.getInstance();//이걸보고 스태틱메서드를 유추해야합니다.
		int year = calendar.get(Calendar.YEAR);
		System.out.println(year + "년");
		int month = calendar.get(Calendar.MONTH) + 1;
		System.out.println(month + "월");
		
		int dom = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println(dom+"일");
		
		Date date = new Date();
		System.out.println(date);
		date.setTime(date.getTime() + 1000*60*60*24); //시간타입은 보통 롱으로 제공
	}

}
