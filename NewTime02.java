package time;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class NewTime02 {
	
	public static void main(String [] args) {
		
		String str = "19991121";
		int num = Integer.parseInt(str);//문자열인 숫자를 정수형으로
		System.out.println(num);
		
		int year = num/10000;
		int  month= num%10000/100;
		int day = num%100;
		
		System.out.println(year + "년" + month + "월" + day + "일");
	}
	
}
